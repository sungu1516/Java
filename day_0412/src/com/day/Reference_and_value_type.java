package com.day;

public class Reference_and_value_type {

	public static void main(String[] args) {
		// ����Ÿ�԰� ����Ÿ��
		int[] a = {100, 200}; // �ʱ�ȭ�ؼ� ù ° ���� 100����

		toString_test(a); // �Ʒ����� ������ �Լ��� ���. �� ��, a�� �迭�̹Ƿ� a�� �ּҸ� �־��ִ� ���̴�.
		System.out.println("�迭�Դϴ�. : " + a[0]); // ����Ÿ���� �迭�� �Լ��� ���ڷ� �־��־��� ������ ���� �迭�� ���� �ٲ��.
		toString_test(a[0]); // ���� �ٸ��� valueŸ���� �־��ش�. �̴� �� �Լ��� ���ڷ� a[0]�� �ش��ϴ� ������ �־��ִ� ���� �ǹ��Ѵ�.
		System.out.println("value�Դϴ�. : " + a[0]); // ���� �迭�� ���� ������ �ʴ´�.

	}

	static int toString_test(int[] n) {

		n[0] = 500;
		return n[0];
	}

	static int toString_test(int n) {
		n = 1000;
		return n;
	}
}
