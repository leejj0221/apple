package net.tis.day19;

public class SJTest {
	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0;
		double avg = 0.0;
		char grade = 'F'; // 학점표시

		kor = 90;
		eng = 85;
		// 총점,평균까지 계산후 출력
		// 평균이 70점부터 축합격, 재시험

		tot = kor + eng;
		avg = (double) tot / 2;
		//if~elseif~else 100~90 A, 80~89 B, 70~79 C, 60~69 D, 0~59 F
		
		if(avg>=90) {grade = 'A'; }
		else if(avg>=80) {grade = 'B';}
		else if(avg>=70) {grade = 'C';}
		else if(avg>=60) {grade = 'D';}
		else {grade = 'F';}
		
		System.out.println("총점:" + tot);
		System.out.println("평균:" + avg);
		System.out.println("학점:" + grade);
	}// main END
}// class END
