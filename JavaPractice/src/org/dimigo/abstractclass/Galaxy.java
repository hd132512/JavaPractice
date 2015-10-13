/**
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   _ Galaxy
 * 
 * About :
 * Date : 2015. 8. 25.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class Galaxy extends SmartPhone {

	
	public Galaxy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Galaxy(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}
	
	public void pay(){
		System.out.println("삼성 페이로 결제합니다.");
	}
	
	public void useWirelessCharging(){
		System.out.println("무선 충전 기능을 이용합니다.");
	}

}
