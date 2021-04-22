package com.day;

import java.util.ArrayList;

public class Sol_standard {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<I>> list_2 = new ArrayList<ArrayList<I>>();
		ArrayList<I> list = new ArrayList<I>();
		A a = new A();
		B b = new B();
		C c = new C();

		list.add(a);
		list.add(b);
		list.add(c);

		for (int i = 0; i < list.size(); i++) {
			ArrayList<I> list_a = new ArrayList<I>();
			for (int j = 0; j < list.get(i).getLength(); j++) {
				if (i == 0) {
					I a2 = new A(j);
					list_a.add(a2);
				} else if (i == 1) {
					I b2 = new B(j);
					list_a.add(b2);
				} else {
					I c2 = new C(j);
					list_a.add(c2);
				}
			}
			list_2.add(list_a);
		}
		for (int i = 0; i < list_2.size(); i++) {
			for (int j = 0; j < list_2.get(i).size(); j++) {
				System.out.println(list_2.get(i).get(j).getList());
			}System.out.println("**************************************************************************");
		}

	}
}
