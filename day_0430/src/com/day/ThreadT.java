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
				// ���� ����
				path2 = ".\\images_" + i;

				file = new File(path2);

				if (file.exists()) { // ������ ���翩�� Ȯ��
					System.out.println("������ �����մϴ�.");
				} else {
					file.mkdir(); // ������ ���� ��� ���ο� directory
					System.out.println("������ �����Ͽ����ϴ�.");
				}

				// �ؽ�Ʈ ���� �־��ֱ�
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
