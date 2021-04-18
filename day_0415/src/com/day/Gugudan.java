package com.day;

import java.util.Iterator;

public class Gugudan {
	// 오버로딩을 통해 구구단을 구현할 수 있는 다양한 메서드를 만들어본다. 
	
	// 단순히 실행하면 2단부터 9단까지 출력해주는 함수
	public void Gugudan_method() {
		for (int i = 2; i < 10; i++) {

			Gugudan_inner gugudan = new Gugudan_inner(i);

			System.out.println("*******************");

		}
	}

	// 인자값으로 숫자를 넣으면 2단부터 해당 단까지만 출력해주는 함수
	public void Gugudan_method(int n) {
		for (int i = 2; i < n + 1; i++) {

			Gugudan_inner gugudan = new Gugudan_inner(i);

			System.out.println("*******************");

		}
	}

	// 두 개의 인트값을 받아, 그 사이의 단을 출력해주는 함수
	public void Gugudan_method(int n, int m) {
		for (int i = n; i < m + 1; i++) {

			Gugudan_inner gugudan = new Gugudan_inner(i);

			System.out.println("*******************");

		}
	}
}
