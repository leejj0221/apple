package net.tis.day24;

public class First {
	public String title = "게시판"; //Non-static field = 필드
	public int pwd = 1234; //Non-static 필드 = field

	public void main(String[] args) {
		String title = "몽블랑"; // 지역변수 = local variable = 변수
		System.out.println("지역변수 title =" + title);
	}// main END

	public First() {
		//180페이지 클래스구성
		// 기본생성자, 생략가능, 호출은 new 생성자()
		// 생성자는 클래스이름과 백퍼동일, void기술금지, 리턴값없음
		//전역변수 = 필드 = field변수를 초기화
		System.out.println("기본생성자");
		System.out.println("기본생성자 생략가능");
		// First타입 fr변수객체 = new메모리영역힙 First()생성자;
	}// First 기본생성자 END

	public static void food() {// static메소드 = 클래스메소드
		System.out.println("음식관련어플");
	}// food END

	public void order() { // non-static메소드=일반메소드
		System.out.println("주문어플");
	}// order END
}// class END
