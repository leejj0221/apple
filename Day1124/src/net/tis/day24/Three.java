package net.tis.day24;

public class Three {

	public static void main(String[] args) {
		Three er = new Three();
		er.myCal(7.2); // �����ذ�
		er.myCal(175.0); // myCal�Լ����� ���� 2���� ���� ���ϼ���

	}// main END
		// �Լ��̸��ߺ� = �޼ҵ��̸��ߺ�=�����ε�=OverLoding

	public void myCal(double data) {
		double mok = data / 2;
		System.out.println("myCal�޼ҵ� ���=" + mok);
		System.out.println("myCal�޼ҵ� ���=" + (data / 2));
	}

	public void myCal(int a, int b) {// non-static�޼ҵ� = �Ϲݸ޼ҵ�
		System.out.println("myCal�޼ҵ� �հ� = " + (a + b));
		int hap = a + b;
		System.out.println("myCal�޼ҵ� �հ� = " + hap);
	}// myCal END
}// class END
