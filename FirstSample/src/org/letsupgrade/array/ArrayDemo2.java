package org.letsupgrade.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		String arr[]= new String[5];
		
		arr[0]="sonam";
		arr[1]="Alex";
		arr[2]="Bob";
		arr[3]="Catty";
		arr[4]="Devid";
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
