package com.day;

import java.util.Iterator;

public class Gugudan {
	// �����ε��� ���� �������� ������ �� �ִ� �پ��� �޼��带 ������. 
	
	// �ܼ��� �����ϸ� 2�ܺ��� 9�ܱ��� ������ִ� �Լ�
	public void Gugudan_method() {
		for (int i = 2; i < 10; i++) {

			Gugudan_inner gugudan = new Gugudan_inner(i);

			System.out.println("*******************");

		}
	}

	// ���ڰ����� ���ڸ� ������ 2�ܺ��� �ش� �ܱ����� ������ִ� �Լ�
	public void Gugudan_method(int n) {
		for (int i = 2; i < n + 1; i++) {

			Gugudan_inner gugudan = new Gugudan_inner(i);

			System.out.println("*******************");

		}
	}

	// �� ���� ��Ʈ���� �޾�, �� ������ ���� ������ִ� �Լ�
	public void Gugudan_method(int n, int m) {
		for (int i = n; i < m + 1; i++) {

			Gugudan_inner gugudan = new Gugudan_inner(i);

			System.out.println("*******************");

		}
	}
}
