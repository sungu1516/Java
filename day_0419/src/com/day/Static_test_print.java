package com.day;

public class Static_test_print {

	public static void main(String[] args) {
		Static_test test1 = new Static_test();
		Static_test test2 = new Static_test();
		
		test1.num = 500; // static�� ���� ���� �ּҸ� �����ϱ� ������
				
		System.out.println(test1.num);
		System.out.println(test2.num); // �������� �ʾƵ� ���� ���Ѵ�.	
		
		System.out.println(test1.int_array);
		System.out.println(test2.int_array); // ���������� static �Ͽ��� ������� array�� ��ü�� �޶� ������ �ּҸ� ������. 

	}

}
