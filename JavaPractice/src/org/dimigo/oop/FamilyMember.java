/**
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   _ FamilyMember
 * 
 * About :
 * Date : 2015. 6. 12.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class FamilyMember {

	private static int memberCnt;
	
	private String memberName;
	
	public FamilyMember(String Name)
	{
		this.memberName = Name;
	}

	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt()
	{
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
	
	


}
