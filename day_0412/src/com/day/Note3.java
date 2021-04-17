package com.day;

public class Note3 {

	public static void main(String[] args) {
		
		String text = "Helloworld;Leesungu;Kakao";
		String[] sa = text.split(";");
		
		char[][] cas = new char[sa.length][];
		
		for (int i = 0; i < sa.length; i++) {
			cas[i] = new char[sa[i].length()];
			for (int j = 0; j < sa[i].length(); j++) {
				cas[i][j] = sa[i].charAt(j);
			}
		}
		
		for (int i = 0; i < cas.length; i++) {
			System.out.println(cas[i]);
		}
		
	}

}
