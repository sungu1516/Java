package JtoJ;

public class Array {

	public static void main(String[] args) {
		// 배열을 만들어보자. 
		
		int[] odds = {1, 3, 5, 7, 9};
		String[] weeks = {"Mon", "Tues", "Wed", "Thur", "Fri", "Sat", "Sun"};

		
		// 다른 방법으로 만들어보기 - 초기값 없이 만들어보기
		
		String[] Weeks = new String[3];
		Weeks[0] = "월";
		Weeks[1] = "화";
		Weeks[2] = "수";
		
		// 배열값에 접근해보자
		
		//System.out.println(weeks[3]);
		
		// for문을 이용하여 weeks의 모든 요일들을 출력해보자
		
		for (int i = 0; i < weeks.length; i++) {
			System.out.println(weeks[i]);
		}
	}

}
