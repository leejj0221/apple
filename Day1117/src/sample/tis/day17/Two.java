package sample.tis.day17;

public class Two {

	public static void main(String[] args) {
		// ���� int age = 27.8; int���� �Ҽ����� ���� ������ ���
		// int age = 27; ���������ϸ鼭 ������ �ʱ�ȭ
		// int age; // ���� ���� ������ ����ϸ� may not have been initialized
		// System.out.println("���� = " + age);

		// int nai;//������ ���� declare
		// nai = 31;//���� ���� = �Ҵ� = assignment
		// System.out.println("���� = "+nai);
		// nai = 19;//������ ��
		// System.out.println("���� = "+nai);

		int age = 27;
		System.out.println(" age = " + age); // age = 27
		// int age = 31; ���� �̸����� �����Ҵ�
		age = 46;// �ٽ� ����� = ���Ҵ�
		System.out.println(" age = " + age); // age = 46
	}
}// class Two end
