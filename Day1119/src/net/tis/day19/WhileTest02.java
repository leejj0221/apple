package net.tis.day19;

public class WhileTest02 {

	public static void main(String[] args) {
		//119������ while(su<10){ }
		//119������ while(true){ }
		//while�ݺ������� 1~10���
		int su = 0;
		while(true) { //���ѷ���
			su = su + 1;
			System.out.print(su + " ");
			if(su == 10) {break;}
		}//while END		
		
		System.out.println();
		System.out.println("----------------------------");
		int kor = 0, eng = 0, tot = 0;
		double avg = 0.0;
		String msg = "";
		char grade = 'F'; // ����ǥ��

		kor = 90;
		eng = 95;
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
		// ���� switch(doubleŸ���� ��������)��� ���ϱ�
		// 82.7, 84.5, 89.1
		// 82, 84, 89 (int)
		// 8, 8, 8 /10�������
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F';
		}// switch END
		// �հݿ��δ� ���70������ ���հ�/0~69 �����

		System.out.println("����:" + tot);
		System.out.println("���:" + avg);
		System.out.println("����:" + grade);
		System.out.println("�հ� ����:" + msg);
		System.out.println("----------------------------");
	}// main END
}// WhileTest02 class END
