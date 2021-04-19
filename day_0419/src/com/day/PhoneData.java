package com.day;

import java.util.ArrayList;

public class PhoneData implements Comparable<PhoneData> {
	// dao 클래스에 해당한다.

	public PhoneS schema;

	String[] name = { "송가인", "현빈", "김수현", "아이유", "유재석" };
	private String[] addr = { "경기도 수원시", "서울 특별시", "부산 광역시", "인천 광역시", "대전 광역시" };
	private String[] re_num = { "000000-123456", "000000-123456", "000000-123456", "000000-123456", "000000-123456" };
	private String[] ph_num = { "010-1234-5678", "010-4445-3327", "010-6666-3323", "010-0000-1234", "010-5323-7553" };
	private String[] email = { "djer@gmail.com", "djer@gmail.com", "djer@gmail.com", "djer@gmail.com",
			"djer@gmail.com" };
	private String[] service = { "KT", "SKT", "LGU+", "SKT", "KT" };
	private String[] plan = { "40000", "99000", "29000", "89000", "119000" };
	private String[] serial = { "기계번호_1234", "기계번호_1234", "기계번호_1234", "기계번호_1234", "기계번호_1234" };

	public PhoneData(int index) { // 특정 인덱스의 정보를 가져오게 한다.

		schema = new PhoneS(name[index], addr[index], re_num[index], // schema는 의존객체
				ph_num[index], email[index], service[index], plan[index], serial[index]);

	}

	public PhoneData(String n, String a, String renum, String phnum, String e, String ser, String p, String se) {
		schema = new PhoneS(n, a, renum, phnum, e, ser, p, se);
	}

	@Override
	public int compareTo(PhoneData o) {
		// TODO Auto-generated method stub
		return this.schema.name.compareTo(o.schema.name);
	}

	// 추가 메서드 정의
	public boolean is_true(String input) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) == input)
				return true;
		}
		return false;
	}

	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]);
		}
		return list;
	}

}
