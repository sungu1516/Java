package com.day;

import java.io.File;
import java.io.FileWriter;

public class Filewriter_multifiles {

	public static void main(String[] args) {
		B b = new B();

		for (int i = 0; i < b.name.length; i++) {
			String text = "";
			text += b.name[i] + b.addr[i] + b.re_num[i] + b.ph_num + b.email[i] + b.service[i] + b.plan[i]
					+ b.serial[i];

			// �ະ�� ���ο� ���� ������ֱ�
			File file = new File("A:\\Work\\day_0423\\text\\" + i + "��°������");
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

	}

}
