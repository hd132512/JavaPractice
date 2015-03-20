package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int sa=9,sb=10,pa=9; 
		double sh=5.8,ph=5.4;
		
		double ss= (sa+sb) * sh / 2;
		double ps= pa*ph;
		
		String s="사다리꼴";
		String p="평행사변형";
		
		System.out.println("<<도형 넓이 비교>>");
		System.out.println(s+ " 넓이 : "+ss);
		System.out.println(p+" 넓이 " + ps);
		System.out.println("");
		
		if(ss==ps){
			System.out.println("두 도형의 넓이는 같습니다.");
		}
		else if(ss>ps)
			System.out.println(s+"이 "+p + "보다 " +(ss-ps) + " 더 큽니다.");
		else
			System.out.println(p+"이 "+s + "보다 " +(ps-ss) + " 더 큽니다.");
		
	}

}
