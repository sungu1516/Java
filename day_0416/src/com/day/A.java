package com.day;

public class A implements Comparable<A> { // Comparable�� ������ �������̽��̴�. �׻� �Ʒ��� ���� �޼��带 �����ؾ� �Ѵ�.

	int count;
	String str;

	public A() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(A o) {
		if (o.str.length() > this.str.length()) {
			return -1;
		} else if (o.str.length() < this.str.length()) {
			return 1;
		}
		return 0;
//		return str.compareTo(o.str);

	}

}
