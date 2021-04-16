package day_0416;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Day_0416 {

	static void set_basic() {
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

	static void sort_class_by_comparable() {
		TreeSet<A> at = new TreeSet<A>();
		HashSet<A> a = new HashSet<A>();

		ArrayList<A> list = new ArrayList<A>();

		// ���� ��
//		A a1 = new A();
//		a1.count = 100;
//		at.add(a1);
//		A a2 = new A();
//		a2.count = 50;
//		at.add(a2);

		// ���ڼ� ��

		A a3 = new A();
		a3.str = "aaaaaaaa";
		at.add(a3);
		A a4 = new A();
		a4.str = "eeeeeee";
		at.add(a4);
		A a5 = new A();
		a5.str = "ccccccc";
		at.add(a5);

//		at.add(new A());
//		at.add(new A());
//		System.out.println(at.size());

		for (A i : at) {
			System.out.println(i.str);
			// System.out.println(i.compareTo(a3));
		}

		a.add(new A()); // Ŭ������ �� ���ο� ��ü ����
		a.add(new A());
		a.add(new A());
		A aa = new A();
		a.add(aa);
		a.add(aa); // Ŭ������ ����������, �ߺ��Ǵ� Ŭ������ ���Ե��� �ʴ´�.

		list.add(a3);
		list.add(a4);
		list.add(a5);

		Collections.sort(list); // ����Ʈ�� �ִ� Ŭ�������� �����Ѵ�.

		for (A i : list) {
			System.out.println(i.str);
			// System.out.println(i.compareTo(a3));
		}
		// System.out.println(a.size());
	}

	static void sort_by_comparator() {
//		HashSet<Integer> set = new HashSet<Integer>();
		TreeSet<A> set = new TreeSet<A>(new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				// TODO Auto-generated method stub
				return o1.count - o2.count;
			}
		});
	}

	static void lamda() {
		// �����Լ�(�����Լ�) ����
		TreeSet<A> set = new TreeSet<A>((x, y) -> { // �����ϰ� ���� ������ ������ �� �ִ�.
			return y.count - x.count;

		});

		// ���� ��

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

	static void sort_comparable_str() {
		TreeSet<A> tree_set = new TreeSet<A>();
		ArrayList<A> list = new ArrayList<A>();

		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();

		a1.str = "��";
		a2.str = "����������";
		a3.str = "�ٴ�";
		a4.str = "��";

		tree_set.add(a1);
		tree_set.add(a2);
		tree_set.add(a3);
		tree_set.add(a4);

		for (A a : tree_set) {
			System.out.println(a.str);
		}
	}

	public static void main(String[] args) {

		// map
		// key : �̸� class ���� �ּ� �ڵ��� ����

		HashMap<String, Data> map = new HashMap<String, Data>();

		Data_in data = new Data_in();
		for (int i = 0; i < data.name.length; i++) {
			Data p_data = new Data(data.age[i], data.addr[i], data.phone[i], data.gender[i]);
			map.put(data.name[i], p_data);
		}

		for (String string : map.keySet()) {
			Data p_data = map.get(string);
			System.out.println(string + '\t');
			System.out.println(p_data.age + '\t');
			System.out.println(p_data.addr + '\t');
			System.out.println(p_data.phone + '\t');
			System.out.println(p_data.gender + '\t');
			System.out.println();
		}
		
		System.out.println(data.avg());
		System.out.println(data.total());
		
	}

}
