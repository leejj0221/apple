package net.tis.day20;

import java.util.Scanner;

public class CampTest4 {
	public static void main(String[] args) {
		System.out.println("1�����迭 ķ������ 20�� �ݿ��� 5:41");
		Scanner sc = new Scanner(System.in);
		boolean[] camp = new boolean[5]; // 0��° 1��° 2��° 3��°
		int sel = 9, num = 0;

//ķ���� �������Ȯ��
		for (int i = 0; i < camp.length; i++) {
			if (camp[i] == true) {
				System.out.println(" " + (i + 1) + "��°��ķ��������Դϴ�");
			} else {
				System.out.println(" " + (i + 1) + "��°��ķ������ ����ֽ��ϴ�");
			}
		} // for END
		while (true) {
			try {
				System.out.println("\n1.���� 2.��� 3.���� 9.����");
				sel = Integer.parseInt(sc.nextLine()); // ���� 5�Է�

				switch (sel) {
				case 1:
					System.out.println("����ķ�ι�ȣ �Է�>>>");
					num = Integer.parseInt(sc.nextLine()); // ���� 5�Է�
					if (num < 1 || num > 5) {
						System.out.println(num + "��ȣ�� ����Ҽ� �����ϴ�");
					}
					if (camp[num - 1] == true) {
						System.out.println("�̹� ����� ķ���� ����Ҽ� �����ϴ�");
					} else {
						System.out.println("camp[" + num + "] ķ���� ���༺��");
						camp[num - 1] = true; // false��� ��¥true������
					}
					for (int i = 0; i < camp.length; i++) {
						if (camp[i] == true) {
							System.out.println(" " + (i + 1) + "��° ��ķ��������Դϴ�");
						} else {
							System.out.println(" " + (i + 1) + "��° ��ķ������ ��� �ֽ��ϴ�");
						}
					} // for END
					break;
				case 2:// ����� ����/���κ�ó��
					System.out.println("���ķ�ι�ȣ �Է�>>>");
					num = Integer.parseInt(sc.nextLine());
					if (camp[num - 1] == true) {
						System.out.println("camp[" + num + "] ķ���� ��Ǽ���");
						camp[num - 1] = false;
					} else {
						System.out.println("camp[" + num + "] ����ִ� ķ�����Դϴ�");
					}
					for (int i = 0; i < camp.length; i++) {
						if (camp[i] == true) {
							System.out.println(" " + (i + 1) + "��° ��ķ��������Դϴ�");
						} else {
							System.out.println(" " + (i + 1) + "��° ��ķ������ ��� �ֽ��ϴ�");
						}
					} // for END
					break;
				case 3:// ��ü�������
					for (int i = 0; i < camp.length; i++) {
						if (camp[i] == true) {
							System.out.println(" " + (i + 1) + "��° ��ķ��������Դϴ�");
						} else {
							System.out.println(" " + (i + 1) + "��° ��ķ������ ��� �ֽ��ϴ�");
						}
					} // for END
					break;
				default:
					System.out.println("1~3�޴��� �����ϼ����մϴ�");
					break;

				}// switch END
			} catch (Exception e) {
			}
			if (sel == 9) {
				System.out.println("ķ���忹�����α׷��� �����մϴ�");
				break;
			}
		} // while
		sc.close();
	}// main END
}// class END
