package sample.tis.day17;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//76페이지
		Scanner scanner = new Scanner(System.in);
		//반드시 키보드에서 입력하기전 안내문
		System.out.println("이름입력>>> ");
		String name = scanner.nextLine(); //nextLine()차이점
		
		System.out.println();
		System.out.println("당신은 "+ name + " 입니다.");
		scanner.close();	
	}
	
}// class END
