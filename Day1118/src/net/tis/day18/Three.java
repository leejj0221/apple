package net.tis.day18;

public class Three {

	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0;
		double avg = 0.0;
		String msg = "�հݿ��θ޼���";
		char grade = 'F'; // ����ǥ��

		kor = 90;
		eng = 100;
		// ����,��ձ��� ����� ���
		// ����� 70������ ���հ�, �����

		tot = kor + eng;
		avg = (double) tot / 2;
		// �հݿ��ΰ���
		if (avg >= 70) {
			msg = "���հ�";
		} else {
			msg = "�����";
		}
		// ���� 100~90 A, 80~89 B, 70~79 C, 60~69 D, 50~59
		//if ~ else if ~ else ��� 100������ switch 
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}

		System.out.println("����:" + tot);
		System.out.println("���:" + avg);
		System.out.println("����:" + grade);
		System.out.println("�հݿ���:" + msg);
	}// main END
}// class END
