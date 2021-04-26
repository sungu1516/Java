package com.day;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender_basic {

	public static void main(String[] args) {
		// Calendar 클래스 이용 
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		 // 아래 두 객체는 같은 주소를 공유
//		System.out.println(calendar);
//		System.out.println(calendar2);
		
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1); // month는 0부터 시작하므로
		System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.SECOND));
		
		
		// Date 클래스 이용
		Date date = new Date();
		
		System.out.println(date);
		
		String pattern = "yyy/MM/dd/hh:mm:ss"; // 소문자, 대문자 신경써야 함
		SimpleDateFormat s = new SimpleDateFormat(pattern);
		String datedata = s.format(date);
		System.out.println(datedata);
		
	}

}
