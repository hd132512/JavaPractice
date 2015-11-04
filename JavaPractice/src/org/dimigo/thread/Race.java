/**
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   _ Race
 * 
 * About :
 * Date : 2015. 11. 4.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main thread start");
		Thread t1 = new Runner("박건");
		Thread t2 = new Runner("배주웅");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
	}

}
