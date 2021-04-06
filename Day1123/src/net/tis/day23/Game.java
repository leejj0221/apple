package net.tis.day23;

import java.lang.Math;
import java.lang.System;
import java.util.Scanner;
import java.lang.String;

public class Game {
	public static void main(String[] args) {
		// 372페이지 Math.random()
		int com = (int) (Math.random() * 45) + 1;
//		System.out.println("com의 난수 = " + com);
		int i = 0, my = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				i = i + 1;
				System.out.println(i + "회 숫자입력>>");
				my = Integer.parseInt(sc.nextLine());

				// 예외처리를 해야한다.
				if (my < com) {
					System.out.println(my + "보다 큽니다.");
				} else if (my > com) {
					System.out.println(my + "보다 작습니다.");
				} else if (my == com) {
					System.out.println("정답입니다!!!");
					System.out.println(i + "번만에 맞추셨습니다.");
					break;
				} else {
					System.out.println("숫자가 아닙니다.");
				}
				if (my < 0 || my > 100) {
					System.out.println("숫자범위는 1~100사이 숫자이어야 합니다.");
					break;
				}
				if (i >= 5) {
					System.out.println("횟수 5회를 초과하였습니다.\n정답은 " + com + " 입니다.\n다음기회에 이용하세요");
					break;
				}
			} catch (Exception e) {
				System.out.println("숫자가 아닙니다.\n다시입력해주십시오.");
			}
		} // while END
		sc.close();
	}// main END
}// class END
