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

		// set�� ���Ҹ� ����ϴ� ���?
		for (int i : set_list) { // �Ϲ����� for�������� �ٸ� ���� �� �� �ִ�. �� ��, hash�� ��� ������ �������� ����.
			System.out.println(i);
		}

		// ���� Treeset �� ���Ҹ� �߰��Ͽ� ����غ���.

		tree_set.add(100);
		tree_set.add(200);
		tree_set.add(300);
		tree_set.add(400);
		tree_set.add(400);

		System.out.println(tree_set.size());

		// set�� ���Ҹ� ����ϴ� ���?
		for (int i : tree_set) { // hash�ʹ� �ٸ���, ������ �����Ѵ�!
			System.out.println(i);
		}

	}

}
