/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ Calculator
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 5.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class Calculator2 {
		//////////인스턴스 필드/////////////////
		private boolean powerFlag; //객체마다 값이 다르므로 instance
		///////////정적 필드//////////
		public static double Pi = 3.141592;
		
		public Calculator2() {
			
		}
		
		/*********인스턴스 메소드**********/
		public void powerOn() {
			if(!this.powerFlag) {
				System.out.println("전원을 킵니다.");
				this.powerFlag = true;
			}
		}
		
		public void powerOff() {
			if(this.powerFlag) {
				System.out.println("전원을 끕니다.");
			}
			this.powerFlag = false;
		}
		
		/*********정적 메소드**********/

		public static int add(int num1, int num2) {
			return num1 + num2;
		}
		
		public static double add(double num1, double num2) {
			return num1 + num2;
		}
		
		public static int sub(int num1, int num2) {
			return num1 - num2;
		}
		
		public static double sub(double num1, double num2) {
			return num1 - num2;
		}
		
		public static int mul(int num1, int num2) {
			return num1 * num2;
		}
		
		public static double mul(double num1, double num2) {
			return num1 * num2;
		}
		
		public static double div(int num1, int num2) {
			return (double)num1 / num2;
		}
		
		public static double div(double num1, double num2) {
			return num1 / num2;
		}
		
		
		// power를 먼저 켜기 위핸 메소드 오버로딩
		public static int add(int num1, int num2, Calculator2 c) {
			c.powerOn();
			return num1 + num2;
		}
		
		public static double add(double num1, double num2, Calculator2 c) {
			c.powerOn();
			return num1 + num2;
		}
		
		public static int sub(int num1, int num2, Calculator2 c) {
			c.powerOn();
			return num1 - num2;
		}
		
		public static double sub(double num1, double num2, Calculator2 c) {
			c.powerOn();
			return num1 - num2;
		}
		
		public static int mul(int num1, int num2, Calculator2 c) {
			c.powerOn();
			return num1 * num2;
		}
		
		public static double mul(double num1, double num2, Calculator2 c) {
			c.powerOn();
			return num1 * num2;
		}
		
		public static double div(int num1, int num2, Calculator2 c) {
			c.powerOn();
			return (double)num1 / num2;
		}
		
		public static double div(double num1, double num2, Calculator2 c) {
			c.powerOn();
			return (double)num1 / num2;
		}
		
}
