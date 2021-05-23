package com.day;

public class Exception {

	public static void main(String[] args) {

		try {
			
			String data = null;
			String[] data2 = {"lee"};
//			System.out.println(data.toString());
			System.out.println(data2[3]);
			

		} catch (NullPointerException e) {
			System.out.println("Error_nullpointer");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error_index");
		}
	}

}
