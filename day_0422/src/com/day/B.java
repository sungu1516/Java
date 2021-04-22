package com.day;

import java.util.ArrayList;

public class B extends Bs {
	String[] name = { "송가인", "현빈", "김수현", "아이유", "유재석" };
	private String[] addr = { "경기도 수원시", "서울 특별시", "부산 광역시", "인천 광역시", "대전 광역시" };
	private String[] re_num = { "000000-123456", "000000-123456", "000000-123456", "000000-123456", "000000-123456" };
	private String[] ph_num = { "010-1234-5678", "010-4445-3327", "010-6666-3323", "010-0000-1234", "010-5323-7553" };
	private String[] email = { "djer@gmail.com", "djer@gmail.com", "djer@gmail.com", "djer@gmail.com",
			"djer@gmail.com" };
	private String[] service = { "KT", "SKT", "LGU+", "SKT", "KT" };
	private String[] plan = { "40000", "99000", "29000", "89000", "119000" };
	private String[] serial = { "기계번호_1234", "기계번호_1234", "기계번호_1234", "기계번호_1234", "기계번호_1234" };

	@Override
	public int getLength() {

		return name.length;
	}
	
	@Override
	public ArrayList<String[]> getArr() {
		// TODO Auto-generated method stub
		return null;
	}

	public B(int i) {

		setName(name[i]);
		setAddr(addr[i]);
		setRe_num(re_num[i]);
		setPh_num(ph_num[i]);
		setEmail(email[i]);
		setService(service[i]);
		setPlan(plan[i]);
		setSerial(serial[i]);
	}
	
	public B() {
		
	}

}
