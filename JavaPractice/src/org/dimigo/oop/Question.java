/**
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   _ Question
 * 
 * About :
 * Date : 2015. 5. 11.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 좋아하는 가수는?");
		String answer = scanner.nextLine();
		if("신화".equals(answer))
			System.out.println("정답입니다 !! ^^\n\n");
		else
			System.out.println("틀렸습니다 !! ㅠ\n\n");
		
		System.out.println("가장 좋아하는 게임은?");
		answer = scanner.nextLine();
		if("사이퍼즈".equals(answer))
			System.out.println("정답입니다 !! ^^\n\n");
		else
			System.out.println("틀렸습니다 !! ㅠ\n\n");
		
		System.out.println("가장 좋아하는 는?");
		answer = scanner.nextLine();
		if("".equals(answer))
			System.out.println("정답입니다 !! ^^\n\n");
		else
			System.out.println("틀렸습니다 !! ㅠ\n\n");
		
		scanner.close();

	}

}
