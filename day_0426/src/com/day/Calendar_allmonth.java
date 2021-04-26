package com.day;

import java.util.Calendar;

public class Calendar_allmonth {

	public static void main(String[] args) {
		//2021���� �޷��� ����غ���.
		for (int j = 0; j < 12; j++) {

			Calendar calen = Calendar.getInstance();
			calen.set(2021, j, 1); // 5�� 1�Ϸ� ���� ��¥ ���� (1���� 0���� ����)

			int first_day_index = calen.get(Calendar.DAY_OF_WEEK);
			int last_day = calen.getActualMaximum(Calendar.DATE);

			System.out.println(calen.get(Calendar.MONTH) + 1 + "�� �޷�" + "\n");
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");

			for (int k = 0; k < first_day_index - 1; k++) {
				System.out.print("\t");
			}

			int count = 0;
			for (int i = 1; i < last_day + 1; i++) {
				if ((first_day_index + count) % 7 == 0) {
					System.out.print(i + "\n");
					count++;
				} else {
					System.out.print(i + "\t");
					count++;
				}

			}
			System.out.println("\n");

		}

	}

}
