package sample.tis.day17;

public class SJ { // Java��� => jsp,spring,�ȵ���̵�

	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0;
		double avg = 0.0;//���
		char grade = 0;
//		String message = "�հ������޼���";

		//����, ��� ���ؼ� ���
		kor = 90;
		eng = 70;
		tot = kor + eng;
		avg = (double)tot/2;
		
		if(avg>=90) {
			grade = 'A';
		}
		else if(avg<90) {
			if(avg>=80) {
				grade = 'B';
			}
		}
		else if(avg<80) {
			if(avg>=70) {
				grade = 'C';
			}
		}
		else if(avg<70) {
			if(avg>=60) {
				grade = 'D';
			}
		}
		else {
			grade = 'F';
		}
		System.out.println("����� ������? = " + grade);
		//97������ ����if ~ else if ~ else
		//100~90 grade = 'A' 80~89 grade = 'B'
		//70~79 grade = 'C' 60~69 grade = 'D' 0~59 grade = 'F'
		//98������
		
		System.out.println("���� = "+tot); //print()�޼ҵ�� enter���x
		System.out.println("��� = "+avg);
//		System.out.println("��� = "+message);
	}
}//Three class end
