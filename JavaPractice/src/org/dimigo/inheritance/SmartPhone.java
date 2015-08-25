/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_ SmartPhone
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}

	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void pay() {
	}
	
	public void useSpecialFunction(){
		if(this == null) return;
		if(this instanceof IPhone) {
			IPhone i = new IPhone();
			i.usuAirDrop();
		}
		else if(this instanceof Galaxy) {
			Galaxy g = new Galaxy();
			g.useWirelessCharging();
		}
	}

	public String toString() {
		return "모엘명 : " + model + ", 제조사 : " + company + ", 가격 : " + String.format("%,1d", price);
	}
}
