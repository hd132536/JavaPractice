/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ PiggyBank
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 12.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class PiggyBank {
	private static int balance = 0;
	
	public static void putMoney(FamilyMember member, int amount) {
		balance += amount;
		System.out.println( member.getMemberName()+ " " + amount + "를 넣음");		
	}
	
	public static void printBalance() {
		System.out.println();
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
}
