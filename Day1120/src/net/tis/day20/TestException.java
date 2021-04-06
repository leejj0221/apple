package net.tis.day20;

public class TestException {
	public static void main(String[] args) {
		int a = 7, b = 0, hap = 0, gob = 0;
		double mok = 0.0;
		
		try {
		hap = a + b;
		gob = a * b;
		mok = a / b;
		}catch (Exception e) {
			
		}
		System.out.println(a + "+" + b + "=" + hap);
		System.out.println(a + "*" + b + "=" + gob);
		System.out.println(a + "/" + b + "=" + mok);
		System.out.println("\n마지막처리");
		System.out.println("영수증출력");
	}
}
