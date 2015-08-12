/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ Count
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 11.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class Count {
	private static int count = 0;
	
	public Count() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}
}
