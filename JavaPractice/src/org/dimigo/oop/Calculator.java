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
public class Calculator {
		private int num1 = 10;
		private int num2 = 20;
		private boolean powerFlag;
		
		public Calculator(int num1, int num2) {
			this.num1 = num1;
			this.num2 = num2;
		}
		
		public void powerOn() {
			this.powerFlag = true;
			System.out.println("줜원을 킵니다.");
		}
		
		public void powerOff() {
			if(!this.powerFlag) {
				System.out.println("전원을 끕니다.");
			}
			this.powerFlag = false;
		}
		
		public int add() {
			this.powerOn();
			return this.num1 + this.num2;
		}
		
		public int sub() {
			return this.num1 - this.num2;
		}
		
		public int mul() {
			return this.num1 * this.num2;
		}
		
		public double div() {
			return (double)this.num1 / this.num2;
		}
}
