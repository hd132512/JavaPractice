/**
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   _ PiggyBank
 * 
 * About :
 * Date : 2015. 6. 12.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class PiggyBank {
	
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount)
	{
		System.out.println(member.getMemberName() + " " + amount + "원 넣음");
		balance += amount;
	}
	
	public static void printBalance()
	{
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
	

}
