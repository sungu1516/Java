package com.day;

public class Mainclass {

	public static void main(String[] args) {

		// 30을 입력하면 년단위로 파일을 만들되 시작년도는 2000
		Thread threadA = new ThreadA(30);

		threadA.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("main end");
		}
		System.out.println("main complete");
	}

}
