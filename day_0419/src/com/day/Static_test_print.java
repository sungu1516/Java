package com.day;

public class Static_test_print {

	public static void main(String[] args) {
		Static_test test1 = new Static_test();
		Static_test test2 = new Static_test();
		
		test1.num = 500; // static에 의해 같은 주소를 공유하기 때문에
				
		System.out.println(test1.num);
		System.out.println(test2.num); // 정의하지 않아도 같이 변한다.	
		
		System.out.println(test1.int_array);
		System.out.println(test2.int_array); // 마찬가지로 static 하에서 만들어진 array는 객체가 달라도 동일한 주소를 가진다. 

	}

}
