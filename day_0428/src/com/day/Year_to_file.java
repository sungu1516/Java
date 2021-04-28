package com.day;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Year_to_file {

	public static void main(String[] args) {
		String path = "A:\\Work\\day_0428\\Calendar\\";

		try {

			for (int i = 2021; i < 2031; i++) {

				for (int j = 1; j < 13; j++) {

					BufferedWriter bw = new BufferedWriter(new FileWriter(path + i + "year.txt", true));
					bw.write(Cal.getMonthAll(i, j));
					bw.close();

				}
				System.out.println(i + "년도 달력이 생성되었습니다.");
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
