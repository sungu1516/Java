package com.day;

public class Name implements Comparable<Name>{

		String name;
		
		public Name(String n) {
			this.name = n;
		}
		
		@Override
		public int compareTo(Name o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
		}
		
}
