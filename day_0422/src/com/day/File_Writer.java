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
		File file = new File("A:\\Work\\day_0422\\text\\test.txt"); // (저장 위치, 저장될 파일이름과 형식) 설정 및 파일객체 생성

		try {

			FileWriter writer = new FileWriter(file); // writer객체만들고, 파일이 저장되는 목적지까지의 선로를 깔아준다.
			writer.write(text); // 실제 문자열을 writer객체에 싣는다.
			BufferedWriter w = new BufferedWriter(writer); // BufferWiter는 이를 경로를 따라 목적지(파일)까지 전달하는 역할을 한다. 일반 String보다는
															// 느리지만 많은 용량을 전달할 수 있다.
			w.close(); // buffer 사라짐.

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			// System.out.println(System.err);
		} finally {
			System.out.println("무조건 출력");
		}
		System.out.println("끝");
	}

}
