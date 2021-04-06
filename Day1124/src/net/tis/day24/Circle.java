package net.tis.day24;

public class Circle {
	public int radius; //non-static field
	public String name; //non-static field

	public Circle() {
	}// 기본 생성자 END
	
	//187페이지 9번라인
	public Circle(int r,String n) {
		radius=r; name = n;
		System.out.println("대표메뉴는 "+name);
	}//생성자 END
	
	public double getArea() {// Non-static메소드
		double cal = 3.14 * radius * radius;
		return cal;
	}// getArea END

	public static void main(String[] args) {// 실행하려면 필수메소드
		Circle pizza; 
		pizza = new Circle(7, "자바피자");
//		pizza.radius = 10;
//		pizza.name="동네피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+ area);
		
		//184페이지 19번라인
		System.out.println();
		Circle donut = new Circle(); //객체화 = 객체생성 = 인스턴스생성 = 복사생성
		donut.radius = 2;
		donut.name="자바도넛";
		System.out.println("대표메뉴는 " + donut.name);
		double square = donut.getArea();
		System.out.println(donut.name + "의 면적은 "+ square);
	}// main END 
}// Circle class END
