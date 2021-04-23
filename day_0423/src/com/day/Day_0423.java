package com.day;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Day_0423 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			File file = new File("A:\\Work\\day_0423\\text\\" + i + "TABLE.txt");

			try {
				FileReader reader = new FileReader(file);
				BufferedReader br = new BufferedReader(reader);

				String rc = "";

				while ((rc = br.readLine()) != null)
					System.out.println(rc);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}System.out.println();
		}

	}

}
