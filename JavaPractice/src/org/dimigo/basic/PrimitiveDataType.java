package org.dimigo.basic;

/*********************************
 * <<첫번쨰 수행평가>>
 * 내용 : 아이유 프로필 출력하기
 * 작성일 : 2015.03.13
 * @author Jong
 * @version 1.0
 ********************************/

public class PrimitiveDataType {

	public static void main(String[] args) {
		
	

		String name = "아이유";
		boolean girl = true;
		int age = 23;
		double heigh = 161.8;
		float weigh = 44.3f;
		char bloodType = 'A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : "+name);
		if(girl)
			System.out.println("성별 : 여자");
		else
			System.out.println("성별 : 남자");
		System.out.println("나이 : "+ age + "세");
		System.out.printf("키 : %.1fcm\n", heigh);
		System.out.printf("몸무게 : %.1fkg\n", weigh);
		System.out.println("혈액형 : " + bloodType + "형");
	}

}
