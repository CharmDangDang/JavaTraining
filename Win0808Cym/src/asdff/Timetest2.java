package asdff;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Timetest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생일 입력(년월일을 공백으로 구분하여 입력) : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		LocalDate birth = LocalDate.of(year, month, day);
		LocalDate today = LocalDate.now();
		System.out.println("당신의 생일은 : " + toString(birth));
		System.out.println("오늘의 날짜는 : " + toString(today));
		System.out.println("생일부터 오늘까지의 일 : "+birth.until(today, ChronoUnit.DAYS));
		System.out.println("생일부터 오늘까지의 년 : "+birth.until(today, ChronoUnit.YEARS));
		System.out.println("==========================");
		LocalDate birth_100 = birth.plusYears(100);
		System.out.println("당신이 100살이 되는 날은 : " + toString(birth_100));
		System.out.println("100살까지 남은 주(week) 수 : " + today.until(birth_100, ChronoUnit.WEEKS));
		
		
		
		
		
		public
		
	}

}
