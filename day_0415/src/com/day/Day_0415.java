package com.day;

import java.util.ArrayList;

import com.today.TA;

public class Day_0415 extends TA {

	public static void main(String[] args) {
		
		
	}

	static void dd() {
		TA ta = new TA(); // 다른 패키지의 클래스를 가져와 인스턴스를 만들 수 있음을 의미한다. 
		ta.num_ta = 50;

		Day_0415 day = new Day_0415(); // 지금 메인 메서드가 존재하는 Day_0415란 클래스가 다른 패키지 내에 있는 TA 클래스를 상속할 수 있다. 
		day.num_ta = 1; // 또한, TA의 변수에도 접근이 가능하다. (다만 접근제한자에 따라 다를 수 있음)
	}

	static void class_heri() {

//		A a = new A(1);
//		A a_1 = new A();
//		System.out.println(a.count);
//		System.out.println(a.count2);
//		System.out.println(a.count3);
//
//		System.out.println(a.b.number);
//		System.out.println(a.number);
//		System.out.println(a_1.count);
//
//		Day_0415 n_data = new Day_0415();
//		
//		n_data.count = 600;
//		System.out.println(n_data.number);
	}

	static void list_methods() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list2.add(1);
//		System.out.println(list.get(0));
//		list.clear();
//		System.out.println(list);

		boolean bb = list.equals(list2); // String과 같이 주소가 아닌 value를 비교한다.
		boolean bb2 = list.contains(1);
		System.out.println("list와 list2가 같은가?" + bb);
		System.out.println("list에 값이 포함되어있는가?" + bb2);

		list.set(1, 4);
		System.out.println(list.get(1));
	}
}