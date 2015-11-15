/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * |_ Race
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class Race2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main method start");
		
		Thread t1 = new Thread(new Runner("한수지"));
		Thread t2 = new Thread(new Runner("김재원"));
		
		t1.start();
		t2.start();
		
		System.out.println("main method end");

	}

}
