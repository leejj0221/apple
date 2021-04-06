package net.tis.day20;

//139페이지 맨마지막 2차원배열초기화
public class ScoreAverage01 {
	public static void main(String[] args) {

		double[][] score = {
				{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2}
		};
		//System.out.println("배열가로행 "+ score.length);
		//System.out.println("배열세로행 "+ score.length);
		//가로행 4행 , 세로열 2열
		//가로배열이름.length   세로배열행[행].length
		for(int year=0;year<score.length;year++) {
			for(int term=0;term<score[year].length;term++) {
				System.out.print(score[year][term] + "  ");
			}//term END
			System.out.println();
		}//year END
	}//end
}//class END
