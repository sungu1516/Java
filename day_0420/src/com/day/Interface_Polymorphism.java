package com.day;

import java.util.ArrayList;

public class Interface_Polymorphism {

	public static void main(String[] args) {
		ArrayList<I> list = new ArrayList<I>(); // 아래의 a,b 객체를 모두 넣기 위해 I를 받는다.

		A a = new A();
		B b = new B();
		C c = new C();

		list.add(a);
		list.add(b);
		list.add(c);

		// 다형성

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).GetList().size());
			for (int j = 0; j < list.get(i).GetList().size(); j++) {
				System.out.println(list.get(i).GetList().get(j));
			}
			System.out.println();
			// System.out.println(a.GetList().get(i));
			// System.out.println(b.GetList().get(i)); // b의 리스트의 길이는 1이기 때문에 오류
		}

		// a.test();
		// b.test();

		print_test(c);
	}

	static void print_test(I a) { // I의 다형성에 의해 하나의 메서드를 통해 여러 클래스에 접근 가능
		for (int i = 0; i < a.GetList().size(); i++) {
			System.out.println(a.GetList().get(i));
		}
	}

}
