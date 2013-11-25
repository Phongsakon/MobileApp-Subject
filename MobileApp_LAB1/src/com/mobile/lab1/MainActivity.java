package com.mobile.lab1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button btnDec, btnBin, btnOct, btnHex;
	private EditText inputEdtxt, resulEdtxt;
	private Spinner selectSpinner;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		setWidget();

		View.OnClickListener onClick = new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				InputMethodManager imm = (InputMethodManager) v.getContext()
						.getSystemService(Context.INPUT_METHOD_SERVICE);
				imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

				if (inputEdtxt.getText().toString().length() > 0) {

					if (inputEdtxt.getText().toString().matches("[0-9]+")
							&& selectSpinner.getSelectedItem().toString()
									.equals("DEC")) {

						if (v == btnDec) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"DEC", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}
						if (v == btnBin) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"BIN", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}
						if (v == btnOct) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"OCT", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}
						if (v == btnHex) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"HEX", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}

					}

					else if (inputEdtxt.getText().toString().matches("[0-1]+")
							&& selectSpinner.getSelectedItem().toString()
									.equals("BIN")) {

						if (v == btnDec) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"DEC", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}
						if (v == btnBin) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"BIN", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}
						if (v == btnOct) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"OCT", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}
						if (v == btnHex) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"HEX", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}

					}

					else if (inputEdtxt.getText().toString().matches("[0-7]+")
							&& selectSpinner.getSelectedItem().toString()
									.equals("OCT")) {

						if (v == btnDec) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"DEC", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}
						if (v == btnBin) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"BIN", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}
						if (v == btnOct) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"OCT", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}
						if (v == btnHex) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"HEX", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}

					}

					else if (inputEdtxt.getText().toString()
							.matches("[a-f0-9]+")
							&& selectSpinner.getSelectedItem().toString()
									.equals("HEX")) {

						if (v == btnDec) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"DEC", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}
						if (v == btnBin) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"BIN", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}
						if (v == btnOct) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"OCT", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}
						if (v == btnHex) {
							BaseConvertor base = new BaseConvertor(
									selectSpinner.getSelectedItem().toString(),
									"HEX", inputEdtxt.getText().toString());
							resulEdtxt.setText(base.getNumber());
						}

					}
					
					else {
						Toast.makeText(
								MainActivity.this,
								"Input invalid "
										+ selectSpinner.getSelectedItem()
												.toString() + " format",
								Toast.LENGTH_SHORT).show();
						inputEdtxt.setText("");
						resulEdtxt.setText("");
					}
				}

				else if (inputEdtxt.getText().toString().length() == 0) {
					Toast.makeText(MainActivity.this,
							"Please input number to convert.",
							Toast.LENGTH_SHORT).show();
				}

			}
		};

		btnBin.setOnClickListener(onClick);
		btnDec.setOnClickListener(onClick);
		btnOct.setOnClickListener(onClick);
		btnHex.setOnClickListener(onClick);

	}

	private void setWidget() {
		btnDec = (Button) findViewById(R.id.decBtn);
		btnBin = (Button) findViewById(R.id.binBtn);
		btnOct = (Button) findViewById(R.id.octBtn);
		btnHex = (Button) findViewById(R.id.hexBtn);
		selectSpinner = (Spinner) findViewById(R.id.selectSpinner);
		resulEdtxt = (EditText) findViewById(R.id.resultEditTxt);
		inputEdtxt = (EditText) findViewById(R.id.inputEditTxt);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.baseString, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		selectSpinner.setAdapter(adapter);

	}

}
