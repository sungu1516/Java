package com.day;

public class Char_array {

	public static void main(String[] args) {
		return_char();
	}

	static void return_char() {
		// String �ڷ������� ���� �ϳ��ϳ��� ������ char �迭 ����� & contains �޼����� ���

		String text = "helloworld";
		char[] cs = new char[text.length()];
		for (int i = 0; i < cs.length; i++) {
			cs[i] = text.charAt(i);
			if (text.contains("ll")) { // equals�� �ٸ��� ���ڿ����� �Ϻΰ� ���ԵǴ°��� �����.
				System.out.println("test");
			}
		}
		System.out.println(cs);
	}

}
