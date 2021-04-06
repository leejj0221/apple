package net.tis.day18;

public class Three {

	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0;
		double avg = 0.0;
		String msg = "합격여부메세지";
		char grade = 'F'; // 학점표시

		kor = 90;
		eng = 100;
		// 총점,평균까지 계산후 출력
		// 평균이 70점부터 축합격, 재시험

		tot = kor + eng;
		avg = (double) tot / 2;
		// 합격여부관리
		if (avg >= 70) {
			msg = "축합격";
		} else {
			msg = "재시험";
		}
		// 학점 100~90 A, 80~89 B, 70~79 C, 60~69 D, 50~59
		//if ~ else if ~ else 대신 100페이지 switch 
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}

		System.out.println("총점:" + tot);
		System.out.println("평균:" + avg);
		System.out.println("학점:" + grade);
		System.out.println("합격여부:" + msg);
	}// main END
}// class END
