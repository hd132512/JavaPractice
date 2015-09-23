/**
 */
package oop.dimigo.collection;

/**
 * <pre>
 * oop.dimigo.collection
 *   _ Music
 * 
 * About :
 * Date : 2015. 9. 23.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class Music {
	private String title;
	private String singer;
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	
	
	
}
