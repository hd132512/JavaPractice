/**
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   _ Triangle
 * 
 * About :
 * Date : 2015. 8. 12.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class Triangle extends Figure {
	
	private int width;
	private int height;
	
	
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	public Triangle( int width, int height) {
		super(0, 0);
		this.width = width;
		this.height = height;
	}
	
	protected double clacArea(){
		return width * height /2;
	}

}
