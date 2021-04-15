package com.day;

public class A extends B{ // B클래스는 A클래스를 상속한다. 즉 A클래스의 자식 클래스이다. 
	
//	// 이 공간은 class A의 설계도
//	public int count = 1; // 이 때, 객체로 특정 값이 넘어오게 되고, 이를 멤버 변수라고 한다. 
//	
//	protected int count2 = 2; // public과 protected는 같은 패키지 수준에서는 변수가 잡힌다!
//	
//	int count3 = 3; // 이는 default. 이 역시 패키지 수준에서 접근 가능한 변수. 
//	
//	private int count4 = 4; // 하지만 private는 잡히지 않음. 클래스 안에서만 접근 가능
	
	public A() {
		super(3); // 이는 A클래스의 자식인 B클래스의 생성자를 실행함을 의미함. 사실상 디폴트라 이 부분 없어도 호출이 됨. 
		         // 한 편, super()은 커스텀 생성자 함수만 존재하면 지원되지 않는다. 커스텀 생성자를 호출하기 위해선 super() 안에 값을 넣어줘야
		b = new B();
		this.count = 500;
		System.out.println("a 생성자입니다.");
	}
	B b;
	int count = 100;
	
	public A(int count) {
		super();
		b = new B(); // 이 과정을 상속으로 대체할 수 있는 것이다. 
		 this.count = count;
		b.number = this.count; 
		 
		System.out.println("a 커스텀 생성자입니다.");
	}
	
}
