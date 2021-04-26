package com.day;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileStream_ex {

	public static void main(String[] args) {

		String text = "helloworld";
		String path = "A:\\Work\\day_0426\\Text\\t.txt";
		File file = new File(path);

		try {
			// FileWriter wr = new FileWriter(path);
			FileOutputStream output = new FileOutputStream(file);
			byte[] b = text.getBytes(); // 위 텍스트를 바이트 값으로 변환해줌
			System.out.println(b.length);
			output.write(b);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("도달");

		try {
			String path2 = "A:\\\\Work\\\\day_0426\\\\Text\\\\t2.txt";
			File file2 = new File(path2);
			FileOutputStream output2 = new FileOutputStream(file2);

			FileInputStream input = new FileInputStream(file);
//			System.out.println(input.available());
//			System.out.println((char)input.read());
//			System.out.println(input.available()); // 읽지 않은 글자의 수를 리턴

			int n = 0;
			
			while ((n = input.available()) > 0) {
				byte[] b = input.readAllBytes();
				for (int i = 0; i < b.length; i++) {
					System.out.println((char) b[i]);
				}

//				char chr = (char) input.read();
//				System.out.println(chr);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
