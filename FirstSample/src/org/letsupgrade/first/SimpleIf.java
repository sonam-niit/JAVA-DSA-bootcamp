package org.letsupgrade.first;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Marks");
		float marks= sc.nextFloat();
		if(marks>=35 && marks<=100) {
			System.out.println("Congratulations..!! You have passed the exam");
		}else {
			System.out.println("Sorry.. you are fail");
		}
		sc.close();
	}
}
