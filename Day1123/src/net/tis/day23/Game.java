package net.tis.day23;

import java.lang.Math;
import java.lang.System;
import java.util.Scanner;
import java.lang.String;

public class Game {
	public static void main(String[] args) {
		// 372������ Math.random()
		int com = (int) (Math.random() * 45) + 1;
//		System.out.println("com�� ���� = " + com);
		int i = 0, my = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				i = i + 1;
				System.out.println(i + "ȸ �����Է�>>");
				my = Integer.parseInt(sc.nextLine());

				// ����ó���� �ؾ��Ѵ�.
				if (my < com) {
					System.out.println(my + "���� Ů�ϴ�.");
				} else if (my > com) {
					System.out.println(my + "���� �۽��ϴ�.");
				} else if (my == com) {
					System.out.println("�����Դϴ�!!!");
					System.out.println(i + "������ ���߼̽��ϴ�.");
					break;
				} else {
					System.out.println("���ڰ� �ƴմϴ�.");
				}
				if (my < 0 || my > 100) {
					System.out.println("���ڹ����� 1~100���� �����̾�� �մϴ�.");
					break;
				}
				if (i >= 5) {
					System.out.println("Ƚ�� 5ȸ�� �ʰ��Ͽ����ϴ�.\n������ " + com + " �Դϴ�.\n������ȸ�� �̿��ϼ���");
					break;
				}
			} catch (Exception e) {
				System.out.println("���ڰ� �ƴմϴ�.\n�ٽ��Է����ֽʽÿ�.");
			}
		} // while END
		sc.close();
	}// main END
}// class END
