package com.day;

import java.util.ArrayList;

public class List_for_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<I> list = new ArrayList<I>();

//		A a = new A();
//		for (int i = 0; i < a.name.length; i++) {
//			A as = new A(i);
//			list.add(as);
//			for (int j = 0; j < list.get(i).getList().size(); j++) {
//				System.out.println(list.get(i).getList().get(j));
//			}System.out.println("**********");
//			
//
//		}

		B b = new B();
		for (int i = 0; i < b.name.length; i++) {
			B bs = new B(i);
			list.add(bs);
			for (int j = 0; j < list.get(i).getList().size(); j++) {
				System.out.println(list.get(i).getList().get(j));
			}System.out.println("**********");
			

		}
//
//		C c = new C();
//		for (int i = 0; i < c.title.length; i++) {
//			C cs = new C(i);
//			list.add(cs);
//			for (int j = 0; j < list.get(i).getList().size(); j++) {
//				System.out.println(list.get(i).getList().get(j));
//
//			}System.out.println("**********");
//
//		}

	}
}
