package com.day;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class A extends As {

	String[] name = { "홍길동", "김시습", "신사임당" };
	int[] age = { 30, 10, 60 };
	String[] addr = { "서울시", "성남시", "부산" };
	String[] phone = { "1234", "4455", "5475" };
	String[] gender = { "남", "남", "여" };

	@Override
	public int getLength() {

		return name.length;
	}

	@Override
	public ArrayList<String[]> getArr() {
		ArrayList<String[]> list = new ArrayList<String[]>();

		return list;
	}

	public A(int i) {

		setName(name[i]);
		setAge(age[i]);
		setAddr(addr[i]);
		setPhone(phone[i]);
		setGender(gender[i]);

	}

	public A() {
		// TODO Auto-generated constructor stub
	}

}
