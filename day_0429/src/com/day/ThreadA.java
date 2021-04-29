package com.day;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ThreadA extends Thread {

	int c;
	String path = "D:\\Work1\\day_0429\\calendar\\";

	public ThreadA(int c) {
		this.c = c;
	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < c; i++) {
				BufferedWriter bw = new BufferedWriter(new FileWriter(path + (i+2000) + "year"));
				bw.write(Cal.getYearAll(i + 2000));
				bw.close();
				System.out.println((i+2000) + "year is saved");
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
