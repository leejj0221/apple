package sample.tis.day17;

public class Test04 {

	public static void main(String[] args) {
		//83페이지 참고하세요
		//++,-- 단항연산 증감연산 1씩증가 1씩감소
		int a =7, b = 7;
		int tot = 0, hap = 0;
		tot = (++a) + 5;
		hap = (b++) + 5;
		System.out.println("a="+ a +"\t tot=" + tot);
		System.out.println("b="+ b +"\t hap=" + hap);
		
		//변수 a,b,tot,hap초기화
		a = 7; b = 7; tot = 0; hap = 0;
		tot = (--a) + 5;
		hap = (b--) + 5;
		System.out.println("a="+ a +"\t tot=" + tot);
		System.out.println("b="+ b +"\t hap=" + hap);
	}
}// class END
