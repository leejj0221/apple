package net.tis.day20;

//139������ �Ǹ����� 2�����迭�ʱ�ȭ
public class Two {
	public static void main(String[] args) {
		int intArray[][] = {{0,1,2},{3,4,5},{6,7,8}};
		char charArray[][] = {{'a','b','c'},{'d','e','f'}};
		double doubleArray[][] = {{0.01,0.02},{0.03,0.04} };

		double[][] score = {
				{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2}
		};
		//System.out.println("�迭������ "+ score.length);
		//System.out.println("�迭������ "+ score.length);
		//������ 4�� , ���ο� 2��
		//���ι迭�̸�.length   ���ι迭��[��].length
		for(int year=0;year<score.length;year++) {
			for(int term=0;term<score[year].length;term++) {
				System.out.println(score[year][term] + "  ");
			}//term END
			System.out.println();
		}//year END
	}//end
}//class END
