package net.tis.day23;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//main END
	public static void menu() {
		while (true) {
			try {
				System.out.println("\n1.예약 2.퇴실 3.보기 9.종료");
				sel = Integer.parseInt(sc.nextLine()); // 고객이 5입력

				switch (sel) {
				case 1:
					System.out.println("예약캠핑번호 입력>>>");
					num = Integer.parseInt(sc.nextLine()); // 고객이 5입력
					if (num < 1 || num > 5) {
						System.out.println(num + "번호를 사용할수 없습니다");
					}
					if (camp[num - 1] == true) {
						System.out.println("이미 예약된 캠프장 사용할수 없습니다");
					} else {
						System.out.println("camp[" + num + "] 캠프장 예약성공");
						camp[num - 1] = true; // false대신 진짜true값대입
					}
					for (int i = 0; i < camp.length; i++) {
						if (camp[i] == true) {
							System.out.println(" " + (i + 1) + "번째 ■캠프사용중입니다");
						} else {
							System.out.println(" " + (i + 1) + "번째 □캠프장은 비어 있습니다");
						}
					} // for END
					break;
				case 2:// 퇴실은 조별/개인별처리
					System.out.println("퇴실캠핑번호 입력>>>");
					num = Integer.parseInt(sc.nextLine());
					if (camp[num - 1] == true) {
						System.out.println("camp[" + num + "] 캠프장 퇴실성공");
						camp[num - 1] = false;
					} else {
						System.out.println("camp[" + num + "] 비어있는 캠프장입니다");
					}
					for (int i = 0; i < camp.length; i++) {
						if (camp[i] == true) {
							System.out.println(" " + (i + 1) + "번째 ■캠프사용중입니다");
						} else {
							System.out.println(" " + (i + 1) + "번째 □캠프장은 비어 있습니다");
						}
					} // for END
					break;
				case 3:// 전체예약상태
					for (int i = 0; i < camp.length; i++) {
						if (camp[i] == true) {
							System.out.println(" " + (i + 1) + "번째 ■캠프사용중입니다");
						} else {
							System.out.println(" " + (i + 1) + "번째 □캠프장은 비어 있습니다");
						}
					} // for END
					break;
				default:
					System.out.println("1~3메뉴를 선택하셔햐합니다");
					break;

				}// menu END
	
}//class END 
