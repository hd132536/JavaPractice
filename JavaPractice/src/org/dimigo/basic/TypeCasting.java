package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 1700000;
		int num = 3;
		long storeNum = 1500;
		
		long yearly = money*12*num*storeNum;
		
		String.format("%,d", yearly);
		
		System.out.println(" << 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", money) + "원");
		System.out.println("점포 내 직원 수 : " + num + "명" );
		System.out.println("점포 수 : " + String.format("%,d", storeNum) + "개");
		System.out.println();
		System.out.println("연간 인건비 : " + String.format("%,d", yearly));
		
	}

}
