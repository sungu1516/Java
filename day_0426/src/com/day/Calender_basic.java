package com.day;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender_basic {

	public static void main(String[] args) {
		// Calendar Ŭ���� �̿� 
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		 // �Ʒ� �� ��ü�� ���� �ּҸ� ����
//		System.out.println(calendar);
//		System.out.println(calendar2);
		
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1); // month�� 0���� �����ϹǷ�
		System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.SECOND));
		
		
		// Date Ŭ���� �̿�
		Date date = new Date();
		
		System.out.println(date);
		
		String pattern = "yyy/MM/dd/hh:mm:ss"; // �ҹ���, �빮�� �Ű��� ��
		SimpleDateFormat s = new SimpleDateFormat(pattern);
		String datedata = s.format(date);
		System.out.println(datedata);
		
	}

}
