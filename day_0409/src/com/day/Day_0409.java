package com.day;

import java.util.Iterator;

public class Day_0409 {

	public static void main(String[] args) {
		array_basic();
	}

	static void array_basic () {
		// 선언과 초기화 한번에
		int[] int_arr = {1, 2, 3};
		
		// 선언을 먼저 해준 후 초기화.
		String[] str_arr = new String[3]; // 크기 설정을 해줘야 한다. 
		str_arr[0] = "Hello"; // 값을 하나하나 넣어준다. 
		str_arr[1] = "Java";
		str_arr[2] = "Im Sungu";
		
		// 출력
		for (int i = 0; i < int_arr.length; i++) {
			System.out.println(int_arr[i]);
		}
		
		for (int i = 0; i < str_arr.length; i++) {
			System.out.println(str_arr[i]);
		}
	}
	
	static void lotto_shuffle() {

		// 번호들을 넣을 배열 만들기
		int[] lotto = new int[45];

		for (int i = 0; i < lotto.length; i++) { // for문을 활용하여 1부터 45까지 삽입
			lotto[i] = i + 1;
		}

		for (int i = 0; i < 1000; i++) { // for문을 통해 숫자를 섞어준다.
			int r = (int) (Math.random() * 44) + 1; // 형변환. () 우선자를 신경써서 작성.
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;

		}

		// 6개 뽑아서 배열에 저장
		int[] lotto_6 = new int[6];

		for (int i = 0; i < lotto_6.length; i++) {
			lotto_6[i] = lotto[i];
		}

		// 오름차순으로 정렬하기
		for (int i = 0; i < lotto_6.length; i++) {
			for (int j = i + 1; j < lotto_6.length; j++) {
				if (lotto_6[i] > lotto_6[j]) {
					int temp = lotto_6[i];
					lotto_6[i] = lotto_6[j];
					lotto_6[j] = temp;
				}
			}
		}
		// 최종 출력
		for (int i = 0; i < lotto_6.length; i++) {
			System.out.println(lotto_6[i]);
		}
	}

	static void asc_ex() {

		// 배열을 활용하여 오름차순 정렬 해보기 + 이중 for문

		int a = 3;
		int b = 6;
		int c = 2;
		int d = 11;
		int e = 1;

		int[] array_int = { a, b, c, d, e };

		for (int i = 0; i < array_int.length; i++) {
			for (int j = 1 + i; j < array_int.length; j++) {
				if (array_int[i] >= array_int[j]) {

					int temp = array_int[i];
					array_int[i] = array_int[j];
					array_int[j] = temp;
					System.out.println("성공"); // 이렇게 한 바퀴가 돌면 a와 나머지 뒤의 수들이 모두 비교가 되고, 결국 맨 앞에 제일 작은 수가 오게 된다. 마찬가지로 i =
												// 1이 되면 두번째 자리에 두번째로 작은 수가 오게 됨.
				}
			}
		}

		for (int i = 0; i < array_int.length; i++) { // 정렬된 결과를 출력해본다.
			System.out.println(array_int[i]);
		}

	}

}
