package sample.tis.day17;

import java.util.Scanner;

public class ScanHome02 {

	public static void main(String[] args) {
		System.out.println("su를 입력하세요.");
		System.out.println(">>>");
		Scanner scan = new Scanner(System.in);
		
		int su = scan.nextInt();
		
		if(su % 2 == 0) {
			System.out.println("su는 짝수입니다.");
		}
		else {
			System.out.println("su는 홀수입니다.");
		}
		scan.close();
	}
}
