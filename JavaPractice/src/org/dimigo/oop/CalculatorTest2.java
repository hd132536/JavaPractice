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
public class CalculatorTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 3.14;
		double num2 = 2.8;
		
		Calculator2 calc = new Calculator2();
		
		//인스턴스 메소드
		//calc.powerOn();
		
		System.out.println();
		//정적 메소드 호출	
//		System.out.println(num1 +" + "+ num2 + " = " + Calculator2.add(num1, num2));
//		System.out.println(num1 +" + "+ num2 + " = " + Calculator2.sub(num1, num2));
//		System.out.println(num1 +" + "+ num2 + " = " + Calculator2.mul(num1, num2));
//		System.out.println(num1 +" + "+ num2 + " = " + Calculator2.div(num1, num2));
//		
		//static 메소드 호출 시 인스턴스 호출 방식으로 수행은 되지만
		//권장하는 방법은 아님 - 반드시 클래스명, 메소드명 호출
		//System.out.println(calc.add(num1,num2));
		
		//calc.powerOff();
		
		
		//power를 ㅋ지 않고 바로 연산했을 때 power가 자동으로 켜지도록 하기
		System.out.println(num1 +" + "+ num2 + " = " + String.format("%.1f", Calculator2.add(num1, num2, calc)));
		System.out.println(num1 +" + "+ num2 + " = " + String.format("%.1f", Calculator2.sub(num1, num2, calc)));
		System.out.println(num1 +" + "+ num2 + " = " + String.format("%.1f", Calculator2.mul(num1, num2, calc)));
		System.out.println(num1 +" + "+ num2 + " = " + String.format("%.1f", Calculator2.div(num1, num2, calc)));
		
		calc.powerOff();

	}
}
