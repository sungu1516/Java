package com.day;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Filewriter_fromDB_Interface {

	public static void main(String[] args) {

		ArrayList<I> t_list = new ArrayList<I>();

		A a = new A();
		B b = new B();
		C c = new C();

		String text = new String("");

		text += a.addText() + b.addText() + c.addText();

		File file = new File("A:\\Work\\day_0423\\text\\abc_data.txt");
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
