package net.tis.day20;

public class First {
	public static void main(String[] args) {
		//�迭�� �ʱ�ȭ, newŰ����� �޸�heap������ �ε�
		//heap������ �����߿� �ε�, �����϶� �Ұ�
		String city[] = new String[5]; //null
		boolean[] camp = new boolean[5]; //false
		int[] su = new int[5]; //0
		double[] rate = new double[5]; //0.0
		char[] ck = new char[5]; //ǥ�ð� ����
		byte[] bt = new byte[5]; //0
		
		for(int cnt = 0; cnt<5; cnt = cnt + 1) {
			//System.out.println(city[cnt] + " ");
			//System.out.println(camp[cnt] + " ");
			//System.out.println(su[cnt] + " ");
			//System.out.println(rate[cnt] + " ");
			//System.out.println(ck[cnt] + " ");
			System.out.println(bt[cnt] + " ");
		}
	}

}//class END
