package asdff;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Timetest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�(������� �������� �����Ͽ� �Է�) : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		LocalDate birth = LocalDate.of(year, month, day);
		LocalDate today = LocalDate.now();
		System.out.println("����� ������ : " + toString(birth));
		System.out.println("������ ��¥�� : " + toString(today));
		System.out.println("���Ϻ��� ���ñ����� �� : "+birth.until(today, ChronoUnit.DAYS));
		System.out.println("���Ϻ��� ���ñ����� �� : "+birth.until(today, ChronoUnit.YEARS));
		System.out.println("==========================");
		LocalDate birth_100 = birth.plusYears(100);
		System.out.println("����� 100���� �Ǵ� ���� : " + toString(birth_100));
		System.out.println("100����� ���� ��(week) �� : " + today.until(birth_100, ChronoUnit.WEEKS));
		
		
		
		
		
		public
		
	}

}
