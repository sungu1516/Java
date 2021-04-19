package com.day;

public class PhoneS implements Comparable<PhoneS>{
	// 스키마에 해당
	
	String name;
	String addr;
	String re_num;
	String ph_num;
	String email;
	String service;
	String plan;
	String serial;

	public PhoneS(String name, String addr, String re_num, String ph_num, String email, String service, String plan,
			String serial) {
		super();
		this.name = name;
		this.addr = addr;
		this.re_num = re_num;
		this.ph_num = ph_num;
		this.email = email;
		this.service = service;
		this.plan = plan;
		this.serial = serial;
	}

	public PhoneS() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(PhoneS o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}
