package com.day;

import java.io.File;

public class Make_dir {

	public static void main(String[] args) {
		File file = new File(".\\newfolder");

		try {
			if (file.exists())
				System.out.println("���� ����");
			else {
				System.out.println("���� ����");
				file.mkdir();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
