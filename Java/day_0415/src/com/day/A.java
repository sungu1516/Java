package com.day;

public class A extends B{ // BŬ������ AŬ������ ����Ѵ�. �� AŬ������ �ڽ� Ŭ�����̴�. 
	
//	// �� ������ class A�� ���赵
//	public int count = 1; // �� ��, ��ü�� Ư�� ���� �Ѿ���� �ǰ�, �̸� ��� ������� �Ѵ�. 
//	
//	protected int count2 = 2; // public�� protected�� ���� ��Ű�� ���ؿ����� ������ ������!
//	
//	int count3 = 3; // �̴� default. �� ���� ��Ű�� ���ؿ��� ���� ������ ����. 
//	
//	private int count4 = 4; // ������ private�� ������ ����. Ŭ���� �ȿ����� ���� ����
	
	public A() {
		super(3); // �̴� AŬ������ �ڽ��� BŬ������ �����ڸ� �������� �ǹ���. ��ǻ� ����Ʈ�� �� �κ� ��� ȣ���� ��. 
		         // �� ��, super()�� Ŀ���� ������ �Լ��� �����ϸ� �������� �ʴ´�. Ŀ���� �����ڸ� ȣ���ϱ� ���ؼ� super() �ȿ� ���� �־����
		b = new B();
		this.count = 500;
		System.out.println("a �������Դϴ�.");
	}
	B b;
	int count = 100;
	
	public A(int count) {
		super();
		b = new B(); // �� ������ ������� ��ü�� �� �ִ� ���̴�. 
		 this.count = count;
		b.number = this.count; 
		 
		System.out.println("a Ŀ���� �������Դϴ�.");
	}
	
}
