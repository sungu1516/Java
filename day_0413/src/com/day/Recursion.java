package com.day;

public class Recursion {

	public static void main(String[] args) {
		test_1(10);

	}

	static int test_1(int c) {
		System.out.println(c);
		// for 문 사용하지 않고 반복문 탈출하기 - 재귀함수 사용
		if (c == 0) // 탈출을 위해 if문 넣어준다.
			return 0;
		else {
			return test_1(--c);
		}
	}

	static void test_2(int c) {
		System.out.println(c);
		// for문을 사용하지 않고 반복 돌려보기 - 재귀함수 사용2
		if (c == 0) // 탈출을 위해 if문 넣어준다.
			return;
		else
			test_2(--c);
	}

	static void test_eternal() {
		// 재귀함수의 예시
		System.out.println("test");
		test_eternal();
	}

}
