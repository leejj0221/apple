package net.tis.day18;

import java.util.Scanner;

public class WhileSample {// 120������ while( n != -1){ }
	public static void main(String[] args) {
		int count = 0; // count�� �Էµ� ������ ����
		int sum = 0; // sum�� ��

		Scanner scanner = new Scanner(System.in); // 8������
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");

		int n = scanner.nextInt(); // ���� �Է�
		while (n != -1) { // -1�� �ԷµǸ� while �� ���
			sum += n;
			count++;
			n = scanner.nextInt(); // ���� �Է�
		}
		if (count == 0)
			System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.println("������ ������ " + count + "���̸� ");
			System.out.println("����� " + (double) sum / count + "�Դϴ�.");
		}
		scanner.close();// 23������
	}
}// GradingSwitch class END
