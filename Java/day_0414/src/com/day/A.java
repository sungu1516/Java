package com.day;

public class A implements i_interface {

	// i_interface �� ��� �κ��� ���� ������, �ٵ� �κ��� ���� �ǹ��� ����. ���� ���� ������ ����.
	// ���� �����÷��̽� �κп� ��尡 �ִٸ� �ٵ� �κ��� ������� �ǹ��� �ִ�.

	// ������ �����. Ŭ������ �̸��� ���� �����.
	// ����, �ڹٴ� �����ڰ� ���� ��쿡�� �˾Ƽ� defalt�� �����ڸ� ������ش�. �Ʒ��� �ڵ�� ����Ʈ���� ���̴�. ������ �̹� Ư��
	// �����ڸ� ���� ���, ����Ʈ���� �������.���� ����� ���� ���� ����.
	public A() {
		for (int i = 3; i < 4; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i * j);
			}
		}
	}

	public A(int n) {
		for (int i = n; i < n+1; i++) {
			for (int j = 1; j < n+1; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i * j);
			}
		}
	}
	
	public A(String n) {
		System.out.println(n + "������");
	}

	@Override // ���⼭ �������̵��� �ǹ�? - i_interface��� �������̽��� ��带 �����ͼ�, �ٵ� �κ��� �� Ŭ���� ������ �ۼ��� �� ��.
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("test_a");
	}

}
