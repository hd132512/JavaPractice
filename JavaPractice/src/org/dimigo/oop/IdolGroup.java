/**
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   _ IdolGroup
 * 
 * About :
 * Date : 2015. 5. 28.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] idolGroup = {"빅뱅", "2NE1", "신화"};
		
		String[][] members = {
				{"GD","태양","대성","탑","승리"},
				{"CL","산다라박","박봄","민지"},
				{"동완","민우","앤디","에릭","전진","혜성"}
		};
		
		for(int i=0;i<idolGroup.length;i++)
		{
			System.out.println("<<" + idolGroup[i]+">>");
			for(String name : members[i])
			{
				System.out.println(name);
			}
			System.out.println();
		}
		
	}

}
