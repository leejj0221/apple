package net.tis.day19;

public class DoWhileTest02 {

	public static void main(String[] args) {
		//121���������� do~while
		int su = 0,tot = 0;
		do {
			su = su + 1;
			System.out.print(su + " ");
			tot = tot + su;
		} while (su < 10);
		System.out.println("�հ�="+tot);
	}
}//class END
