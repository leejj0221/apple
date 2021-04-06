package sample.tis.day17;

public class Three { // Java언어 => jsp,spring,안드로이드

	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0;
		double avg = 0.0;//평균
		String message = "합격재시험메세지";

		//총점, 평균 구해서 출력
		kor = 90;
		eng = 70;
		tot = kor + eng;
		avg = (double)tot/2;
		if(avg>=70) {
			message = "축합격";
		}
		else {
			message = "재시험";
		}
		System.out.print("총점 = "+tot+"\n"); //print()메소드는 enter기능x
		System.out.print("평균 = "+avg+"\n");
		System.out.print("결과 = "+message+"\n");
		System.out.println();//enter 기능
		//System.out.print(내용데이터 기술); //기술 않하면 에러발생
		System.out.print("총점 = "+tot+"\t");
		System.out.print("평균 = "+avg+"\t");
		System.out.print("결과 = "+message+"\t");
	}
}//Three class end
