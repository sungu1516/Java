package day_0416;

public class A implements Comparable<A> { // Comparable�� ������ �������̽��̴�. �׻� �Ʒ��� ���� �޼��带 �����ؾ� �Ѵ�.

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
	public int compareTo(A o) { // Ư�� ��ü�� ������, �� ��ü�� �������� �����ִ� ������ �Ѵ�. �Ʒ��� ��� ��ü�� str������ lenth���� ������.
		if (o.str.length() < this.str.length()) { // �켱������ ���ڰ����� ���� �� �տ� �������� �ڵ� ¥����. 
			return 1;
		}else if (o.str.length() < this.str.length()) {
			return -1;
		
		}else		
		return this.str.compareTo(o.str);
		
		
		
	}
}
