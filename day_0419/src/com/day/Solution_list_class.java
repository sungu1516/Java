package com.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution_list_class {

	public static void main(String[] args) {
		// 새로운 리스트를 만들자. 이 때, 클래스를 원소로 받는다.
		HashMap<String, PhoneData> name_list = new HashMap<String, PhoneData>();
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>();

		// map에 key와 value 넣어주기
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i);
			name_list.put(data.schema.name, data);
			list_array.add(data); // 위에서 만든 list_array에 클래스 객체를 대입
		}

		// sort를 위해 PhoneData 클래스가 comparable 을 구현해야!

		// Collections.sort(list_array);
		Collections.sort(list_array); // 정의한 compareTo 에 따라 정렬 실시

		is_true();

	}

	static void get_list() {

		// 새로운 리스트를 만들자. 이 때, 클래스를 원소로 받는다.
		HashMap<String, PhoneData> name_list = new HashMap<String, PhoneData>();
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>();

		// map에 key와 value 넣어주기
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i);
			name_list.put(data.schema.name, data);
			list_array.add(data); // 위에서 만든 list_array에 클래스 객체를 대입
		}

		Collections.sort(list_array); // 정의한 compareTo 에 따라 정렬 실시

		// PhoneData 클래스에서 정의한 getList 메서드를 이용하여 일치하는 경우만 출력하기

		for (int i = 0; i < list_array.size(); i++) {
			for (int j = 0; j < list_array.get(i).getList().size(); j++) {

				if (list_array.get(i).getList().get(j).equals("송가인")) {
					System.out.println(list_array.get(i).getList().get(j));

				}
			} // System.out.println("*****************");

		}
	}

	static void is_true() {
		// 새로운 리스트를 만들자. 이 때, 클래스를 원소로 받는다.
		HashMap<String, PhoneData> name_list = new HashMap<String, PhoneData>();
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>();

		// map에 key와 value 넣어주기
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i);
			name_list.put(data.schema.name, data);
			list_array.add(data); // 위에서 만든 list_array에 클래스 객체를 대입
		}

		Collections.sort(list_array); // 정의한 compareTo 에 따라 정렬 실시
		String temp = "이선구";

		// PhoneData 클래스에서 정의한 is_true 메서드를 이용하여 일치 여부 리턴

		if (list_array.get(0).is_true(temp)) {
			System.out.println("id 중복(다른 아이디를 사용하세요)");
		}
		// id가 중복되지 않았을 때
		else {
			System.out.println("id 사용 가능");
			name_list.put(temp, new PhoneData(temp, "서울 성동구", "00000-1234", "010-7587-1111", "dddd@adf.com", "SKT",
					"30000", "sam-014")); // 중복되지 않은 경우 기존 map에 추가적으로 정보를 넣어준다!
		}

	}

}
