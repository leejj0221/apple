package net.tis.day24;

public class AI {// 193~194������ thisŰ����� ����Ŭ������ ����
	// ù��° ��������, �������� �̸��� �����Ҷ�
	// �ι�° �Ű�����, �������� �̸��� �����Ҷ�
	int IQ = 2400; // �ʵ�����IQ�����͸� display���
	int m = 0; // �������� non-static�����Ҷ� this
	int total = 1000; // �������� non-static�����Ҷ� this

	public static void main(String[] args) {
		// static������ ���ٸ���
		System.out.println("AIŬ���� ");
		// �����Լ����� display()ȣ��
		AI tt = new AI();
		tt.display();
		tt.input(82540); // �Ա��� 540��
		int mypoint = tt.grandTotal();
		System.out.println("���ܾ� = " + mypoint);
	}// main END

	public void input(int m) {//non-static �޼ҵ�
		this.m = m;
	}// input END

	public int grandTotal() {//non-static �޼ҵ�
		total = total + m;
		return total;
	}// grandTotal END

	public void display() {//non-static �޼ҵ�
		int IQ = 17;
		System.out.println("AIŬ���� IQ�������� " + IQ);
		System.out.println("AIŬ���� IQ�������� " + this.IQ);
	}// display END

}// class END
