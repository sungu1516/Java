package com.day;

public class A implements Comparable<A> { // Comparable은 일종의 인터페이스이다. 항상 아래와 같은 메서드를 구현해야 한다.

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
