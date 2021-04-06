package sample.tis.day17;

public class SJ { // Java언어 => jsp,spring,안드로이드

	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0;
		double avg = 0.0;//평균
		char grade = 0;
//		String message = "합격재시험메세지";

		//총점, 평균 구해서 출력
		kor = 90;
		eng = 70;
		tot = kor + eng;
		avg = (double)tot/2;
		
		if(avg>=90) {
			grade = 'A';
		}
		else if(avg<90) {
			if(avg>=80) {
				grade = 'B';
			}
		}
		else if(avg<80) {
			if(avg>=70) {
				grade = 'C';
			}
		}
		else if(avg<70) {
			if(avg>=60) {
				grade = 'D';
			}
		}
		else {
			grade = 'F';
		}
		System.out.println("당신의 학점은? = " + grade);
		//97페이지 다중if ~ else if ~ else
		//100~90 grade = 'A' 80~89 grade = 'B'
		//70~79 grade = 'C' 60~69 grade = 'D' 0~59 grade = 'F'
		//98페이지
		
		System.out.println("총점 = "+tot); //print()메소드는 enter기능x
		System.out.println("평균 = "+avg);
//		System.out.println("결과 = "+message);
	}
}//Three class end
