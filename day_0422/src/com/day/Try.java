package com.day;

public class Try {

	public static void main(String[] args) {
		try {
			int number = 100;
			System.out.println(number / 0); // 0���� ������ ������ ����.

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
