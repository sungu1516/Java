package com.day;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_Writer {

	public static void main(String[] args) throws FileNotFoundException {
		// PrintWriter �̿��ϱ�

		PrintWriter pw = new PrintWriter("A:\\Work\\day_0422\\text\\output.txt");

		// 1��° ���Դϴ� ~ 10��° ���Դϴٱ���, �ٹٲ� �ؼ� ���Ͽ� �Է��ϰ� �����ϱ�
		for (int i = 1; i < 11; i++) {
			String str = i + "��° ���Դϴ�.";
			pw.println(str);
		}
		pw.close();
	}

}
