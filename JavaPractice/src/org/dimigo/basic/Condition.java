/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * |_ Condition
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 2.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class Condition {
	public static void main(String[] args) {
		
		int fee = 0; //요금
		
		String trans = "고속버스";
		int distance = 10;
		int car = 0;
		if(distance == 0) { //거리는 0이 되면 안됨
			System.out.println("잘못된 거리입니다.");
		}
		
		if(trans == "고속버스") car = 1;
		else if(trans == "경차") car = 2;
		else if(trans == "그 외") car = 3;
		
		switch(car) { //차종에 따른 요금 계산
			case 1 : 
				fee = 850;
				fee += 300 * (int)( (distance - 1) / 10);
				break;
				
			case 2 :
				fee = 300;
				fee += 200 * (int)( (distance - 1) / 10);
				break;
			
			case 3 :
				fee = 600;
				fee += 200 * (int)( (distance - 1) / 10);
				break;
			
			default :
					System.out.println("잘못 된 차량입니다.");
					break;
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km" );
		System.out.println("차종 : " + trans);
		System.out.println("통행료 : " + fee + "원");
	}
}
