
public class Add_Note {

	public static void main(String[] args) {
		Gugudan gugu = new Gugudan(); // 객체 gugu는 Gugudan 클래스 안에 있는 모든 메서드와 변수를 사용할 수 있음. 포함함.
		gugu.Gugudan_method(8);
//		System.out.println(gugu.list);
//		System.out.println(gugu.list.get(0).array_string[0]);
		
		for (int i = 0; i < gugu.list.size(); i++) {
			System.out.println(gugu.list.size());
			for (int j = 0; j < gugu.list.get(i).array_string.length; j++) {
				System.out.println(gugu.list.get(i).array_string[j]);
			}
			System.out.println("***************");
		}
		
		
		//gugu.Gugudan_method(3, 7);
	}	

}
