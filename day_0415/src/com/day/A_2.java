package com.day;

public class A_2 {
	
	String id;
	String name;
	String addr;
	String phone;
	String gender;
	String age;
	String number;
	
	// dto에 해당 
	public A_2(String id, String name, String addr, String phone, String gender, String age, String number) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.phone = phone;
		this.gender = gender;
		this.age = age;
		this.number = number;
	}

	int num_a;
	
	public A_2() {
		System.out.println("a생성자입니다.");
	}
}
