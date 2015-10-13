/**
 */
package org.dimigo.exception;

/**
 * <pre>
 * oop.dimigo.exception
 *   _ MovieTest
 * 
 * About :
 * Date : 2015. 9. 21.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Movie[] movies = {
					new Movie("앤트맨",15),new Movie("사도",12),new Movie("베테랑",15)
			};
			int age = 13;
			for(Movie movie : movies) {
				try{
				buyTicket(movie, age);        // 여기서 예외 던짐
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
				}
			

	}
	
	private static void buyTicket(Movie movie, int age) throws AgeCheckException  {
		if(age < movie.getLimitAge()){
			
			AgeCheckException e = new AgeCheckException(movie);
			throw e;
		}
		else {
			System.out.println(movie.getTitle() + " 영화 즐감하세용~~");
		}
	}

}
