package com.day;

public class Reference_and_value_type {

	public static void main(String[] args) {
		// 참조타입과 변수타입
		int[] a = {100, 200}; // 초기화해서 첫 째 값은 100으로

		toString_test(a); // 아래에서 정의한 함수를 사용. 이 때, a는 배열이므로 a의 주소를 넣어주는 것이다.
		System.out.println("배열입니다. : " + a[0]); // 참조타입인 배열을 함수의 인자로 넣어주었기 때문에 실제 배열의 값이 바뀐다.
		toString_test(a[0]); // 위와 다르게 value타입을 넣어준다. 이는 곧 함수의 인자로 a[0]에 해당하는 값만을 넣어주는 것을 의미한다.
		System.out.println("value입니다. : " + a[0]); // 기존 배열의 값은 변하지 않는다.

	}

	static int toString_test(int[] n) {

		n[0] = 500;
		return n[0];
	}

	static int toString_test(int n) {
		n = 1000;
		return n;
	}
}
