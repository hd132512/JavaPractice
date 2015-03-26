package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		int d=10;
		String carType="고속버스";
		int pay;
		
		switch(carType){
		case "고속버스":
			pay=850+((d-1)/10)*300;
			break;
		case "경차":
			pay=300+((d-1)/10)*200;
			break;
		default:
			pay=600+((d-1)/10)*200;
		}
		
		
		System.out.println("<<고속도로 통행료 계산>>");
		System.out.println("거리 : "+d+"km");
		System.out.println("차량 : "+carType);
		System.out.println("통행료 : "+pay+"원");
		
		
		
	}
}
