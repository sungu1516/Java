package com.day;

import java.util.ArrayList;

public class C implements I {

	String[] title = { "����", "���鷯����Ʈ", "Ÿ��Ÿ��", "�����", "Ŭ����" };
	String[] director = { "�󺣼�", "���ʹ���", "ī�޷�", "����ȣ", "�����" };
	String[] genre = { "�׼�", "���", "���", "������", "��ε��" };
	String[] count = { "100��", "300��", "900��", "1000��", "150��" };
	String[] actor = { "�帣��", "���ϴϽ�", "��ī������", "�۰�ȣ", "���¿�" };
	String[] actress = { "��Ż����Ʈ��", "������", "����Ʈ������", "������", "�տ���" };
	String[] time = { "100", "200��", "160��", "120��", "120��" };

	@Override
	public ArrayList<String> GetList() {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < title.length; i++) {
			list.add(title[i]);
		}
		return list;
	}

	@Override
	public ArrayList<String> GetHori() {
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < title.length; i++) {
			list.add(title[i] + director[i] + genre[i] + count[i] + actor[i] + actress[i] + time[i] + "\n");
		}
		return list;
	}
}
