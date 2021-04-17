package com.day;

public class Transfer_str_to_chararr {

	public static void main(String[] args) {

		// 여러개의 단어(문자열)가 담긴 array에서 글자 하나하나를 가져오기

		String texts = "hello;world;test;count";
		String[] array_string = texts.split(";");
		char[][] c_text = new char[array_string.length][]; // 글자 하나하나 넣기 위해 char 배열 만들어주기

		// char 하나하나 넣어주기
		for (int i = 0; i < array_string.length; i++) {
			c_text[i] = new char[array_string[i].length()]; // 각 1차배열의 크기(단어 길이)를 설정해준다.
			for (int j = 0; j < array_string[i].length(); j++) {
				c_text[i][j] = array_string[i].charAt(j);
			}
		}

		// 단어 출력 - 2가지 방법a
		for (int i = 0; i < c_text.length; i++) {
			System.out.println(c_text[i]);
		}
		System.out.println();

		for (int i = 0; i < c_text.length; i++) {
			for (int j = 0; j < array_string[i].length(); j++) {
				System.out.print(c_text[i][j]);
			}
			System.out.println("");
		}

	}

}
