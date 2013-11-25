package com.mobile.lab1;

public class BaseConvertor {

	public String sourceBase;
	public String desBase;
	public String number;

	public BaseConvertor(String sourceBasePara, String desBasePara,
			String numberPara) {
		this.sourceBase = sourceBasePara;
		this.desBase = desBasePara;
		this.number = numberPara;
	}

	public String getNumber() {
		
		if (this.sourceBase.equals(new String("DEC"))
				&& this.desBase.equals(new String("DEC"))) {
			return this.number;
		} else if (this.sourceBase.equals(new String("DEC"))
				&& this.desBase.equals(new String("BIN"))) {
			return Integer.toBinaryString(Integer.parseInt(this.number));
		} else if (this.sourceBase.equals(new String("DEC"))
				&& this.desBase.equals(new String("OCT"))) {
			return Integer.toOctalString(Integer.parseInt(this.number));
		} else if (this.sourceBase.equals(new String("DEC"))
				&& this.desBase.equals(new String("HEX"))) {
			return Integer.toHexString(Integer.parseInt(this.number));
		}
		
		if (this.sourceBase.equals(new String("BIN"))
				&& this.desBase.equals(new String("BIN"))) {
			return this.number;
		} else if (this.sourceBase.equals(new String("BIN"))
				&& this.desBase.equals(new String("DEC"))) {
			return Integer.toString(Integer.parseInt(this.number, 2));
		} else if (this.sourceBase.equals(new String("BIN"))
				&& this.desBase.equals(new String("OCT"))) {
			return Integer.toOctalString(Integer.parseInt(this.number, 2));
		} else if (this.sourceBase.equals(new String("BIN"))
				&& this.desBase.equals(new String("HEX"))) {
			return Integer.toHexString(Integer.parseInt(this.number, 2));
		}
		
		if (this.sourceBase.equals(new String("OCT"))
				&& this.desBase.equals(new String("OCT"))) {
			return this.number;
		} else if (this.sourceBase.equals(new String("OCT"))
				&& this.desBase.equals(new String("DEC"))) {
			return Integer.toString(Integer.parseInt(this.number, 8));
		} else if (this.sourceBase.equals(new String("OCT"))
				&& this.desBase.equals(new String("BIN"))) {
			return Integer.toBinaryString(Integer.parseInt(this.number, 8));
		} else if (this.sourceBase.equals(new String("OCT"))
				&& this.desBase.equals(new String("HEX"))) {
			return Integer.toHexString(Integer.parseInt(this.number, 8));
		}
		
		if (this.sourceBase.equals(new String("HEX"))
				&& this.desBase.equals(new String("HEX"))) {
			return this.number;
		} else if (this.sourceBase.equals(new String("HEX"))
				&& this.desBase.equals(new String("DEC"))) {
			return Integer.toString(Integer.parseInt(this.number, 16));
		} else if (this.sourceBase.equals(new String("HEX"))
				&& this.desBase.equals(new String("BIN"))) {
			return Integer.toBinaryString(Integer.parseInt(this.number, 16));
		} else if (this.sourceBase.equals(new String("HEX"))
				&& this.desBase.equals(new String("OCT"))) {
			return Integer.toOctalString(Integer.parseInt(this.number, 16));
		}
		
		return "Cannot Convert: " + this.number;
	}

}
