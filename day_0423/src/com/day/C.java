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

	public C() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public String addText() {
		String str = "";
		for (int i = 0; i < title.length; i++) {
			str += title[i] + director[i] + genre[i] + count[i] + actor[i] + actress[i] + time[i] + "\n";

		}
		return str;

	}
}
