package com.day;

import java.util.ArrayList;

public class PhoneData implements Comparable<PhoneData> {
	// dao Ŭ������ �ش��Ѵ�.

	public PhoneS schema;

	String[] name = { "�۰���", "����", "�����", "������", "���缮" };
	private String[] addr = { "��⵵ ������", "���� Ư����", "�λ� ������", "��õ ������", "���� ������" };
	private String[] re_num = { "000000-123456", "000000-123456", "000000-123456", "000000-123456", "000000-123456" };
	private String[] ph_num = { "010-1234-5678", "010-4445-3327", "010-6666-3323", "010-0000-1234", "010-5323-7553" };
	private String[] email = { "djer@gmail.com", "djer@gmail.com", "djer@gmail.com", "djer@gmail.com",
			"djer@gmail.com" };
	private String[] service = { "KT", "SKT", "LGU+", "SKT", "KT" };
	private String[] plan = { "40000", "99000", "29000", "89000", "119000" };
	private String[] serial = { "����ȣ_1234", "����ȣ_1234", "����ȣ_1234", "����ȣ_1234", "����ȣ_1234" };

	public PhoneData(int index) { // Ư�� �ε����� ������ �������� �Ѵ�.

		schema = new PhoneS(name[index], addr[index], re_num[index], // schema�� ������ü
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

	// �߰� �޼��� ����
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
