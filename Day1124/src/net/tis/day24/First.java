package net.tis.day24;

public class First {
	public String title = "�Խ���"; //Non-static field = �ʵ�
	public int pwd = 1234; //Non-static �ʵ� = field

	public void main(String[] args) {
		String title = "�����"; // �������� = local variable = ����
		System.out.println("�������� title =" + title);
	}// main END

	public First() {
		//180������ Ŭ��������
		// �⺻������, ��������, ȣ���� new ������()
		// �����ڴ� Ŭ�����̸��� ���۵���, void�������, ���ϰ�����
		//�������� = �ʵ� = field������ �ʱ�ȭ
		System.out.println("�⺻������");
		System.out.println("�⺻������ ��������");
		// FirstŸ�� fr������ü = new�޸𸮿����� First()������;
	}// First �⺻������ END

	public static void food() {// static�޼ҵ� = Ŭ�����޼ҵ�
		System.out.println("���İ��þ���");
	}// food END

	public void order() { // non-static�޼ҵ�=�Ϲݸ޼ҵ�
		System.out.println("�ֹ�����");
	}// order END
}// class END
