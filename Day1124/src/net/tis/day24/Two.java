package net.tis.day24;

public class Two {

	public static void main(String[] args) {
		//���� this.note(); staticŰ���� ������ this����ϸ� ����
		//���� Two.note(); main�޼ҵ�� static�־ static���� note���ٸ���
		Two ob = new Two();
		ob.note();
		System.out.println("main�޼ҵ�");
		System.out.println("main������");
		System.out.println("main������");
	}//main END
	public double rate(){
		double r = 7.8;
		return r;
	}//rate END
	public boolean getConnect(){
		boolean ct = true;
		return ct;
	}//getConnect END
	public int price(){
		int value = 2900;
		return value;
	}//price END
	public String getTitle(){
		String title = "�������";
		return title;
	}//getTitle END
	public void note() {
//		System.out.println(msg); ����
		//non-static�޼ҵ忡���� thisŰ���� ��밡��
		//non-static�޼ҵ忡���� thisŰ���� 
		System.out.println(getTitle()); //�����ذ�
		String a = this.getTitle();
		System.out.println(getTitle()); //�����ذ�
	}
}//class END
