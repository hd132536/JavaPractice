/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ CountTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 11.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class CountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			new Count();
			System.out.println(Count.getCount());
		}
	}
}
