package sample.tis.day17;

import java.util.Scanner;

public class TestNestedIf {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		char grade = 0;
		System.out.println("����, ����, ���� ������ �Է��ϼ���.");
		System.out.println(">>>");
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		System.out.println("�г��� �Է��ϼ���(1~4)");
		int year = scan.nextInt();
		if(year>4 || year<1) {
			System.out.println("�ش� �г��� �����ϴ�.");
			scan.close();
		}
		
		sum = num1 + num2 + num3;
		avg = (double)sum/3;
		
		if(avg >=60) {
			if(year != 4) {
				System.out.println("�հ� �Դϴ�!");
			}
			else if(avg >= 70) {
				System.out.println("�հ� �Դϴ�!");
			}
			else {
				System.out.println("���հ� �Դϴ�!");
			}
		}
		else {
			System.out.println("���հ� �Դϴ�!");
		}
		
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			if (avg < 90) {
				grade = 'B';
			}
		} else if (avg >= 70) {
			if (avg < 80) {
				grade = 'C';
			}
		} else if (avg >= 60) {
			if (avg < 70) {
				grade = 'D';
			}
		} else {
			grade = 'F';
		}
		System.out.println("����� ������? = " + sum);
		System.out.println("����� �����? = " + avg);
		System.out.println("����� ������? = " + grade);
		scan.close();
	}
}
