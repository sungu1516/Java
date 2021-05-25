package com.day;

public class Test {

	public void sayNick(String nick) throws FoolException {

		if ("fool".equals(nick)) {
			throw new FoolException();
		}

	}

	public static void main(String[] args) {
		Test test = new Test();
		try {
			test.sayNick("fool");
			test.sayNick("genious");
		} catch (FoolException e) {
			System.out.println("Foolexception ¹ß»ý");
		}

	}

}
