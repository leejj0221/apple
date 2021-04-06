package net.tis.day24;

public class Two {

	public static void main(String[] args) {
		//에러 this.note(); static키워가 있을때 this기술하면 에러
		//에러 Two.note(); main메소드는 static있어서 static없는 note접근못함
		Two ob = new Two();
		ob.note();
		System.out.println("main메소드");
		System.out.println("main영수증");
		System.out.println("main주차증");
	}//main END
	public double rate(){
		double r = 7.8;
		return r;
	}//rate END
	public boolean getConnect(){
		boolean ct = true;
		return ct;
	}//getConnect END
	public int price(){
		int value = 2900;
		return value;
	}//price END
	public String getTitle(){
		String title = "톰과제리";
		return title;
	}//getTitle END
	public void note() {
//		System.out.println(msg); 에러
		//non-static메소드에서는 this키워드 사용가능
		//non-static메소드에서는 this키워드 
		System.out.println(getTitle()); //에러해결
		String a = this.getTitle();
		System.out.println(getTitle()); //에러해결
	}
}//class END
