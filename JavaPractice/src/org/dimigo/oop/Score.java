/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * |_ Score
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		String print = new StringBuilder().append("<< 점수 출력 >>\n")
											.append("국어 점수 : ")
											.append(kor)
											.append("\n")
											.append("수학 점수 : ")
											.append(math)
											.append("\n")
											.append("영어 점수 : ")
											.append(eng)
											.append("\n")
											.append("평균 : ")
											.append( String.format("%.1f", (math + kor + eng) / 3.0) )
											.append("점\n")
											.toString();
		System.out.println(print);
		scanner.close();
	}

}
