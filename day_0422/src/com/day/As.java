package com.day;

import java.util.ArrayList;

public abstract class As implements I {

	String name;
	int age;
	String addr;
	String phone;
	String gender;
	ArrayList<String> list = null;

	@Override
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(name);
		list.add(age + "");
		list.add(addr);
		list.add(phone);
		list.add(gender);
		return list;
	}


	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

}
