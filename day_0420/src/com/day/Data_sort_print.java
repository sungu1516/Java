package com.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Data_sort_print {

	public static void main(String[] args) {
		// ��ȭ����
		// ���� ���� �帣 ������ ������� ������� �󿵽ð�

		// hashmap �̳� list�� ������ ������ �� �ִ�.
		// hashmap�� �����غ���!

		HashMap<String, Movie> map = new HashMap<String, Movie>();
		ArrayList<Movie> movie_list = new ArrayList<Movie>();

		for (int i = 0; i < 5; i++) {
			Movie movie = new Movie(i);
			map.put(movie.schem.getTitle(), movie);
			movie_list.add(movie);
			System.out.println(movie.schem.getTitle()); // key������ ������ ���� ���� ���·� ���
		}

		// key ������ ����, set������ map.keySet()�� ����Ʈ�� �ٲ��ش�.

		ArrayList<String> list = new ArrayList<String>(map.keySet());
		// Ȥ�� �Ʒ� ����� ����
		// list.addAll(map.keySet());

		Collections.sort(list);

		// ����Ʈ ���� Ŭ���� ��ü ����
		Collections.sort(movie_list);

		System.out.println(list.size());
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		for (int i = 0; i < movie_list.size(); i++) {
			System.out.println(movie_list.get(i).schem.getTitle());
		}

	}

}
