package net.tis.day19;

public class TestArray02 {
	enum Week { 월요일,화요일,수요일,목요일,금요일 }
	public static void main(String[] args) {
//		int su[] = { 34 };
//		String city[] = {"여의도"};
//		double rate[] = {23.4};
		int[] su = {37, 45, 7, 14, 30, 19};

		// 첫번째 배열의 내용을 출력 for반복문이용
		// 두번째 배열의 크기는 length
		//136페이지 for~each문 향상된for반복문

		for (int k : su) { 
			System.out.print(k + " ");
		}
		
		System.out.println();
		String names[] = {"사과", "체리", "딸기", "포도", "단감"};
		for(String s:names) {System.out.print(s+" ");}
		System.out.println();
		
		for(Week day: Week.values()) {
			System.out.print(day +" ");
		}
	}
}//class END
