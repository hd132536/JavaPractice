/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ CalculatorTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 5.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class CalculatorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator num = new Calculator(10, 20);
		//num.powerOn();
		
		System.out.println("10 + 20 = " + num.add());
		System.out.println("10 - 20 = " + num.sub());
		System.out.println("10 * 20 = " + num.mul());
		System.out.println("10 / 20 = " + num.div());
		
		num.powerOff();
	}
}
