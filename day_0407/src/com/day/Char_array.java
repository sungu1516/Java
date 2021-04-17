package com.day;

public class Char_array {

	public static void main(String[] args) {
		return_char();
	}

	static void return_char() {
		// String 자료형에서 문자 하나하나를 가져와 char 배열 만들기 & contains 메서드의 사용

		String text = "helloworld";
		char[] cs = new char[text.length()];
		for (int i = 0; i < cs.length; i++) {
			cs[i] = text.charAt(i);
			if (text.contains("ll")) { // equals와 다르게 문자열에서 일부가 포함되는가를 물어본다.
				System.out.println("test");
			}
		}
		System.out.println(cs);
	}

}
