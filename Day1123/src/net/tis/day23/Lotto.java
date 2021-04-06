package net.tis.day23;

public class Lotto {
	public static void main(String[] args) {
		double[] com = new double[6];
		for (int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random()*45)+1;
			System.out.println("난수는 = " + (int)com[i]);
			//문제 1~10사이의 정수 숫자 6개 발생
		}//for END
	}// main END
}// class END
