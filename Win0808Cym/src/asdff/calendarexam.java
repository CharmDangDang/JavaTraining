package asdff;

import java.util.Date;
import java.util.Calendar;

public class calendarexam {

	public static void main(String[] args) {
		Calendar calen = Calendar.getInstance();
		System.out.print("��¥ : ");
		System.out.print(calen.get(Calendar.YEAR)+ "�� ");
		System.out.print(calen.get(Calendar.MONTH)+1+"�� ");
		System.out.print(calen.get(Calendar.DATE) + "�� ");
		System.out.print(calen.get(Calendar.HOUR) + "�� ");
		System.out.print(calen.get(Calendar.MINUTE) + "�� ");
		System.out.println(calen.get(Calendar.SECOND) + "��");
		Date d=calen.getTime();
		System.out.println(d);
		
		calen.set(1991, 6,11,04,00,20);
		System.out.print("���� �¾ �Ͻô� : ");
		System.out.print(calen.get(Calendar.YEAR)+ "�� ");
		System.out.print(calen.get(Calendar.MONTH)+1+"�� ");
		System.out.print(calen.get(Calendar.DATE) + "�� ");
		System.out.print(calen.get(Calendar.HOUR) + "�� ");
		System.out.print(calen.get(Calendar.MINUTE) + "�� ");
		System.out.println(calen.get(Calendar.SECOND) + "��");
		
	}

}
