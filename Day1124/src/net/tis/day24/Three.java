package net.tis.day24;

public class Three {

	public static void main(String[] args) {
		Three er = new Three();
		er.myCal(7.2); // 에러해결
		er.myCal(175.0); // myCal함수에서 숫자 2나누 몫을 구하세요

	}// main END
		// 함수이름중복 = 메소드이름중복=오버로딩=OverLoding

	public void myCal(double data) {
		double mok = data / 2;
		System.out.println("myCal메소드 평균=" + mok);
		System.out.println("myCal메소드 평균=" + (data / 2));
	}

	public void myCal(int a, int b) {// non-static메소드 = 일반메소드
		System.out.println("myCal메소드 합계 = " + (a + b));
		int hap = a + b;
		System.out.println("myCal메소드 합계 = " + hap);
	}// myCal END
}// class END
