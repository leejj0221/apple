package net.tis.day20;

public class Three {
	public static void main(String[] args) {
		int[] data = lotto();
		for(int su:data) {
			System.out.println(su + " ");
		}
		String like = book();
		System.out.println("�����ִ� å���� = "+like);
		
		System.out.println();
		System.out.println("�츮����");
		System.out.println("�ݼ�����");
		System.out.println("ȭ������");
		//return ; ���⿡ ����ϸ� ��������
		System.out.println("���������� 10:37 10:41");
		System.out.println("��������� 10:37 10:41");
		return; //�Ǹ������� return�� ����ϸ� �ǹ̾����.

	}//END
	public static int[] lotto() {
		int[] su = { 23, 9, 45, 29, 33, 16 };
		//return �����Ͱ�su ����ϸ� �޼ҵ� lotto()���
		return su;	
	}//END
	
	public static String book() {
		String title = "�����";
		return title;
	}//END
}//class END
