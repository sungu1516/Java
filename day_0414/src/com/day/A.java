package com.day;

public class A implements i_interface {

	// i_interface 의 헤드 부분이 없기 때문에, 바디 부분을 만들 의무가 없다. 따라서 오류 생기지 않음.
	// 만약 인터플레이스 부분에 헤드가 있다면 바디 부분을 만들어줄 의무가 있다.

	// 생성자 만들기. 클래스와 이름이 같게 만든다.
	// 한편, 자바는 생성자가 없는 경우에도 알아서 defalt로 생성자를 만들어준다. 아래의 코드는 디폴트값인 것이다. 하지만 이미 특정
	// 생성자를 만든 경우, 디폴트값은 사라진다.따라서 만들어 놓는 것이 좋다.
	public A() {
		for (int i = 3; i < 4; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i * j);
			}
		}
	}

	public A(int n) {
		for (int i = n; i < n+1; i++) {
			for (int j = 1; j < n+1; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i * j);
			}
		}
	}
	
	public A(String n) {
		System.out.println(n + "생성자");
	}

	@Override // 여기서 오버라이드의 의미? - i_interface라는 인터페이스의 헤드를 가져와서, 바디 부분을 이 클래스 내에서 작성해 줄 것.
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("test_a");
	}

}
