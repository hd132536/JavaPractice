/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ CarTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car1 = new Car();
//		Car car2 = new Car();
//		Car car3 = new Car();
		
		Car2 car = new Car2();
		
		System.out.println("<< 자동차 목록 >>");
		
		System.out.println("제조사명 : " + car.getCompany()); 
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km" );
		System.out.println("가격 : " + String.format("%,d", car.getPrice() ) + "원");
		System.out.println();
		
		car = new Car2("기아 자동차", "K7", "흰색", 246, 40000000);
		
//		car2.setCompany("기아자동차");
//		car2.setModel("K7");
//		car2.setColor("흰색");
//		car2.setMaxSpeed(246);
//		car2.setPrice(40000000);

		System.out.println("제조사명 : " + car.getCompany()); 
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km" );
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		System.out.println();
		
		car = new Car2("삼성 자동차", "SM7", "회색", 200, 38000000);

//		car3.setCompany("삼성자동차");
//		car3.setModel("SM7");
//		car3.setColor("회색");
//		car3.setMaxSpeed(200);
//		car3.setPrice(38000000);

		System.out.println("제조사명 : " + car.getCompany()); 
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km" );
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
	}
}
