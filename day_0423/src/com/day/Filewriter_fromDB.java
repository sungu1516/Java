package com.day;

import java.io.File;
import java.io.FileWriter;

public class Filewriter_fromDB {

	public static void main(String[] args) {
		
		// �Է��� �ؽ�Ʈ ��ü ������ֱ� 
		
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
