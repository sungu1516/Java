package com.day;

import java.util.ArrayList;

public class C extends Cs{

	String[] title = { "����", "���鷯����Ʈ", "Ÿ��Ÿ��", "�����", "Ŭ����" };
	String[] director = { "�󺣼�", "���ʹ���", "ī�޷�", "����ȣ", "�����" };
	String[] genre = { "�׼�", "���", "���", "������", "��ε��" };
	String[] count = { "100��", "300��", "900��", "1000��", "150��" };
	String[] actor = { "�帣��", "���ϴϽ�", "��ī������", "�۰�ȣ", "���¿�" };
	String[] actress = { "��Ż����Ʈ��", "������", "����Ʈ������", "������", "�տ���" };
	String[] time = { "100", "200��", "160��", "120��", "120��" };

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return title.length;
	}
	
	@Override
	public ArrayList<String[]> getArr() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public C(int i) {
		
		setTitle(title[i]);
		setDirector(director[i]);
		setGenre(genre[i]);
		setCount(count[i]);
		setActor(actor[i]);
		setActress(actress[i]);
		setTime(time[i]);
	}
	
	public C() {
		// TODO Auto-generated constructor stub
	}
}
