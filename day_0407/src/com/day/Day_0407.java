package com.day;

public class Day_0407 {

	public static void main(String[] args) {

		sum_v(3);

	}

	/*
	 * 아래부터 내가 정의한 함수들. 아직 자세하게 공부하진 않았지만 static 선언 뒤에 함수를 정의해준다. 이후 정의한 함수를 사용하기
	 * 위해선 위의 메인 함수를 이용한다. 메인 함수의 작동 원리나, 위의 코드가 무엇을 의미하는 지는 조금 더 공부해봐야 할 듯 하다.
	 */

	static void add_v(int a, int b) {
		int result = a + b;
		System.out.println(result);

	}

	static int swit_1(int c) {
		int sum = 0;
		switch (c) {
		case 0:
			sum += c;
			c++;

		case 1:
			sum += c;
			c++;

		case 2:
			sum += c;
			c++;

		case 3:
			sum += c;
			c++;
			// 만약 여기서 case 100으로 설정해줘도 결과는 같다. 한번 걸리면 break가 없는 한 계속해서 실행된다.

		case 4:
			sum += c;
			c++;

		case 5:
			sum += c;
			c++;

		case 6:
			sum += c;
			c++;

		case 7:
			sum += c;
			c++;

		case 8:
			sum += c;
			c++;

		case 9:
			sum += c;
			c++;

		case 10:
			sum += c;
			c++;
		}

		if (sum == 45) {
			return sum;
		} else
			return sum * 10; // return 코드 아래의 내용들은 절대 실행되지 않는다. 즉 return을 호출하는 메서드 자체를 나가버린다.
	}

	static void sub_v(int n) {
		int tot = 0;

		switch (n) {
		case 0:
			tot -= n;
			n++;

		case 1:
			tot -= n;
			n++;

		case 2:
			tot -= n;
			n++;

		case 3:
			tot -= n;
			n++;
			// 만약 여기서 case 100으로 설정해줘도 결과는 같다. 한번 걸리면 break가 없는 한 계속해서 실행된다.

		case 4:
			tot -= n;
			n++;

		case 5:
			tot -= n;
			n++;

		case 6:
			tot -= n;
			n++;

		case 7:
			tot -= n;
			n++;

		case 8:
			tot -= n;
			n++;

		case 9:
			tot -= n;
			n++;

		case 10:
			tot -= n;
			n++;

		default:
			System.out.println("Total : " + tot);
			// break;
		}
	}

	/*
	 * 아래는 같은 이름의 함수를 여러번 정의한 것. 매개변수의 타입이 다른 경우, 이렇게 동일한 이름의 함슈를 만드는 것이 가능하다. 변수자체의
	 * 이름(n) 이 같은 것은 상관 없음.
	 */

	static void sum_v(int n) {

		int sum = 0;
		switch (n) {
		case 0:
			sum += n;
			n++;

		case 1:
			sum += n;
			n++;

		case 2:
			sum += n;
			n++;

		case 3:
			sum += n;
			n++;
			// 만약 여기서 case 100으로 설정해줘도 결과는 같다. 한번 걸리면 break가 없는 한 계속해서 실행된다.

		case 4:
			sum += n;
			n++;

		case 5:
			sum += n;
			n++;

		default:
			System.out.println("Total : " + sum);
			// break;
		}

	}

	static void sum_v(String n) {
		System.out.println(n);
	}

	static void gugu(int n) {
		for (int i = n; i <= n; i++) {

			System.out.println(i + "단출력");
			for (int j = 1; j < 20; j++) {
				System.out.println(String.format("%d * %d = %d", i, j, i * j));
			}
			System.out.println("\n");
		}
	}

	// 메서드를 만드는데, 인자값을 9-19까지만 받는다.

	static void GuGu(int n) {

		if (n <= 9)
			n = 10;
		else if (n >= 21)
			n = 20;

		for (int i = 2; i < n; i++) {
			gugu(i);
		}
	}

	static void GU(int n) {
		if (n > 19) {
			for (int i = 2; i < 19; i++) {
				gugu(i);
			}
		}

		for (int i = 2; i < Math.max(n + 1, 10); i++) {
			gugu(i);
		}
	}

}
