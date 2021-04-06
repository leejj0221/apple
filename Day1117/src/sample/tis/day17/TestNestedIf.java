package sample.tis.day17;

import java.util.Scanner;

public class TestNestedIf {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		char grade = 0;
		System.out.println("국어, 수학, 영어 점수를 입력하세요.");
		System.out.println(">>>");
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		System.out.println("학년을 입력하세요(1~4)");
		int year = scan.nextInt();
		if(year>4 || year<1) {
			System.out.println("해당 학년이 없습니다.");
			scan.close();
		}
		
		sum = num1 + num2 + num3;
		avg = (double)sum/3;
		
		if(avg >=60) {
			if(year != 4) {
				System.out.println("합격 입니다!");
			}
			else if(avg >= 70) {
				System.out.println("합격 입니다!");
			}
			else {
				System.out.println("불합격 입니다!");
			}
		}
		else {
			System.out.println("불합격 입니다!");
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
		System.out.println("당신의 총점은? = " + sum);
		System.out.println("당신의 평균은? = " + avg);
		System.out.println("당신의 학점은? = " + grade);
		scan.close();
	}
}
