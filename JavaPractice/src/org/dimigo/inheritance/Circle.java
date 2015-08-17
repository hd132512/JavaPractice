/**
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   _ Circle
 * 
 * About :
 * Date : 2015. 8. 12.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class Circle extends Figure {
	
	private int radius;

	public Circle( int radius) {
		super(0, 0);
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double clacArea(){
		return radius * radius * Math.PI;
	}
	
	protected void printCenter(){
		System.out.print("원 ");
		super.printCenter();
	}

}
