package com.day;

import java.util.ArrayList;

public class As implements I {

	String name;
	int age;
	String addr;
	String phone;
	String gender;
	ArrayList<String> list = null;

	@Override
	public ArrayList<String> getList() {
		list = new ArrayList<String>();
		list.add(name);
		list.add(age + "");
		list.add(addr);
		list.add(phone);
		list.add(gender);
		return list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
