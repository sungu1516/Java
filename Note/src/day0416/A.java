package day0416;

import java.util.TreeSet;

public class A implements Comparable<A>{
	
	int count;
	String str;
	
	@Override
	public int compareTo(A o) {
		System.out.println(o.count + "에 대해서 실행"); // 클래스에 의해 만들어진 객체가 set에 추가될 때 실행됨
		if (this.count < o.count) { // 내림차순으로 정렬을 해보자. 
			System.out.println("test : " + this.count);
			return 1;
		}else {
			return -1;
		}
	}
	
//	@Override
//	public int compareTo(A o) {
//		// TODO Auto-generated method stub
//	
//		return str.compareTo(o.str); // 문자열 정렬
//	}
	
}
