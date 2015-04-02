package org.dimigo.basic;

/***********************************
 * << 첫번쩨 수행평기 >>
 * 내용 : 아이유 프로필 출력하기
 * 작성일 : 2015.03.13. FRI
 * @author 한수지
 * 
 */
public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "아이유"; //이름
		boolean gender = true; //성별
		int age = 23; //나이
		double height = 161.8; //키
		float weight = 44.3f; //몸무게
		char bloodType = 'A'; //혈액형
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		System.out.printf("성별 : ");
		if(gender = true)
			System.out.println("여자");
		else System.out.println("남자");
		System.out.println("나이 : " + age + " 세" );
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodType + " 형");
	}

}
