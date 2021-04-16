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

	static void sort_class_by_comparable() {
		TreeSet<A> at = new TreeSet<A>();
		HashSet<A> a = new HashSet<A>();

		ArrayList<A> list = new ArrayList<A>();

		// 숫자 비교
//		A a1 = new A();
//		a1.count = 100;
//		at.add(a1);
//		A a2 = new A();
//		a2.count = 50;
//		at.add(a2);

		// 글자수 비교

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

		a.add(new A()); // 클래스로 찍어낸 새로운 객체 삽입
		a.add(new A());
		a.add(new A());
		A aa = new A();
		a.add(aa);
		a.add(aa); // 클래스도 마찬가지로, 중복되는 클래스는 삽입되지 않는다.

		list.add(a3);
		list.add(a4);
		list.add(a5);

		Collections.sort(list); // 리스트에 있는 클래스들을 정렬한다.

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

	static void sort_comparable_str() {
		TreeSet<A> tree_set = new TreeSet<A>();
		ArrayList<A> list = new ArrayList<A>();

		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();

		a1.str = "나";
		a2.str = "가가가가가";
		a3.str = "다다";
		a4.str = "라";

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
		// key : 이름 class 나이 주소 핸드폰 성별

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
