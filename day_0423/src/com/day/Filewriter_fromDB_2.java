package com.day;

import java.io.File;
import java.io.FileWriter;

public class Filewriter_fromDB_2 {

	public static void main(String[] args) {
		// �Է��� �ؽ�Ʈ ��ü ������ֱ�

		File file = new File("A:\\Work\\day_0423\\text\\person_data2.txt");
		String test = "";

		for (int i = 0; i < 3; i++) {
			A text = new A(i);

			try {
				FileWriter writer = new FileWriter(file, true);
				writer.write(text.text + "\n");
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
