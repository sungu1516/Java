package com.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution_list_class {

	public static void main(String[] args) {
		// ���ο� ����Ʈ�� ������. �� ��, Ŭ������ ���ҷ� �޴´�.
		HashMap<String, PhoneData> name_list = new HashMap<String, PhoneData>();
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>();

		// map�� key�� value �־��ֱ�
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i);
			name_list.put(data.schema.name, data);
			list_array.add(data); // ������ ���� list_array�� Ŭ���� ��ü�� ����
		}

		// sort�� ���� PhoneData Ŭ������ comparable �� �����ؾ�!

		// Collections.sort(list_array);
		Collections.sort(list_array); // ������ compareTo �� ���� ���� �ǽ�

		is_true();

	}

	static void get_list() {

		// ���ο� ����Ʈ�� ������. �� ��, Ŭ������ ���ҷ� �޴´�.
		HashMap<String, PhoneData> name_list = new HashMap<String, PhoneData>();
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>();

		// map�� key�� value �־��ֱ�
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i);
			name_list.put(data.schema.name, data);
			list_array.add(data); // ������ ���� list_array�� Ŭ���� ��ü�� ����
		}

		Collections.sort(list_array); // ������ compareTo �� ���� ���� �ǽ�

		// PhoneData Ŭ�������� ������ getList �޼��带 �̿��Ͽ� ��ġ�ϴ� ��츸 ����ϱ�

		for (int i = 0; i < list_array.size(); i++) {
			for (int j = 0; j < list_array.get(i).getList().size(); j++) {

				if (list_array.get(i).getList().get(j).equals("�۰���")) {
					System.out.println(list_array.get(i).getList().get(j));

				}
			} // System.out.println("*****************");

		}
	}

	static void is_true() {
		// ���ο� ����Ʈ�� ������. �� ��, Ŭ������ ���ҷ� �޴´�.
		HashMap<String, PhoneData> name_list = new HashMap<String, PhoneData>();
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>();

		// map�� key�� value �־��ֱ�
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i);
			name_list.put(data.schema.name, data);
			list_array.add(data); // ������ ���� list_array�� Ŭ���� ��ü�� ����
		}

		Collections.sort(list_array); // ������ compareTo �� ���� ���� �ǽ�
		String temp = "�̼���";

		// PhoneData Ŭ�������� ������ is_true �޼��带 �̿��Ͽ� ��ġ ���� ����

		if (list_array.get(0).is_true(temp)) {
			System.out.println("id �ߺ�(�ٸ� ���̵� ����ϼ���)");
		}
		// id�� �ߺ����� �ʾ��� ��
		else {
			System.out.println("id ��� ����");
			name_list.put(temp, new PhoneData(temp, "���� ������", "00000-1234", "010-7587-1111", "dddd@adf.com", "SKT",
					"30000", "sam-014")); // �ߺ����� ���� ��� ���� map�� �߰������� ������ �־��ش�!
		}

	}

}
