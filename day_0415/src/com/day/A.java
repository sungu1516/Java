package com.day;

public class A extends B {
//	// �� ������ class A�� ���赵
//	public int count = 1; // �� ��, ��ü�� Ư�� ���� �Ѿ���� �ǰ�, �̸� ��� ������� �Ѵ�. 
//	
//	protected int count2 = 2; // public�� protected�� ���� ��Ű�� ���ؿ����� ������ ������!
//	
//	int count3 = 3; // �̴� default. �� ���� ��Ű�� ���ؿ��� ���� ������ ����. 
//	
//	private int count4 = 4; // ������ private�� ������ ����. Ŭ���� �ȿ����� ���� ����
	
	int count = 100;
	
	public A(int n) {
		super(n); // �̴� AŬ������ �θ��� BŬ������ �����ڸ� �������� �ǹ���. ��ǻ� ����Ʈ�� �� �κ� ��� ȣ���� ��.
					// �� ��, super()�� Ŀ���� ������ �Լ��� �����ϸ� �������� �ʴ´�. Ŀ���� �����ڸ� ȣ���ϱ� ���ؼ� super() �ȿ� ���� �־����
		this.count = 500;
		System.out.println("a�� Ŀ���� �������Դϴ�.");
	}



	public A() {
		super(); // B�� �⺻�����ڸ� �ҷ����� �ǹ��Ѵ�. 
		System.out.println("a�� �⺻�������Դϴ�");
	}

}
