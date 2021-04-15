package com.day;

import java.util.Iterator;

public class Gugudan {
	public void Gugudan_method() {
		for (int i = 2; i < 10; i++) {

			Gugudan_inner gugudan = new Gugudan_inner(i);

			System.out.println("*******************");

		}
	}
	
	public void Gugudan_method(int n) {
		for (int i = 2; i < n + 1; i++) {

			Gugudan_inner gugudan = new Gugudan_inner(i);

			System.out.println("*******************");

		}
	}
	
}
