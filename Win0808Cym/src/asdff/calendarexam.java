package asdff;

import java.util.Date;
import java.util.Calendar;

public class calendarexam {

	public static void main(String[] args) {
		Calendar calen = Calendar.getInstance();
		System.out.print("날짜 : ");
		System.out.print(calen.get(Calendar.YEAR)+ "년 ");
		System.out.print(calen.get(Calendar.MONTH)+1+"월 ");
		System.out.print(calen.get(Calendar.DATE) + "일 ");
		System.out.print(calen.get(Calendar.HOUR) + "시 ");
		System.out.print(calen.get(Calendar.MINUTE) + "분 ");
		System.out.println(calen.get(Calendar.SECOND) + "초");
		Date d=calen.getTime();
		System.out.println(d);
		
		calen.set(1991, 6,11,04,00,20);
		System.out.print("내가 태어난 일시는 : ");
		System.out.print(calen.get(Calendar.YEAR)+ "년 ");
		System.out.print(calen.get(Calendar.MONTH)+1+"월 ");
		System.out.print(calen.get(Calendar.DATE) + "일 ");
		System.out.print(calen.get(Calendar.HOUR) + "시 ");
		System.out.print(calen.get(Calendar.MINUTE) + "분 ");
		System.out.println(calen.get(Calendar.SECOND) + "초");
		
	}

}
