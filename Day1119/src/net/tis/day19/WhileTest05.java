package net.tis.day19;

public class WhileTest05 {

	public static void main(String[] args) {
		// while�ݺ��� ��
		int su = 0;
		while (true) {
			su = su + 1;
			System.out.print(su + "\t");
			if(su % 5 == 0) {
				System.out.println();
			}
			if(su == 30) { break;}
		}
	}
}// class END
