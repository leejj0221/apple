package net.tis.day19;

public class WhileTest04 {

	public static void main(String[] args) {
		// do~while�ݺ���, while�ݺ��� ��
		int su = 0, tot = 0;
		while (su < 10) {
			su = su + 1;
			System.out.print(su + " ");
			tot = tot + su;
		}
		System.out.println("�հ�=" + tot);
	}
}// class END
