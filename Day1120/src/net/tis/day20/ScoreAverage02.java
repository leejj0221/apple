package net.tis.day20;

//139������ �Ǹ����� 2�����迭�ʱ�ȭ
public class ScoreAverage02 {
	public static void main(String[] args) {

		double[][] score = {
				{3.3, 3.4},
				{3.5, 3.6, 7.8, 5.8},
				{3.7, 4.0},
				{4.1, 4.2}
		};
		//System.out.println("�迭������ "+ score.length);
		//System.out.println("�迭������ "+ score.length);
		//������ 4�� , ���ο� 2��
		//���ι迭�̸�.length   ���ι迭��[��].length
		for(int a=0;a<score.length;a++) { //a��� row
			for(int b=0;b<score[a].length;b++) { //b��� column
				System.out.print(score[a][b] + "  ");
			}//b END
			System.out.println();
		}//a END
	}//end
}//class END
