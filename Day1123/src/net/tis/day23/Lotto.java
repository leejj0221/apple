package net.tis.day23;

public class Lotto {
	public static void main(String[] args) {
		double[] com = new double[6];
		for (int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random()*45)+1;
			System.out.println("������ = " + (int)com[i]);
			//���� 1~10������ ���� ���� 6�� �߻�
		}//for END
	}// main END
}// class END
