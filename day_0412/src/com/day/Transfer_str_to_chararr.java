package com.day;

public class Transfer_str_to_chararr {

	public static void main(String[] args) {

		// �������� �ܾ�(���ڿ�)�� ��� array���� ���� �ϳ��ϳ��� ��������

		String texts = "hello;world;test;count";
		String[] array_string = texts.split(";");
		char[][] c_text = new char[array_string.length][]; // ���� �ϳ��ϳ� �ֱ� ���� char �迭 ������ֱ�

		// char �ϳ��ϳ� �־��ֱ�
		for (int i = 0; i < array_string.length; i++) {
			c_text[i] = new char[array_string[i].length()]; // �� 1���迭�� ũ��(�ܾ� ����)�� �������ش�.
			for (int j = 0; j < array_string[i].length(); j++) {
				c_text[i][j] = array_string[i].charAt(j);
			}
		}

		// �ܾ� ��� - 2���� ���a
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
