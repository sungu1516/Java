package com.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Set_comparable {

	public static void main(String[] args) {

		sort_class_str();
	}

	static void sort_class_by_comparable() {
		TreeSet<A> at = new TreeSet<A>();

		// 숫자 비교
		A a1 = new A();
		a1.count = 300;
		at.add(a1);

		A a2 = new A();
		a2.count = 100;
		at.add(a2);

		A a3 = new A();
		a3.count = 200;
		at.add(a3);

		A a4 = new A();
		a4.count = 400;
		at.add(a4);

		A a5 = new A();
		a5.count = 500;
		at.add(a5);

		A a6 = new A();
		a6.count = 0;
		at.add(a6);
		
		System.out.println();
		for (A i : at) { System.out.println(i.count); }
		

	}

	static void sort_class_str () {
		TreeSet<A> at = new TreeSet<A>();

		// 숫자 비교
		A a1 = new A();
		a1.str = "c";
		at.add(a1);

		A a2 = new A();
		a2.str = "aaaa";
		at.add(a2);
		

		A a3 = new A();
		a3.str = "ddd";
		at.add(a3);

		A a4 = new A();
		a4.str = "ee";
		at.add(a4);
		
		
		System.out.println();
		for (A i : at) { System.out.println(i.str); }
	}
	
	
	
	static void sort_list() {
		ArrayList<A> list = new ArrayList<A>();

		// 숫자 비교
		A a1 = new A();
		a1.count = 100;
		list.add(a1);
		A a2 = new A();
		a2.count = 50;
		list.add(a2);
		A a3 = new A();
		a3.count = 50;
		list.add(a3);

		Collections.sort(list); // 리스트에 있는 클래스들을 정렬한다.

		for (A i : list) {
			System.out.println(i.str);
			// System.out.println(i.compareTo(a3));
		}
	}

}
