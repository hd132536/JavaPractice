/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ IdolGroup
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 28.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] IdolGroup = {"어벤져스", "셜록 시리즈", "걸스데이" };
		String[][] Members = {
				{"아이언맨", "캡틴아메리카", "블랙 위도우", "호크 아이", "토르", "헐크"},
				{"셜록 홈즈", "존 왓슨", "메리 왓슨"},
				{"유라", "혜리", "소진", "민아"}
		};
		
		for(int i = 0 ; i <3 ; i ++){
			System.out.println("<< " + IdolGroup[i] + " >>");
			for(String Val : Members[i])
				System.out.println(Val);
			}
		System.out.println();
	}
}
