package com.day;

import java.util.ArrayList;

import com.today.TA;

public class Day_0415 extends TA{

	public static void main(String[] args) {
		
		A_2 a = new A_2(); // �� �� a��� ��ü�� A_2��� Ŭ������ ������ �ʵ�(����)�� �޼��� ��θ� ����.
		

		Gugudan gugu = new Gugudan();
		gugu.Gugudan_method();
		
	}

	static void data() {
		
		
		A_2 a = new A_2();
		Data data = new Data(); // data ��ü�� ���������, �̴� Data Ŭ������ �� ��. ���� ��ü ���������� text_data�� array�� �����Ѵ�. 
		
		
		A_2 ac = new A_2(data.text_data[0], data.text_data[1], data.text_data[2], data.text_data[3], data.text_data[4], 
				data.text_data[5], data.text_data[6]); // data�� �ִ� text_data�� �����ϱ� ���ؼ� data.text_data 
		
		System.out.println(ac.id);
		System.out.println(ac.name);
		System.out.println(ac.addr);
		System.out.println(ac.phone);
		System.out.println(ac.gender);
		System.out.println(ac.age);
		System.out.println(ac.number);
		
		System.out.println(ac);
		
		B_2 b = new B_2("lee", "171", "70");
		b.height = "75";
		
		System.out.println(b.height);
	}
	
	static void dd () {
//		A_2 a = new A_2();
//		a.num_a = 100;
//		TA ta = new TA();
//		ta.num_ta = 50;
//		
//		Day_0415 day = new Day_0415();
//		day.num_ta = 1;
	}
	
	static void class_heri() {
//		A a = new A(1);
//		A a_1 = new A();
//		System.out.println(a.count);
//		System.out.println(a.count2);
//		System.out.println(a.count3);
		
//		System.out.println(a.b.number);
//		System.out.println(a.number);
//		System.out.println(a_1.count); 
		
		
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
		
		boolean bb = list.equals(list2); // String�� ���� �ּҰ� �ƴ� value�� ���Ѵ�.
		boolean bb2 = list.contains(1);
		System.out.println("list�� list2�� ������?" + bb);
		System.out.println("list�� ���� ���ԵǾ��ִ°�?" + bb2);
		
		list.set(1, 4);
		System.out.println(list.get(1));
	}
}