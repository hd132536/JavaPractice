/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ Car
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class Car2 {
		private String company = "현대자동차";
		private String model = "제네시스";
		private String color = "검정색";
		private int maxSpeed = 225;
		private int price = 50000000;
		
		public Car2() {
			
		}
		
		public Car2(String newcompany, String newmodel, String newcolor, int newmaxSpeed, int newprice) {
			company = newcompany;
			model = newmodel;
			color = newcolor;
			maxSpeed = newmaxSpeed;
			price = newprice;
		}
		
		public String getCompany() {
			return company;
		}
		
		public String getModel() {
			return model;
		}
		
		public String getColor() {
			return color;
		}
		
		public int getMaxSpeed() {
			return maxSpeed;
		}
		
		public int getPrice() {
			return price;
		}
		
//		public void setCompany(String newcompany) {
//			company = newcompany;
//		}
//		
//		public void setModel(String newModel) {
//			model = newModel;
//		}
//		
//		public void setColor(String newColor) {
//			color = newColor;
//		}
//		
//		public void setMaxSpeed(int newMaxSpeed) {
//			maxSpeed = newMaxSpeed;
//		}
//		
//		public void setPrice(int newPrice) {
//			price = newPrice;
//		}
}
