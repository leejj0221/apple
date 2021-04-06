package net.tis.day18;

public class LastFormat3 {
	public static void main(String[] args) {
		double mokD = (double)19/3;
//		System.out.printf("%d\n ", mokC);
//		System.out.printf(mokC);
		
		System.out.printf("%f\n", mokD);
		System.out.printf("%.2f\n", mokD);
		System.out.println();
		
		System.out.printf("%.2f\n", 356.789);
		System.out.printf("%.2f\n", 356.781);
		System.out.println();
		
		System.out.printf("%8.2f\n", 356.789);
		System.out.printf("%8.2f\n", 356.781);
	}// END
}// LastFormat3 END
