package com.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Day_0416 {

	public static void main(String[] args) {
		HashMap<String, Data> map = new HashMap<String, Data>();

		Data_in db = new Data_in(); // db객체를 생성함으로서 raw data에 접근할 수 있게 함 

		// for문을 사용하여 map에 데이터를 넣어준다.
		for (int i = 0; i < db.name.length; i++) {
			Data p_data = new Data(db.age[i], db.addr[i], db.phone[i], db.gender[i]);
			map.put(db.name[i], p_data);
		}
				
		// 출력
		for (String name : map.keySet()) {
			Data p_data = map.get(name);
			System.out.println(name);
			System.out.println(p_data.age);
			System.out.println(p_data.addr);
			System.out.println(p_data.phone);
			System.out.println(p_data.gender);
			System.out.println("*******************");
		}
	}

	static void sort_by_comparator() {

		TreeSet<A> set = new TreeSet<A>(new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				// TODO Auto-generated method stub
				return o1.count - o2.count;
			}
		});

		A a = new A();
		a.count = 200;
		set.add(a);
		A b = new A();
		b.count = 300;
		set.add(b);
		A c = new A();
		c.count = 100;
		set.add(c);

		for (A i : set) {
			System.out.println(i.count);
		}
	}

	static void lamda() {
		// 람다함수(무명함수) 정의
		TreeSet<A> set = new TreeSet<A>((x, y) -> { // 간편하게 정렬 조건을 설정할 수 있다.
			return y.count - x.count;

		});

		// 숫자 비교

		A a1 = new A();
		a1.count = 1;
		set.add(a1);
		A a2 = new A();
		a2.count = 2;
		set.add(a2);
		A a3 = new A();
		a3.count = 3;
		set.add(a3);

		for (A a : set) {
			System.out.println(a.count);
		}
	}

}
