package org.letsupgrade.first;

public class Pen {

	//Member Variables
	String color;
	String brandName;
	//Constructor
	public Pen(String color, String brandName) {
		this.color = color;
		this.brandName = brandName;
	}
	//methods
	public void write() {
		System.out.println("Written Data");
	}
	public void remove() {
		System.out.println("Data Removed");
	}
	@Override
	public String toString() {
		return "Pen [color=" + color + ", brandName=" + brandName + "]";
	}
	
}
