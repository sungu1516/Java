package jump2java;

public class Stringg {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String c = new String("Hello");
		String d = "Hi, my name is LeeSungu";
		
//		System.out.println(a.equals(b));
//		System.out.println(a==b);
//		System.out.println(a.equals(c));
//		System.out.println(a==c);
		
		System.out.println(d.indexOf("is"));
		
		System.out.println(d.replaceAll("LeeSungu", "KimHoyeon"));
		System.out.println(d.substring(15, 23));
		System.out.println(d.toUpperCase());
	
	}
	
}
