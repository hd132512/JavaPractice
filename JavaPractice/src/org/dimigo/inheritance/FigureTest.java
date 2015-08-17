/**
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   _ FigureTest
 * 
 * About :
 * Date : 2015. 8. 12.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class FigureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		
		System.out.println("원의 넓이 : " + String.format("%.1f", c.clacArea()));
		System.out.println("삼각형 넓이 : " + String.format("%.1f", t.clacArea()));
		System.out.println("사각형 넓이 : " + String.format("%.1f", r.clacArea()));
		
		System.out.println();
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		System.out.println("\n--중심좌표 이동 (x,y축 5씩)\n");
		
		int m=5;
		
		c.moveFigure(m, m);
		t.moveFigure(m, m);
		r.moveFigure(m, m);
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
	}

}
