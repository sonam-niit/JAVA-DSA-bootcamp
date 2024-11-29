package org.letsupgrade.first;

public class SamplePen {

	public static void main(String[] args) {
		
		Pen p1= new Pen("red", "Test");
		Pen p2= new Pen("blue", "Test");
		p1.write();
		p2.write();
		System.out.println(p1);
		System.out.println(p2);
	}
}
