package net.tis.day19;

public class TestArray02 {
	enum Week { ������,ȭ����,������,�����,�ݿ��� }
	public static void main(String[] args) {
//		int su[] = { 34 };
//		String city[] = {"���ǵ�"};
//		double rate[] = {23.4};
		int[] su = {37, 45, 7, 14, 30, 19};

		// ù��° �迭�� ������ ��� for�ݺ����̿�
		// �ι�° �迭�� ũ��� length
		//136������ for~each�� ����for�ݺ���

		for (int k : su) { 
			System.out.print(k + " ");
		}
		
		System.out.println();
		String names[] = {"���", "ü��", "����", "����", "�ܰ�"};
		for(String s:names) {System.out.print(s+" ");}
		System.out.println();
		
		for(Week day: Week.values()) {
			System.out.print(day +" ");
		}
	}
}//class END
