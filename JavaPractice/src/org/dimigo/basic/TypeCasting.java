package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=1700000;
			int b=3,c=1500;
			
			System.out.println("<< 디미베네 연간 인건비 >>");
			System.out.println("월 평균 급여 : "+String.format("%,d",a)+"원");
			System.out.println("점포 내 직원 수 : " + b + "명");
			System.out.println("점포 수 : "+String.format("%,d",c)+"원");
			System.out.println();
			System.out.println();
			
			long l=a*(long)12*b*c;
			System.out.println("연간 인건비 : " + String.format("%,d",l) + "원" );
			
	}

}
