package sample.tis.day17;

public class Two {

	public static void main(String[] args) {
		// 에러 int age = 27.8; int형은 소숫점이 없는 정수값 기억
		// int age = 27; 변수선언하면서 값대입 초기화
		// int age; // 값은 없는 변수를 출력하면 may not have been initialized
		// System.out.println("나이 = " + age);

		// int nai;//변수를 선언만 declare
		// nai = 31;//값을 대입 = 할당 = assignment
		// System.out.println("나이 = "+nai);
		// nai = 19;//최종의 값
		// System.out.println("나이 = "+nai);

		int age = 27;
		System.out.println(" age = " + age); // age = 27
		// int age = 31; 같은 이름으로 공간할당
		age = 46;// 다시 재대입 = 재할당
		System.out.println(" age = " + age); // age = 46
	}
}// class Two end
