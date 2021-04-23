package com.day;

import java.io.File;
import java.io.FileWriter;

public class Filewriter_fromDB_2 {

	public static void main(String[] args) {
		// 입력할 텍스트 객체 만들어주기

		File file = new File("A:\\Work\\day_0423\\text\\person_data2.txt");
		String test = "";

		for (int i = 0; i < 3; i++) {
			A text = new A(i);

			try {
				FileWriter writer = new FileWriter(file, true);
				writer.write(text.text + "\n");
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

	}

}
