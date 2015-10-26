/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * <pre>
 * org.dimigo.io
 * |_ SaveImageFromUrl
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 26.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class SaveImageFromUrl {

	public static void main(String[] args) {
		String imageUrl = "https://static.dimigo.in/img/logobeta.png";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is =  url.openStream();
					OutputStream os = new FileOutputStream("files/image.png" )){
						int result;
						byte[] buf = new byte[100];
						
						while( (result = is.read(buf)) != -1) {
							os.write(buf, 0, result);
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
