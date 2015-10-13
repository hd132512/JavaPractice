/**
 */
package org.dimigo.exception;

/**
 * <pre>
 * oop.dimigo.exception
 *   _ AgeCheckException
 * 
 * About :
 * Date : 2015. 9. 21.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class AgeCheckException extends Exception {
	public AgeCheckException() {
		super();
	}
	
	public AgeCheckException(Movie movie) {
		super(movie.getTitle()+"은/는 "+movie.getLimitAge() + "세 이상 관람가 입니다.");
	}
}
