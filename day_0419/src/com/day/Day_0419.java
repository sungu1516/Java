package com.day;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.validation.Schema;

public class Day_0419 {

	static TreeSet<PhoneS> name_set = new TreeSet<PhoneS>();

	public static void main(String[] args) {

		// map 만들기
		HashMap<String, PhoneData> data_map = new HashMap<String, PhoneData>();

		// map에 데이터 넣기. 이 때, value로는 PhoneData 클래스의 객체를 넣어준다.
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i);
			data_map.put(data.name[i], data);
		}

		// for each문을 활용하여 map의 key값과 value값을 출력해본다.
		for (String string : data_map.keySet()) {
			System.out.println(string);
			System.out.println(data_map.get(string).schema.addr);
			System.out.println(data_map.get(string).schema.re_num);
			System.out.println("****************");
		}

	}

	static void solution2() {
		// Comparable로 구현

		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i);
			name_set.add(data.schema);
		}

		for (PhoneS schema : name_set) {
			System.out.println(schema.name);
			System.out.println(schema.addr);
			System.out.println(schema.re_num);
			System.out.println(schema.ph_num);
			System.out.println(schema.email);
			System.out.println("**************");
		}

	}

}