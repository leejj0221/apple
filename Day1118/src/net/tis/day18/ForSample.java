package net.tis.day18;

public class ForSample { // for�ݺ��� ����
	public static void main(String[] args) { //118������
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(i); // 1~10���� �ݺ�
			if (i <= 9) // 1~9������ '+' ���
				System.out.println("+");
			else {// i�� 10�� ���
				System.out.println("="); // '=' ����ϰ�
				System.out.println(sum); // ���� ��� ���
			}
		}
	}// main END
}// Class END
