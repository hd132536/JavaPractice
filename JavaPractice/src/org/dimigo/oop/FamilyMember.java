/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ FamilyMember
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 12.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class FamilyMember {

	/**
	 * @param args
	 */
		// TODO Auto-generated method stub
		private static int memberCnt = 0;
		private String memberName;
		
		public FamilyMember(String memberName) {
			this.memberName = memberName;
			memberCnt++;
		}
		
		public String getMemberName() {
			return memberName;
		}
		
		public static void printMemberCnt() {
			System.out.println("가족 총 인원 수 : " + memberCnt + "명");
			System.out.println();
		}
}
