package sample.tis.day17;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//76������
		Scanner scanner = new Scanner(System.in);
		//�ݵ�� Ű���忡�� �Է��ϱ��� �ȳ���
		System.out.println("�̸��Է�>>> ");
		String name = scanner.nextLine(); //nextLine()������
		
		System.out.println();
		System.out.println("����� "+ name + " �Դϴ�.");
		scanner.close();	
	}
	
}// class END
