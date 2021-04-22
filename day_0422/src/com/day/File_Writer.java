package com.day;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.ArrayList;
import java.util.Iterator;

public class File_Writer {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = null;

		String text = "Helloworld, Im Java";
		File file = new File("A:\\Work\\day_0422\\text\\test.txt"); // (���� ��ġ, ����� �����̸��� ����) ���� �� ���ϰ�ü ����

		try {

			FileWriter writer = new FileWriter(file); // writer��ü�����, ������ ����Ǵ� ������������ ���θ� ����ش�.
			writer.write(text); // ���� ���ڿ��� writer��ü�� �ƴ´�.
			BufferedWriter w = new BufferedWriter(writer); // BufferWiter�� �̸� ��θ� ���� ������(����)���� �����ϴ� ������ �Ѵ�. �Ϲ� String���ٴ�
															// �������� ���� �뷮�� ������ �� �ִ�.
			w.close(); // buffer �����.

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			// System.out.println(System.err);
		} finally {
			System.out.println("������ ���");
		}
		System.out.println("��");
	}

}
