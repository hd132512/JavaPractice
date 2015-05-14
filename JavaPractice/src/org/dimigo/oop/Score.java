/**
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   _ Score
 * 
 * About :
 * Date : 2015. 5. 14.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
				sb.append("\n<<점수 출력>>\n")
				.append("국어 점수 :")
				.append(kor)
				.append(" 점\n수학 점수 :")
				.append(mat)
				.append(" 점\n 영어 점수 :")
				.append(eng)
				.append(" 점\n총점 : ")
				.append(kor+mat+eng)
				.append(" 점 \n평균 : ")
				.append(String.format("%.1f", (float)(kor+mat+eng)/3))
				.append(" 점");
		
		System.out.println(sb.toString());
		scanner.close();
	}

}
