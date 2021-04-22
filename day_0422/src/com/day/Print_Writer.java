package com.day;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_Writer {

	public static void main(String[] args) throws FileNotFoundException {
		// PrintWriter 이용하기

		PrintWriter pw = new PrintWriter("A:\\Work\\day_0422\\text\\output.txt");

		// 1번째 줄입니다 ~ 10번째 줄입니다까지, 줄바꿈 해서 파일에 입력하고 저장하기
		for (int i = 1; i < 11; i++) {
			String str = i + "번째 줄입니다.";
			pw.println(str);
		}
		pw.close();
	}

}
