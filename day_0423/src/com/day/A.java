package com.day;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class A implements I {

	String[] name = { "홍길동", "김시습", "신사임당" };
	int[] age = { 30, 10, 60 };
	String[] addr = { "서울시", "성남시", "부산" };
	String[] phone = { "1234", "4455", "5475" };
	String[] gender = { "남", "남", "여" };

	String text = "";

	public A(int i) {

		text += name[i] + ";" + age[i] + ";" + addr[i] + ";" + phone[i] + ";" + gender[i];
	}

	public A() {

	}

	@Override
	public void getFile() {
		String text = "";

		for (int i = 0; i < name.length; i++) {
			text += name[i] + age[i] + addr[i] + phone[i] + gender[i] + "\n";
		}

		File file = new File("A:\\Work\\day_0423\\text\\a_data.txt");
		String test = "";

		try {
			FileWriter writer = new FileWriter(file);
			writer.write(text);
			writer.close();
			test = "정상처리";

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			test = "비정상처리 - 내용 : " + e.getMessage();
		} finally {
			System.out.println(test);
		}
		System.out.println("도달");

	}

	@Override
	public String addText() {
		String str = "";
		for (int i = 0; i < name.length; i++) {
			str += name[i] + addr[i] + phone[i] + gender[i] + "\n";
		
		}return str;
	}
}
