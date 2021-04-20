package com.day;

import java.util.ArrayList;

public class Interface_Polymorphism {

	public static void main(String[] args) {
		ArrayList<I> list = new ArrayList<I>(); // �Ʒ��� a,b ��ü�� ��� �ֱ� ���� I�� �޴´�.

		A a = new A();
		B b = new B();
		C c = new C();

		list.add(a);
		list.add(b);
		list.add(c);

		// ������

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).GetList().size());
			for (int j = 0; j < list.get(i).GetList().size(); j++) {
				System.out.println(list.get(i).GetList().get(j));
			}
			System.out.println();
			// System.out.println(a.GetList().get(i));
			// System.out.println(b.GetList().get(i)); // b�� ����Ʈ�� ���̴� 1�̱� ������ ����
		}

		// a.test();
		// b.test();

		print_test(c);
	}

	static void print_test(I a) { // I�� �������� ���� �ϳ��� �޼��带 ���� ���� Ŭ������ ���� ����
		for (int i = 0; i < a.GetList().size(); i++) {
			System.out.println(a.GetList().get(i));
		}
	}

}
