
public class B {

	public int number = 100;

	public B() {
		System.out.println("B의 기본 생성자입니다.");
	}

	// custom 생성자를 만들어보자

//	public B(int i) {
//		System.out.println("b의 커스텀 생성자 : " + i); // 입력값을 그대로 돌려주는 생성자 함수
	
	public B(int n) {
		this.number = n;
		System.out.println("number값이 변경되었습니다."); 
	}

	
	
	public B(String j) {
		System.out.println("b의 커스텀 생성자 : " + j); // 입력값을 그대로 돌려주는 생성자 함수

	}
	
}
