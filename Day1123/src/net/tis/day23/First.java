package net.tis.day23;

public class First {

	public static void main(String[] args) {
		   int kor=0,eng=0,tot=0;
		   double avg=0.0;
		   String msg="";
		   
		   kor=90;
		   eng=85;

		   tot=kor+eng;
		   avg=(double)tot/2;
		   
		   //�հݿ��δ� ���70������ ���հ� /else �����
		   if(avg>=70) {msg="���հ�";  }
		   else { msg="�����";   }
		   
		   //���׿����� �����ؼ� ���  (����)? ����: �Ҹ���
		   //�հݿ��δ� ���70������ pass /else failed
		   String ok = (avg>=70)? "pass" : "failed" ;
				   
		   System.out.println("����=" + tot);
		   System.out.println("���=" + avg);
		   System.out.println("���=" + msg);
		   System.out.println("���=" + ok);
	}//main end

}//class END







