package com.day;

import java.util.ArrayList;

public class Test extends Thread {
	int seq;

	public Test(int seq) {
		this.seq = seq;
	}

	public void run() {
		System.out.println(this.seq + " thread start");
		try {
			Thread.sleep(10000);
		} catch (Exception e) {

		}
		System.out.println(this.seq + " thread end");
	}

	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) {
			Thread t = new Test(i);
			t.start();
			threads.add(t);
			System.out.println(i +"번째 쓰레드 리스트에 저장 완료!");
		}
		
		for (int i = 0; i < threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				System.out.println("테스트 조인전");
				t.join();
				System.out.println("테스트 조인후");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		System.out.println("main end");
		System.out.println("main end2");
	}

}
