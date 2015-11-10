/**
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * <pre>
 * org.dimigo.io
 *   _ SaveImageFromUrl
 * 
 * About :
 * Date : 2015. 10. 26.
 * </pre>
 *
 * @author	: 김종현
 * @version : 1.0
 */
public class SaveImageFromUrl {

	
	public static void main(String[] args) {
		String imageUrl = "https://static.dimigo.in/img/logobeta.png";
		
		try{
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/logo.png") ){
				
				int result;
				byte[] buf = new byte[100];
				
				while((result = is.read(buf)) != -1){
					os.write(buf, 0, result);
				}
				
			} catch(IOException e){
				e.printStackTrace();
			}
			
		}catch (MalformedURLException e){
			e.printStackTrace();
		}
	}

}