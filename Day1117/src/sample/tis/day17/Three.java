package sample.tis.day17;

public class Three { // Java��� => jsp,spring,�ȵ���̵�

	public static void main(String[] args) {
		int kor = 0, eng = 0, tot = 0;
		double avg = 0.0;//���
		String message = "�հ������޼���";

		//����, ��� ���ؼ� ���
		kor = 90;
		eng = 70;
		tot = kor + eng;
		avg = (double)tot/2;
		if(avg>=70) {
			message = "���հ�";
		}
		else {
			message = "�����";
		}
		System.out.print("���� = "+tot+"\n"); //print()�޼ҵ�� enter���x
		System.out.print("��� = "+avg+"\n");
		System.out.print("��� = "+message+"\n");
		System.out.println();//enter ���
		//System.out.print(���뵥���� ���); //��� ���ϸ� �����߻�
		System.out.print("���� = "+tot+"\t");
		System.out.print("��� = "+avg+"\t");
		System.out.print("��� = "+message+"\t");
	}
}//Three class end
