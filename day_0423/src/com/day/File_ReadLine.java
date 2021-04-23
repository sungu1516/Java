package com.day;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class File_ReadLine {

	public static void main(String[] args) {
		File file = new File("A:\\Work\\day_0423\\text\\0TABLE.txt");

		try {
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);

			String rc = "";

			while ((rc = br.readLine()) != null)
				System.out.println(rc);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
