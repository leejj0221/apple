package net.tis.day23;

public class Three {
	public static void main(String[] args) {
		//88������ ��Ʈ����  &  |  ^  ~   85������ ������ ����ؿ�
		int a = 1;    //0001
		int b = 7;    //0111
		//&and���� �Ѵ� 1�϶� true�϶�����
		//|or���� ���߿� �ϳ��� ����=true 1�϶� �϶�����
	    //^ĳ������ �����϶� 1 0 / 0 1 ������ 1
				
		int x = (a & b);
		int y = (a | b);
		int z = a ^ b;
		System.out.println(a +"&"+b+"="+ x);
		System.out.println(a +"|"+b+"="+ y);
		System.out.println(a +"^"+b+"="+ z);
	}//main end

	
	public void note( ) { //Non-static�޼ҵ�
		//voidŰ���尡 ������ ���븸�������, �� ���ϰ����� 
		System.out.println("note�޼ҵ�");
	}//note end
}//class END






