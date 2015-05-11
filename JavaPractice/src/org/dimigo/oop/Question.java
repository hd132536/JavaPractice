/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * |_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String ans1 = "스티브";
		String ans2 = "로다주";
		String ans3 = "베네딕트 컴버배치";
		
		System.out.println("캡틴아메리카의 실명은?");
		String answer = scanner.nextLine();
		
		if(ans1.equals(answer))
			System.out.println("정답입니다.");
		else System.out.println("틀렸습니다.");
		System.out.println();
		
		System.out.println("아이언맨의 실명은?");
		String answer2 = scanner.nextLine();
		
		if(ans2.equals(answer2))
			System.out.println("정답입니다.");
		else System.out.println("틀렸습니다.");
		
		System.out.println();
		System.out.println("영국 드라마 셜록에 나오는 셜록의 실명은?");
		String answer3 = scanner.nextLine();
		
		if(ans3.equals(answer3))
			System.out.println("정답입니다.");
		else System.out.println("틀렸습니다.");
		
		scanner.close();

		
	}

}
