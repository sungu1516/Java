package com.day;

import java.util.Iterator;

public class Day_0412 {

	static void arr2d_basic() {
		// 2���迭

		int[][] array = new int[3][]; // array��� 2�� �迭 �ȿ� �ּҸ� ������ ������ 3�� �����.

		array[0] = new int[3]; // �̴� ���� ���� 1�� �迭�� 3�� ����� ���� �ǹ��Ѵ�. ������ �ܼ��� ���� �ٸ� 1���迭 3���� ����� �Ͱ��� �ٸ���.

		array[1] = new int[3]; // 2�� �迭�� ���� 3���� �迭�� ����� ���� ������, ������ for���� ���� ���� �� �����ϰ� �迭�� ���� ������ �� �ִٴ� ���̴�.
		array[2] = new int[3]; // ����Ÿ���̴�.

		array[0][0] = 100; // �̴� ���� �ϳ��ϳ� ����. �Ʒ��� ���� for���� ���� �����ϰ� �Է� ����.
		array[0][1] = 200; // ����Ÿ���̴�.
		array[0][2] = 300;

		array[1][0] = 100;
		array[1][1] = 200;
		array[1][2] = 300;

		array[2][0] = 100;
		array[2][1] = 200;
		array[2][2] = 300;

		// for������ 2���迭�� �� ����
//		System.out.println(array);               // ���� ���� �迭�� 2�� �迭�� �ּ�. �迭�� �迭���� ���� 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
//				array[i][j] = (j+1)*100;
//				System.out.println(array[i]);                    // �̴� �ּҸ� �����ϴ� ����. ���� ���� �迭�� 1���迭�� �ּҸ� �ǹ��Ѵ�. 
//				System.out.println(array[i][j]);                 // �̴� ������ �����ϴ� ���� 
			}
		}
	}

	static String text_f() {
		return "helloworld";
	}

	public static void main(String[] args) {

		// String Ÿ�� ���� �迭�̶�� ���� �����ϸ�, ���� ������ �����غ���.

		String text = text_f();

		String text2 = "helloworld";
		String text3 = new String("helloworld");
		String text4 = text; // �� ��� text�� �ּҸ� �״�� text4�� �Ѱ��ش�.

		if (text_f() == text4) // string�� ��� ����Ÿ���� �����̱� ������, value�� ���ϴ� ���� �ƴ϶� �ּҸ� ���ϰ� �ȴ�.
			System.out.println("�� �ּҰ� ����");
		else
			System.out.println("�ּҰ� �ٸ���");

	}

}
