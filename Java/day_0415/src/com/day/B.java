package com.day;

public class B {
	int number = 200;
	
	public B() {
		System.out.println("b의 기본 생성자입니다. ");
	}
	
	public B(int number) {
		this.number = number; // this란 해당 클래스의 전역 변수를 가리킴. 
		System.out.println("b의 커스텀 생성자입니다.");
	}
	
	
	
	
}
