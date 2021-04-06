package net.tis.day19;

import java.util.Scanner;

public class ContinueExample { // 125페이지
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// for, while, do~while반복문에서 continue
		System.out.println("정수 5개 입력>>>");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = scanner.nextInt();

			if (n <= 0)
				continue;
			else
				sum += n;
		}
		System.out.println("양수의 합은 "+sum);
		
		scanner.close();
	}
}// class END
