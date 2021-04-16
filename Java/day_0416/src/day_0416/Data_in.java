package day_0416;

public class Data_in {
	String[] name = {"홍길동", "김시습", "신사임당"};
	
	int[] age = {30, 10, 62} ;
	String[] addr = {"서울시", "성남시", "부산"};
	String[] phone = {"1234", "4455", "5475"};
	String[] gender= {"남", "남", "여"};
	
	int avg() {
		int re = 0;
		
		for (int i = 0; i < age.length; i++) {
			re += age[i];			
		}
		
		return re/age.length;
	}
	
	int total() {
		int re = 0;
		
		for (int i = 0; i < age.length; i++) {
			re += age[i];			
		}
		
		return re;
	}
	
	public Data_in() {
		// TODO Auto-generated constructor stub
	}
}
