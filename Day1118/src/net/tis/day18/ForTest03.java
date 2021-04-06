package net.tis.day18;

public class ForTest03 { // for반복문 연습
	public static void main(String[] args) {
		int number = 0, total = 0, gobTotal = 1;
		for (int b = 0; b < 5; b++) {
			number++;
			System.out.print(number + " ");
			total += number;
			gobTotal *= number; //1*1=1 1*2=2 2*3=6 6*4=24 24*5=120
		}
		
		System.out.println();
		System.out.println("합출력=" + total);
		System.out.println("곱출력=" + gobTotal);
	}// main END
}// Class END
