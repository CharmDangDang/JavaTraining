package asdff;

import java.io.FileWriter;
import java.util.Scanner;

public class FileTMRl {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String source = "��� �־�� ��μ� ���������� ���\n" + " ������ ����Ѵٴ� ����\n" + " ����� �������� ��ħ�� �´´ٴ� ���Դϴ�.\n";
		char input[] = new char[source.length()];
		source.getChars(0, source.length(),input, 0);
		System.out.print("���ϸ��� �Է��ϼ��� : ");
		String s = sc.next();
		FileWriter fw = new FileWriter(s);
		fw.write(input);
		fw.close();
		System.out.println(s+"������ �����Ǿ����ϴ�");
	}

}
