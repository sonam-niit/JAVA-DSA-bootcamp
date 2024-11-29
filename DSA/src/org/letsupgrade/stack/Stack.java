package org.letsupgrade.stack;

public class Stack {
	private int[] stackArray;
	private int top;
	private int capacity;

	public Stack(int size) {
		capacity = size;
		stackArray = new int[size];
		top = -1;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return -1; //stop execution from here
		}
		return stackArray[top]; //just return the value available on the TOP
	}
	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			return; //stop execution from here
		}
		stackArray[++top]=element;
		System.out.println("Element Pushed "+element);
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return -1; //stop execution from here
		}
		System.out.println("Element Popped "+stackArray[top]);
		return stackArray[top--];
	}
	public boolean isFull() {
		return top==capacity-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
}
