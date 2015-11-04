/**
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   _ Runner
 * 
 * About :
 * Date : 2015. 11. 4.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class Runner extends Thread{
	private String name;

	public Runner() {
		
	}
	
	public Runner(String name) {
		super();
		this.name = name;
	}
	
	public void run(){
		int meter;
		System.out.println(name + "출발");
		for(meter = 100;meter>=0;meter-=10){
			System.out.println(name + " " + meter + " 미터");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " 골인");
	}
	
	
}
