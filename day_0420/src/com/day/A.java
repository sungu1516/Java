package com.day;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class A implements I {
	String[] name = { "ȫ�浿", "��ý�", "�Ż��Ӵ�" };

	int[] age = { 30, 10, 60 };
	String[] addr = { "�����", "������", "�λ�" };
	String[] phone = { "1234", "4455", "5475" };
	String[] gender = { "��", "��", "��" };

	@Override
	public ArrayList<String> GetList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> GetHori() {
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < addr.length; i++) {
			list.add(name[i] + age[i] + addr[i] + phone[i] + gender[i] + "\n");
		}
		return list;
	}
}
