package net.tis.day24;

import java.util.Scanner;


public class SJTest {
	public static void main(String[] args) {
		// kor,eng,tot����, double avg���, String msg, char grade����
		// ���� 1] try~catch������, ScannerŬ����, ����, �����Է¾ȳ���>>>
		// ���� 2] �հ�,���,����ó�� switch,����� ���׿���
		
		
		Scanner sc = new Scanner(System.in);
		int tot = 0, kor = 0, eng = 0;
		double avg = 0.0;
		String msg = "����";
		char grade = 'F';
		
		tot = kor + eng;
		avg = (double) tot / 2;
		
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F';
		}
		while(true) {
		try {
			
			System.out.println("����, ���� ������ �Է��Ͻÿ�.");
			System.out.println(">>>");
			kor = sc.nextInt();
			System.out.println(">>>");
			eng = sc.nextInt();
			
			
		} catch (Exception e) {continue;}
			break;
		}
		if(avg>=70 && kor>= 60 && eng >=60) {
			msg = "���հ�";
		}
		else {
			msg = "�����";
		}
		System.out.println("\n���� = "+tot);
		System.out.println("��� = "+avg);
		System.out.println("���� = "+grade);
		System.out.println("��� = "+msg);
		sc.close();
	}// main END
}// class END
