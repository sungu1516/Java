package com.day;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class B implements I {
	String[] name = { "�۰���", "����", "�����", "������", "���缮" };
	String[] addr = { "��⵵ ������", "���� Ư����", "�λ� ������", "��õ ������", "���� ������" };
	String[] re_num = { "000000-123456", "000000-123456", "000000-123456", "000000-123456", "000000-123456" };
	String[] ph_num = { "010-1234-5678", "010-4445-3327", "010-6666-3323", "010-0000-1234", "010-5323-7553" };
	String[] email = { "djer@gmail.com", "djer@gmail.com", "djer@gmail.com", "djer@gmail.com", "djer@gmail.com" };
	String[] service = { "KT", "SKT", "LGU+", "SKT", "KT" };
	String[] plan = { "40000", "99000", "29000", "89000", "119000" };
	String[] serial = { "����ȣ_1234", "����ȣ_1234", "����ȣ_1234", "����ȣ_1234", "����ȣ_1234" };

	public B() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getFile() {
		String text = "";

		for (int i = 0; i < name.length; i++) {
			text += name[i] + addr[i] + re_num[i] + ph_num[i] + email[i] + service[i] + plan[i] + serial[i] + "\n";
		}

		File file = new File("A:\\Work\\day_0423\\text\\b_data.txt");
		String test = "";

		try {
			FileWriter writer = new FileWriter(file);
			writer.write(text);
			writer.close();
			test = "����ó��";

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			test = "������ó�� - ���� : " + e.getMessage();
		} finally {
			System.out.println(test);
		}
		System.out.println("����");

	}

	@Override
	public String addText() {
		String str = "";
		for (int i = 0; i < name.length; i++) {
			str += name[i] + addr[i] + re_num[i] + ph_num + email[i] + service[i] + plan[i] + serial[i] + "\n";
			
		}return str;

	}
}
