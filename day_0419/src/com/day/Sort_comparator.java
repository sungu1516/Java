package com.day;

import java.util.Comparator;
import java.util.TreeSet;

public class Sort_comparator {

	// static 하에 정의됨 - memory 우선할당
	static TreeSet<PhoneS> name_set = new TreeSet<PhoneS>(new Comparator<PhoneS>() {
		@Override
		public int compare(PhoneS o1, PhoneS o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
	});

	public static void main(String[] args) {
		// Comparator로 구현

		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i);
			name_set.add(data.schema);
		}

		System.out.println(name_set);

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
