package com.day;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class Thread_ex extends Thread {

	public void run() {
		try {

			while (true) {
				File file = new File("A:\\Work\\day_0426\\Text\\time6.txt");
				FileWriter writer = new FileWriter(file, true);

				Date date = new Date();
				Thread.sleep(3000);
				System.out.println(date);

				String date_text = date.toString();
				writer.write(date_text + "\n");
				BufferedWriter bw = new BufferedWriter(writer);
				bw.close();

			}

		} catch (

		Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		Thread_ex thread = new Thread_ex();
		thread.start();
		
		try {

			while (true) {
				File file = new File("A:\\Work\\day_0426\\Text\\time5.txt");
				FileWriter writer = new FileWriter(file, true);

				Date date = new Date();
				Thread.sleep(3000);
				System.out.println(date);

				String date_text = date.toString();
				writer.write(date_text + "\n");
				BufferedWriter bw = new BufferedWriter(writer);
				bw.close();

			}

		} catch (

		Exception e) {
			// TODO: handle exception
		}

	}
}