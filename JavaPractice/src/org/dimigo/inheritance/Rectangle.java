/**
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   _ Rectangle
 * 
 * About :
 * Date : 2015. 8. 12.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class Rectangle extends Figure {

	private int width;
	private int height;
	
	
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle( int width, int height) {
		super(0, 0);
		this.width = width;
		this.height = height;
	}
	
	protected double clacArea(){
		 return width * height;
	}
	
}
