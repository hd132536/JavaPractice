package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i == j) {
					System.out.print("*");
					continue; //같은 수 출력 X
				}
				System.out.print(j);
			}			
			System.out.println(); //줄바꿈
		}
	}
}
