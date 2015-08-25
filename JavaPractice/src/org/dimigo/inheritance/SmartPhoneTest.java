/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone a1 = new IPhone("IPhone 6", "애플", 7000000);
		SmartPhone g1 = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(a1);
		System.out.println(g1);
		
		System.out.println();
		
		a1.turnOn();
		a1.pay();
		a1.useSpecialFunction();
		a1.turnOff();
		
		System.out.println();
		
		g1.turnOn();
		g1.pay();
		g1.useSpecialFunction();
		g1.turnOff();
	}

}
