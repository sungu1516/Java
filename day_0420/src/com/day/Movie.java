package com.day;

import java.util.ArrayList;

public class Movie implements Comparable<Movie>, I {

	MovieS schem = null;

	String[] title = { "����", "���鷯����Ʈ", "Ÿ��Ÿ��", "�����", "Ŭ����" };
	String[] director = { "�󺣼�", "���ʹ���", "ī�޷�", "����ȣ", "�����" };
	String[] genre = { "�׼�", "���", "���", "������", "��ε��" };
	String[] count = { "100��", "300��", "900��", "1000��", "150��" };
	String[] actor = { "�帣��", "���ϴϽ�", "��ī������", "�۰�ȣ", "���¿�" };
	String[] actress = { "��Ż����Ʈ��", "������", "����Ʈ������", "������", "�տ���" };
	String[] time = { "100", "200��", "160��", "120��", "120��" };

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(int i) {
		schem = new MovieS();
		schem.setTitle(title[i]);
		schem.setDirector(director[i]);
		schem.setGenre(genre[i]);
		schem.setCount(count[i]);
		schem.setActor(actor[i]);
		schem.setActress(actress[i]);
		schem.setTime(time[i]);
	}

	@Override
	public int compareTo(Movie o) {
		return this.schem.getTitle().compareTo(o.schem.getTitle());
	}

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
		// TODO Auto-generated method stub
		return null;
	}
}
