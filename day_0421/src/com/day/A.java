package com.day;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class A extends As {

	String[] name = { "ȫ�浿", "��ý�", "�Ż��Ӵ�" };
	int[] age = { 30, 10, 60 };
	String[] addr = { "�����", "������", "�λ�" };
	String[] phone = { "1234", "4455", "5475" };
	String[] gender = { "��", "��", "��" };

	public A(int i) {

		setName(name[i]);
		setAge(age[i]);
		setAddr(addr[i]);
		setPhone(phone[i]);
		setGender(gender[i]);

//		as.getList(name[i]);
//		as.getList(age[i] + "");
//		as.getList(addr[i]);
//		as.getList(phone[i]);
//		as.getList(gender[i]);

	}

	public A() {
		// TODO Auto-generated constructor stub
	}
}
