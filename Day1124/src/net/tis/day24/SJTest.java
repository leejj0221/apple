package net.tis.day24;

import java.util.Scanner;


public class SJTest {
	public static void main(String[] args) {
		// kor,eng,tot변수, double avg평균, String msg, char grade변수
		// 문제 1] try~catch사용권장, Scanner클래스, 국어, 영어입력안내문>>>
		// 문제 2] 합계,평균,학점처리 switch,결과는 삼항연산
		
		
		Scanner sc = new Scanner(System.in);
		int tot = 0, kor = 0, eng = 0;
		double avg = 0.0;
		String msg = "에러";
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
			
			System.out.println("국어, 영어 점수를 입력하시오.");
			System.out.println(">>>");
			kor = sc.nextInt();
			System.out.println(">>>");
			eng = sc.nextInt();
			
			
		} catch (Exception e) {continue;}
			break;
		}
		if(avg>=70 && kor>= 60 && eng >=60) {
			msg = "축합격";
		}
		else {
			msg = "재시험";
		}
		System.out.println("\n총점 = "+tot);
		System.out.println("평균 = "+avg);
		System.out.println("학점 = "+grade);
		System.out.println("결과 = "+msg);
		sc.close();
	}// main END
}// class END
