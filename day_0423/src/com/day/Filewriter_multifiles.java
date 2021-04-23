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

			// 행별로 새로운 파일 만들어주기
			File file = new File("A:\\Work\\day_0423\\text\\" + i + "번째데이터");
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

	}

}
