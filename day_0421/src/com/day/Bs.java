package com.day;

import java.util.ArrayList;

public class Bs implements I {
	String name;
	String addr;
	String re_num;
	String ph_num;
	String email;
	String service;
	String plan;
	String serial;

	@Override
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(name);
		list.add(addr);
		list.add(re_num);
		list.add(ph_num);
		list.add(email);
		list.add(service);
		list.add(plan);
		list.add(serial);
		return list;
	}

	// Generate Setters

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setRe_num(String re_num) {
		this.re_num = re_num;
	}

	public void setPh_num(String ph_num) {
		this.ph_num = ph_num;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setService(String service) {
		this.service = service;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

}
