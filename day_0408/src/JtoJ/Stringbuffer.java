package JtoJ;

public class Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hi");
		sb.append(", my name is Leesungu.");
		System.out.println(sb);
		
		/*
		 �� ������ String ���� �Ѵٸ�?
		 */
	
		String str = "";
		str += "Hi";
		str += ", my name is LeeSungu";         // �� ��� ���� stringbuffer���� �ٸ��� + ���궧���� ���ο� ��ü�� ���������.
		System.out.println(str); 
	
		
		
		//insert
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("I like Java more than Python");
		sb2.insert(0, "Actually, ");
		System.out.println(sb2);
		
		//substring
		
		StringBuffer sb21 = new StringBuffer();
		sb21.append("I like Java more than Python");
		sb21.insert(0, "Actually, ");
		int max_idx = sb21.length() - 1;
		System.out.println(sb21.substring(max_idx-5, max_idx+1));
	
		
	}

}
