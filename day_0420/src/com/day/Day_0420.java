package com.day;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day_0420 {

	public static void main(String[] args) {

		// 모든 데이터가 수평으로 출력되도록 구현
		
		A a = new A();
		C c = new C();
		B b = new B();

		for (int i = 0; i < b.GetHori().size(); i++) {
			System.out.println(b.GetHori().get(i));
		}

	}

}
	