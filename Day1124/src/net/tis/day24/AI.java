package net.tis.day24;

public class AI {// 193~194페이지 this키워드는 현재클래스를 접근
	// 첫번째 지역변수, 전역변수 이름이 동일할때
	// 두번째 매개인자, 전역변수 이름이 동일할때
	int IQ = 2400; // 필드전역IQ데이터를 display출력
	int m = 0; // 전역변수 non-static접근할때 this
	int total = 1000; // 전역변수 non-static접근할때 this

	public static void main(String[] args) {
		// static에서는 접근못함
		System.out.println("AI클래스 ");
		// 메인함수에서 display()호출
		AI tt = new AI();
		tt.display();
		tt.input(82540); // 입금을 540원
		int mypoint = tt.grandTotal();
		System.out.println("총잔액 = " + mypoint);
	}// main END

	public void input(int m) {//non-static 메소드
		this.m = m;
	}// input END

	public int grandTotal() {//non-static 메소드
		total = total + m;
		return total;
	}// grandTotal END

	public void display() {//non-static 메소드
		int IQ = 17;
		System.out.println("AI클래스 IQ지역변수 " + IQ);
		System.out.println("AI클래스 IQ지역변수 " + this.IQ);
	}// display END

}// class END
