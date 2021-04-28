package com.day;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;

public class Month_in_List {

	public static void main(String[] args) {

		ArrayList<String> calendar = new ArrayList<String>();
		String path = "A:\\Work\\day_0428\\Calendar\\";

		try {

			for (int i = 2011; i < 2021; i++) {
				for (int j = 1; j < 13; j++) {
					// BufferedWriter bw = new BufferedWriter(new FileWriter(path + i + "/" + j +
					// ".txt"));
					calendar.add(Cal.getMonthAll(i, j));

					// Thread.sleep(3000);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(calendar.size());
		System.out.println();

		try {
			for (int i = 0; i < calendar.size(); i++) {
				System.out.println(calendar.get(i));
				Thread.sleep(10);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
