/**
 */
package oop.dimigo.exception;

/**
 * <pre>
 * oop.dimigo.exception
 *   _ Movie
 * 
 * About :
 * Date : 2015. 9. 21.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limitAge;

	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}
	
	
	
	
}
