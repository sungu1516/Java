package com.day;

import java.util.ArrayList;

public class Data_in implements I {
	String[] name = { "홍길동", "김시습", "신사임당" };

	int[] age = { 30, 10, 62 };
	String[] addr = { "서울시", "성남시", "부산" };
	String[] phone = { "1234", "4455", "5475" };
	String[] gender = { "남", "남", "여" };

	public Data_in() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<String> GetList() {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]);
		}
		return list;
	}

	@Override
	public ArrayList<String> GetHori() {
		// TODO Auto-generated method stub
		return null;
	}
}
