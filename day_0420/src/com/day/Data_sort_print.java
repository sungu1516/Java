package com.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Data_sort_print {

	public static void main(String[] args) {
		// 영화정보
		// 제목 감독 장르 관객수 남성배우 여성배우 상영시간

		// hashmap 이나 list에 정보를 저장할 수 있다.
		// hashmap에 저장해보자!

		HashMap<String, Movie> map = new HashMap<String, Movie>();
		ArrayList<Movie> movie_list = new ArrayList<Movie>();

		for (int i = 0; i < 5; i++) {
			Movie movie = new Movie(i);
			map.put(movie.schem.getTitle(), movie);
			movie_list.add(movie);
			System.out.println(movie.schem.getTitle()); // key값들이 정렬이 되지 않은 상태로 출력
		}

		// key 정렬을 위해, set형식인 map.keySet()을 리스트로 바꿔준다.

		ArrayList<String> list = new ArrayList<String>(map.keySet());
		// 혹은 아래 방법도 가능
		// list.addAll(map.keySet());

		Collections.sort(list);

		// 리스트 안의 클래스 객체 정렬
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
