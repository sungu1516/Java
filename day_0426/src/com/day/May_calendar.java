package com.day;

import java.util.Calendar;

public class May_calendar {

	public static void main(String[] args) {

		// 5월 달력을 출력해보자
		for (int j = 0; j < 11; j++) {
			Calendar calen = Calendar.getInstance();
			calen.set(2021, j, 1); // 5월 1일로 현재 날짜 지정 (1월은 0부터 시작)

			System.out.println(calen.get(Calendar.MONTH) + 1 + "월 달력" + "\n");
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