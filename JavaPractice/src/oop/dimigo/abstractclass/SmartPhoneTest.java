/**
 */
package oop.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   _ SmartPhoneTest
 * 
 * About :
 * Date : 2015. 8. 25.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone phones[] = {
				new IPhone("iPhone 6", "애플", 700000), 
				new Galaxy("갤럭시 S6", "삼성",650000)};
		
		for(SmartPhone x : phones){
			System.out.println(x);
			x.turnOn();
			x.pay();
			x.useSpecialFunction();
			x.turnOff();
			System.out.println();
		}

	}

}
