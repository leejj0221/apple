package sample.tis.day17;

public class Test06 {

	public static void main(String[] args) {
		// 85������ �񱳿��� = ���迬��, ������� true/false
		int a = 7;
		int b = 2;
		
		boolean ret1 = a > b;
		boolean ret2 = a < b;
		boolean ret3 = (a == b);
		System.out.println(a + ">" + b + " ���: " + ret1);
		System.out.println(a + "<" + b + " ���: " + ret2);
		System.out.println(a + "==" + b + " ���: " + ret3);
		System.out.println(a + "!=" + b + " ���: " + (a!=b));
		System.out.println(a + ">=" + b + " ���: " + (a>=b));
		System.out.println(a + "<=" + b + " ���: " + (a<=b));
	}
}// class END
