package com.day;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class File_Read {

	public static void main(String[] args) {

		File file = new File("A:\\Work\\day_0423\\text\\0TABLE.txt");

		try {
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);

			int c = 0;

			while ((c = br.read()) != -1) { // 빈문자열은 -1이다.
				System.out.print((char) c); // 형변환을 통해 인트값인 c를 character로 출력
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
