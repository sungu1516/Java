package com.day;

import java.util.ArrayList;

public class Sol_2d_list {

	public static void main(String[] args) {
		ArrayList<ArrayList<I>> list_2 = new ArrayList<ArrayList<I>>();
		ArrayList<Integer> le_list = new ArrayList<Integer>();

		A a = new A();
		B b = new B();
		C c = new C();

		le_list.add(a.getLength());
		le_list.add(b.getLength());
		le_list.add(c.getLength());

		for (int i = 0; i < le_list.size(); i++) {
			ArrayList<I> list = new ArrayList<I>();
			for (int j = 0; j < le_list.get(i); j++) {
				if (i == 0) {
					A as = new A(j);
					list.add(as);
				} else if (i == 1) {
					B bs = new B(j);
					list.add(bs);
				} else {
					C cs = new C(j);
					list.add(cs);
				}

			}
			list_2.add(list);
		}

		// System.out.println(list_2);

		for (int i = 0; i < list_2.size(); i++) {
			for (int j = 0; j < list_2.get(i).size(); j++) {
				// System.out.println(list_2.get(i).get(j));
				for (int j2 = 0; j2 < list_2.get(i).get(j).getLength(); j2++) {
					System.out.println(list_2.get(i).get(j).getList().get(j2));
				}
				System.out.println();
			}
			System.out.println("**********************");
		}
	}

}
