package com.day;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Filewriter_file_per_class {

	public static void main(String[] args) {
		ArrayList<I> list = new ArrayList<I>();

		A a = new A();
		B b = new B();
		C c = new C();

		list.add(a);
		list.add(b);
		list.add(c);

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			File file = new File("A:\\Work\\day_0423\\text\\" + i + "TABLE.txt");
			String text = "";
			text += list.get(i).addText();

			try {
				FileWriter writer = new FileWriter(file);
				BufferedWriter w = null;
				writer.write(text);
				w = new BufferedWriter(writer);
				w.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
