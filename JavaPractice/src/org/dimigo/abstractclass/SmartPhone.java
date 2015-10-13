/**
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   _ SmartPhone
 * 
 * About :
 * Date : 2015. 8. 25.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public abstract class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){
	}
	
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(this.model + "의 전원을 킵니다.");
	}
	
	public void turnOff(){
		System.out.println(this.model + "의 전원을 끕니다.");
	}
	
	public abstract void pay();
	
	public void useSpecialFunction(){
		if(this instanceof IPhone)
			((IPhone)this).useAirDrop();
		else if(this instanceof Galaxy)
			((Galaxy)this).useWirelessCharging();
	}
	
	public String toString(){
		return "모델명 : " + this.model + ", 제조사 : " + this.company + ", 가격 : " + String.format("%,d", this.price) + "원";
	}

}
