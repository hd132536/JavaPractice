/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ PiggyBankTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 12.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FamilyMember[] members = {
			new FamilyMember("아빠"),
			new FamilyMember("엄마"),
			new FamilyMember("나"),
			new FamilyMember("남동생")
		};
	
		int[] amounts = {10000, 5000, 3000, 2000};
		
		FamilyMember.printMemberCnt();
		
		for(int i = 0; i < 4; i++) {
			PiggyBank.putMoney(members[i], amounts[i]);
		}
		
		PiggyBank.printBalance();
	}
}
