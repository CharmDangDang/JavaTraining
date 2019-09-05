package asdff;

import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.time.zone.*;

public class calendarexam2 {

	public static void main(String[] args) {
		String[] whatday = {"", "�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�(������� �������� �����Ͽ� �Է�) : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		GregorianCalendar birth = new GregorianCalendar(year,month-1,day);
		GregorianCalendar today = new GregorianCalendar();
		long diff = (today.getTimeInMillis()-birth.getTimeInMillis())/1000;
		System.out.println("����� ������ "+printYMD(birth)+whatday[birth.get(birth.DAY_OF_WEEK)]);
		System.out.println("������ "+printYMD(today)+whatday[today.get(today.DAY_OF_WEEK)]);
		System.out.println("�¾�� ���ݱ��� "+diff/(24*60*60)+"���� �������ϴ�.");
		System.out.println("�¾�� ���ݱ��� "+diff/(60*60)+"�ð��� �������ϴ�.");
		birth.roll(Calendar.YEAR,19);
		System.out.println("������ �Ǵ� �ش� :  "+birth.get(birth.YEAR)+"�� �̾����ϴ�.");
		
	}

	private static String printYMD(Calendar c) {
		return c.get(c.YEAR)+ "�� "+(c.get(c.MONTH)+1)+ "�� "+(c.get(c.DATE)+"�� ");
		
	}

}
