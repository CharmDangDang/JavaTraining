package asdff;

import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.time.zone.*;

public class calendarexam2 {

	public static void main(String[] args) {
		String[] whatday = {"", "일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		Scanner sc = new Scanner(System.in);
		System.out.print("생일 입력(년월일을 공백으로 구분하여 입력) : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		GregorianCalendar birth = new GregorianCalendar(year,month-1,day);
		GregorianCalendar today = new GregorianCalendar();
		long diff = (today.getTimeInMillis()-birth.getTimeInMillis())/1000;
		System.out.println("당신의 생일은 "+printYMD(birth)+whatday[birth.get(birth.DAY_OF_WEEK)]);
		System.out.println("오늘은 "+printYMD(today)+whatday[today.get(today.DAY_OF_WEEK)]);
		System.out.println("태어나서 지금까지 "+diff/(24*60*60)+"일이 지났습니다.");
		System.out.println("태어나서 지금까지 "+diff/(60*60)+"시간이 지났습니다.");
		birth.roll(Calendar.YEAR,19);
		System.out.println("성년이 되는 해는 :  "+birth.get(birth.YEAR)+"년 이었습니다.");
		
	}

	private static String printYMD(Calendar c) {
		return c.get(c.YEAR)+ "년 "+(c.get(c.MONTH)+1)+ "월 "+(c.get(c.DATE)+"일 ");
		
	}

}
