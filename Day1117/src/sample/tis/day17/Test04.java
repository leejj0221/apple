package sample.tis.day17;

public class Test04 {

	public static void main(String[] args) {
		//83������ �����ϼ���
		//++,-- ���׿��� �������� 1������ 1������
		int a =7, b = 7;
		int tot = 0, hap = 0;
		tot = (++a) + 5;
		hap = (b++) + 5;
		System.out.println("a="+ a +"\t tot=" + tot);
		System.out.println("b="+ b +"\t hap=" + hap);
		
		//���� a,b,tot,hap�ʱ�ȭ
		a = 7; b = 7; tot = 0; hap = 0;
		tot = (--a) + 5;
		hap = (b--) + 5;
		System.out.println("a="+ a +"\t tot=" + tot);
		System.out.println("b="+ b +"\t hap=" + hap);
	}
}// class END
