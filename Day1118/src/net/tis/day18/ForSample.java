package net.tis.day18;

public class ForSample { // for반복문 연습
	public static void main(String[] args) { //118페이지
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(i); // 1~10까지 반복
			if (i <= 9) // 1~9까지는 '+' 출력
				System.out.println("+");
			else {// i가 10인 경우
				System.out.println("="); // '=' 출력하고
				System.out.println(sum); // 덧셈 결과 출력
			}
		}
	}// main END
}// Class END
