package day_0416;

public class A implements Comparable<A> { // Comparable은 일종의 인터페이스이다. 항상 아래와 같은 메서드를 구현해야 한다.

	int count;
	String str;

	public A() {
		// TODO Auto-generated constructor stub
	}
	
	public A(int n, String s) {
		this.count = n;
		this.str = s;
	}
	
	
	@Override
	public int compareTo(A o) { // 특정 객체가 들어오면, 그 객체의 변수값을 비교해주는 역할을 한다. 아래의 경우 객체의 str변수의 lenth값을 비교해줌.
		if (o.str.length() < this.str.length()) { // 우선적으로 글자개수가 적을 때 앞에 나오도록 코드 짜보자. 
			return 1;
		}else if (o.str.length() < this.str.length()) {
			return -1;
		
		}else		
		return this.str.compareTo(o.str);
		
		
		
	}
}
