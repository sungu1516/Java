package com.day;

import java.util.Calendar;

public class Calendar_allmonth {

	public static void main(String[] args) {
		//2021년의 달력을 출력해보자.
		for (int j = 0; j < 12; j++) {

			Calendar calen = Calendar.getInstance();
			calen.set(2021, j, 1); // 5월 1일로 현재 날짜 지정 (1월은 0부터 시작)

			int first_day_index = calen.get(Calendar.DAY_OF_WEEK);
			int last_day = calen.getActualMaximum(Calendar.DATE);

			System.out.println(calen.get(Calendar.MONTH) + 1 + "월 달력" + "\n");
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
