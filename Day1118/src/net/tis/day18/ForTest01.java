package net.tis.day18;

public class ForTest01 { // for반복문 연습
	public static void main(String[] args) {
		int su = 0;
		int tot = 0; // 변수초기화없이 선언만
		for (int a = 1; a < 6; a = a + 1) {// a는 출력하지말고 su변수출력 1~5
			su = su + 1;
			System.out.print(su + " ");
			tot = tot + su;
			System.out.println("tot=" + tot);
		} // for END

		System.out.println();
		int num = 0, hap = 0;
		for (int b = 0; b < 5; b++) {
			num++;
			System.out.println(num + " ");
			hap = hap + num;
		}
		System.out.println("hap=" + hap);
	}// main END
}// Class END
