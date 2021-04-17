package com.day;

import java.util.HashSet;
import java.util.TreeSet;

public class Set_basic {

	public static void main(String[] args) {

		HashSet<Integer> set_list = new HashSet<Integer>();
		TreeSet<Integer> tree_set = new TreeSet<Integer>();

		set_list.add(100);
		set_list.add(200);
		set_list.add(300);
		set_list.add(400);
		set_list.add(400);

		System.out.println(set_list.size());

		// set의 원소를 출력하는 방법?
		for (int i : set_list) { // 일반적인 for구문과는 다른 것을 알 수 있다. 한 편, hash의 경우 순서가 존재하지 않음.
			System.out.println(i);
		}

		// 이제 Treeset 에 원소를 추가하여 출력해보자.

		tree_set.add(100);
		tree_set.add(200);
		tree_set.add(300);
		tree_set.add(400);
		tree_set.add(400);

		System.out.println(tree_set.size());

		// set의 원소를 출력하는 방법?
		for (int i : tree_set) { // hash와는 다르게, 순서가 존재한다!
			System.out.println(i);
		}

	}

}
