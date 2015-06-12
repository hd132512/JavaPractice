/**
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   _ PiggyBankTest
 * 
 * About :
 * Date : 2015. 6. 12.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FamilyMember[] fa = {new FamilyMember("아빠"), 
				new FamilyMember("엄마"), 
				new FamilyMember("나"), 
				new FamilyMember("남동생") 
		};
		
		PiggyBank.putMoney(fa[0],10000 );
		PiggyBank.putMoney(fa[1],5000 );
		PiggyBank.putMoney(fa[2],2000 );
		PiggyBank.putMoney(fa[3],1000 );
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(fa[2], 1000);
		
		PiggyBank.printBalance();

	}

}
