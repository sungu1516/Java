package com.day;

import java.util.ArrayList;

public class Day_0405 extends A{

	public static void main(String[] args) {
		A a = new A(1);
		A a_1 = new A();
//		System.out.println(a.count);
//		System.out.println(a.count2);
//		System.out.println(a.count3);
		
//		System.out.println(a.b.number);
//		System.out.println(a.number);
//		System.out.println(a_1.count);
		
		
		Day_0405 n_data = new Day_0405();
		
		n_data.count = 600;
		System.out.println(n_data.number);
		
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
		
		boolean bb = list.equals(list2); // String�� ���� �ּҰ� �ƴ� value�� ���Ѵ�.
		boolean bb2 = list.contains(1);
		System.out.println("list�� list2�� ������?" + bb);
		System.out.println("list�� ���� ���ԵǾ��ִ°�?" + bb2);
		
		list.set(1, 4);
		System.out.println(list.get(1));
	}
}