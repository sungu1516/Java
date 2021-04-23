package com.day;

import java.io.File;
import java.io.FileWriter;

public class Filewriter_fromDB {

	public static void main(String[] args) {
		
		// 입력할 텍스트 객체 만들어주기 
		
		A a = new A();
		String text = "";
		
		for (int i = 0; i < a.name.length; i++) {
			text += a.name[i] + a.age[i] + a.addr[i] + a.phone[i] + a.gender[i] + "\n";
		}
		
		File file = new File("A:\\Work\\day_0423\\text\\person_data3.txt");
		String test="";
		
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
