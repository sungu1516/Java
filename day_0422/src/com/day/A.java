package com.day;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class A extends As {

	String[] name = { "ȫ�浿", "��ý�", "�Ż��Ӵ�" };
	int[] age = { 30, 10, 60 };
	String[] addr = { "�����", "������", "�λ�" };
	String[] phone = { "1234", "4455", "5475" };
	String[] gender = { "��", "��", "��" };

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
