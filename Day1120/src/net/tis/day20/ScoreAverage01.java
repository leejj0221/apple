package net.tis.day20;

//139������ �Ǹ����� 2�����迭�ʱ�ȭ
public class ScoreAverage01 {
	public static void main(String[] args) {

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
				System.out.print(score[year][term] + "  ");
			}//term END
			System.out.println();
		}//year END
	}//end
}//class END
