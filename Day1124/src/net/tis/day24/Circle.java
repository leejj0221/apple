package net.tis.day24;

public class Circle {
	public int radius; //non-static field
	public String name; //non-static field

	public Circle() {
	}// �⺻ ������ END
	
	//187������ 9������
	public Circle(int r,String n) {
		radius=r; name = n;
		System.out.println("��ǥ�޴��� "+name);
	}//������ END
	
	public double getArea() {// Non-static�޼ҵ�
		double cal = 3.14 * radius * radius;
		return cal;
	}// getArea END

	public static void main(String[] args) {// �����Ϸ��� �ʼ��޼ҵ�
		Circle pizza; 
		pizza = new Circle(7, "�ڹ�����");
//		pizza.radius = 10;
//		pizza.name="��������";
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ "+ area);
		
		//184������ 19������
		System.out.println();
		Circle donut = new Circle(); //��üȭ = ��ü���� = �ν��Ͻ����� = �������
		donut.radius = 2;
		donut.name="�ڹٵ���";
		System.out.println("��ǥ�޴��� " + donut.name);
		double square = donut.getArea();
		System.out.println(donut.name + "�� ������ "+ square);
	}// main END 
}// Circle class END
