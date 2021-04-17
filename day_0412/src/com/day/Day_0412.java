package com.day;

import java.util.Iterator;

public class Day_0412 {

	static void arr2d_basic() {
		// 2차배열

		int[][] array = new int[3][]; // array라는 2차 배열 안에 주소를 저장할 공간을 3개 만든다.

		array[0] = new int[3]; // 이는 쉽게 말해 1차 배열을 3개 만드는 것을 의미한다. 하지만 단순히 서로 다른 1차배열 3개를 만드는 것과는 다르다.

		array[1] = new int[3]; // 2차 배열을 통해 3개의 배열을 만드는 것의 장점은, 예컨대 for문을 통해 보다 더 간단하게 배열의 값을 저장할 수 있다는 것이다.
		array[2] = new int[3]; // 참조타입이다.

		array[0][0] = 100; // 이는 직접 하나하나 대입. 아래와 같이 for문을 통해 간단하게 입력 가능.
		array[0][1] = 200; // 참조타입이다.
		array[0][2] = 300;

		array[1][0] = 100;
		array[1][1] = 200;
		array[1][2] = 300;

		array[2][0] = 100;
		array[2][1] = 200;
		array[2][2] = 300;

		// for문으로 2차배열에 값 대입
//		System.out.println(array);               // 가장 상위 배열인 2차 배열의 주소. 배열의 배열들을 관리 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
//				array[i][j] = (j+1)*100;
//				System.out.println(array[i]);                    // 이는 주소를 저장하는 공간. 또한 하위 배열인 1차배열의 주소를 의미한다. 
//				System.out.println(array[i][j]);                 // 이는 변수를 저장하는 공간 
			}
		}
	}

	static String text_f() {
		return "helloworld";
	}

	public static void main(String[] args) {

		// String 타입 또한 배열이라는 것을 생각하며, 관련 내용을 공부해보자.

		String text = text_f();

		String text2 = "helloworld";
		String text3 = new String("helloworld");
		String text4 = text; // 이 경우 text의 주소를 그대로 text4로 넘겨준다.

		if (text_f() == text4) // string의 경우 참조타입의 변수이기 때문에, value를 비교하는 것이 아니라 주소를 비교하게 된다.
			System.out.println("두 주소가 같다");
		else
			System.out.println("주소가 다르다");

	}

}
