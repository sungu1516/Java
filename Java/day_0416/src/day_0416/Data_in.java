package day_0416;

public class Data_in {
	String[] name = {"ȫ�浿", "��ý�", "�Ż��Ӵ�"};
	
	int[] age = {30, 10, 62} ;
	String[] addr = {"�����", "������", "�λ�"};
	String[] phone = {"1234", "4455", "5475"};
	String[] gender= {"��", "��", "��"};
	
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
