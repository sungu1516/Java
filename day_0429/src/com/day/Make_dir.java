package com.day;

import java.io.File;

public class Make_dir {

	public static void main(String[] args) {
		File file = new File(".\\newfolder");

		try {
			if (file.exists())
				System.out.println("폴더 있음");
			else {
				System.out.println("폴더 없음");
				file.mkdir();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
