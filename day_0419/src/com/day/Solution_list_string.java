package com.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution_list_string {

	public static void main(String[] args) {
		// 새로운 list 만들기
		HashMap<String, PhoneData> name_list = new HashMap<String, PhoneData>();
		ArrayList<String> list_string = new ArrayList<String>();

		// map에 key와 value 넣어주기
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i);
			name_list.put(data.schema.name, data);
		}

		// list_string = new ArrayList<String>(name_list.keySet());
		list_string.addAll(name_list.keySet()); // 자동으로 형변환(set > string)
		System.out.println(list_string.size());

		// Collections.sort(list_array);
		Collections.sort(list_string);

		for (int i = 0; i < list_string.size(); i++) {
			//System.out.println(list_string.get(i));
			System.out.println(name_list.get(list_string.get(i)).schema.name);
			System.out.println(name_list.get(list_string.get(i)).schema.addr);
			System.out.println("*****************");
		}

	}

}
