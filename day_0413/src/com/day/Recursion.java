package com.day;

public class Recursion {

	public static void main(String[] args) {
		test_1(10);

	}

	static int test_1(int c) {
		System.out.println(c);
		// for �� ������� �ʰ� �ݺ��� Ż���ϱ� - ����Լ� ���
		if (c == 0) // Ż���� ���� if�� �־��ش�.
			return 0;
		else {
			return test_1(--c);
		}
	}

	static void test_2(int c) {
		System.out.println(c);
		// for���� ������� �ʰ� �ݺ� �������� - ����Լ� ���2
		if (c == 0) // Ż���� ���� if�� �־��ش�.
			return;
		else
			test_2(--c);
	}

	static void test_eternal() {
		// ����Լ��� ����
		System.out.println("test");
		test_eternal();
	}

}
