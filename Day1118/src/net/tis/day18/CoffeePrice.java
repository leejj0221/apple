package net.tis.day18;

import java.util.Scanner;

/*
 Switch���� �̿��Ͽ� Ŀ�� �޴��� ������ �˷��ִ� ���α׷��� �ۼ��϶�. ����������,īǪġ��,ī��󶼴� 3500���̰�,
�Ƹ޸�ī��� 2000���̴�.
 */
public class CoffeePrice {// 103������ switch��� ����
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 4������
		System.out.println("���� Ŀ�Ǹ� �帱���?");
		System.out.println(">>>");
		String order = scanner.next(); // �ֹ� �б�

		int price = 0;

		switch (order) {
		case "����������":
		case "īǪġ��":
		case "ī���":
			price = 3500;
			break;
		case "�Ƹ޸�ī��":
			price = 2000;
			break;
		default:
			System.out.println("�޴��� �����ϴ�.");
		}
		if (price != 0)
			System.out.print(order + "�� " + price + "���Դϴ�.");
		scanner.close();// 29������
	}
}// GradingSwitch class END
