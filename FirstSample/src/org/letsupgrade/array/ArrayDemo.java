package org.letsupgrade.array;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		//iterating array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//access direct element
		System.out.println("Array at Index 4: "+arr[4]);
	}
}
