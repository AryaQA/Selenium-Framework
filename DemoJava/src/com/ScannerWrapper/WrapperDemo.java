package com.ScannerWrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var_01 = 1123;//primitive

		//var_01.

		 Integer var_2 = var_01;//Autoboxing the data


		 //var_2// this is object now Integer

		int var_04 = var_2.intValue();

		String var_3 = var_2.toString();

		int var_06 = Integer.parseInt(var_3);
		 //unboxing

		// System.out.println(var_2.toString());

	}

}
