package com.day;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ThreadT extends Thread {

	@Override
	public void run() {
		String text = "HelloWorld";
		String path2 = "";

		File file = null;
		FileWriter writer = null;
		BufferedWriter bw = null;

		for (int i = 0; i < 10; i++) {
			try {
				// 폴더 생성
				path2 = ".\\images_" + i;

				file = new File(path2);

				if (file.exists()) { // 파일의 존재여부 확인
					System.out.println("파일이 존재합니다.");
				} else {
					file.mkdir(); // 파일이 없는 경우 새로운 directory
					System.out.println("파일을 생성하였습니다.");
				}

				// 텍스트 파일 넣어주기
				path2 = ".\\images_" + i + "\\t.txt";
				writer = new FileWriter(path2);

				writer.write(text);
				bw = new BufferedWriter(writer);
				bw.close();

				Thread.sleep(100);

			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
