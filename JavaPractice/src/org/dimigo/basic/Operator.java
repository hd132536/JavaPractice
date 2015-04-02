package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 9;
		int b = 10;
		double h = 5.8;
		int aa = 9;
		double hh = 5.4;
		  
		double s1 = (a + b) * h / 2;
		double s2 = (aa * hh);
		
		System.out.println(" << 도형 넓이 비교 >> ");
		System.out.println("사다리꼴 넓이 : " + s1);
		System.out.println("평행사변형 넓이 : " + s2);
		
		System.out.println();
		
		if(s1 == s2) {
			System.out.println("두 도형의 넓이는 같습니다.");
		}
		else if(s1 < s2) {
			System.out.println("평행사변형이 사다리꼴보다" + (s2 - s1) + " 더 큽니다.");
		}
		
		else {
			System.out.println("사다리꼴이 평행사변령 보다 " + (s1 - s2) + " 더 큽니다.");
		}
	}
}
