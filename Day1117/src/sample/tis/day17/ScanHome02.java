package sample.tis.day17;

import java.util.Scanner;

public class ScanHome02 {

	public static void main(String[] args) {
		System.out.println("su�� �Է��ϼ���.");
		System.out.println(">>>");
		Scanner scan = new Scanner(System.in);
		
		int su = scan.nextInt();
		
		if(su % 2 == 0) {
			System.out.println("su�� ¦���Դϴ�.");
		}
		else {
			System.out.println("su�� Ȧ���Դϴ�.");
		}
		scan.close();
	}
}
