package net.tis.day19;

public class SJTest {
	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0;
		double avg = 0.0;
		char grade = 'F'; // ÇÐÁ¡Ç¥½Ã

		kor = 90;
		eng = 85;
		// ÃÑÁ¡,Æò±Õ±îÁö °è»êÈÄ Ãâ·Â
		// Æò±ÕÀÌ 70Á¡ºÎÅÍ ÃàÇÕ°Ý, Àç½ÃÇè

		tot = kor + eng;
		avg = (double) tot / 2;
		//if~elseif~else 100~90 A, 80~89 B, 70~79 C, 60~69 D, 0~59 F
		
		if(avg>=90) {grade = 'A'; }
		else if(avg>=80) {grade = 'B';}
		else if(avg>=70) {grade = 'C';}
		else if(avg>=60) {grade = 'D';}
		else {grade = 'F';}
		
		System.out.println("ÃÑÁ¡:" + tot);
		System.out.println("Æò±Õ:" + avg);
		System.out.println("ÇÐÁ¡:" + grade);
	}// main END
}// class END
