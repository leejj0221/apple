package net.tis.day19;

public class TestArray01 {
	public static void main(String[] args) {
//		int su[] = { 34 };
//		String city[] = {"���ǵ�"};
//		double rate[] = {23.4};
		int[] su = new int[6];
		su[0] = 37;
		su[1] = 45;
		su[2] = 7;
		su[3] = 14;
		su[4] = 30;
		su[5] = 19;

		// ù��° �迭�� ������ ��� for�ݺ����̿�
		// �ι�° �迭�� ũ��� length
		for (int a = 0; a < su.length; a = a + 1) {
			System.out.print(su[a] + " ");
		}
		System.out.println();

		for (int k : su) { //136������ for~each�� ����for�ݺ���
			System.out.print(k + " ");
		}

		System.out.println();
		System.out.print(su[0] + " ");
		System.out.print(su[1] + " ");
		System.out.print(su[2] + " ");
		System.out.print(su[3] + " ");
		System.out.print(su[4] + " ");
		System.out.print(su[5] + " ");
		System.out.println();
	}
}
