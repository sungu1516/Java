package com.day;

import java.util.Calendar;

public class May_calendar {

	public static void main(String[] args) {

		// 5�� �޷��� ����غ���
		for (int j = 0; j < 11; j++) {
			Calendar calen = Calendar.getInstance();
			calen.set(2021, j, 1); // 5�� 1�Ϸ� ���� ��¥ ���� (1���� 0���� ����)

			System.out.println(calen.get(Calendar.MONTH) + 1 + "�� �޷�" + "\n");
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");

			int count = 0;

			for (int i = 0; i < calen.getActualMaximum(Calendar.DATE); i++) {

				if (i == 0) {
					System.out.print("\t\t\t\t\t\t" + calen.get(Calendar.DATE) + "\n\n");
				} else {
					System.out.print(calen.get(Calendar.DATE) + i + "\t");
					count++;
					if (count == 7) {
						System.out.println("\n");
						count = 0;
					}

				}
			
			}

		}

	}

}