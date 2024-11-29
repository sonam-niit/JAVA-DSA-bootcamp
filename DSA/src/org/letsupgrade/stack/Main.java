package org.letsupgrade.stack;

public class Main {
	public static void main(String[] args) {
		Stack coinStack= new Stack(5);
		coinStack.push(5);
		coinStack.push(10);
		coinStack.push(2);
		coinStack.push(1);
		coinStack.push(20);
		coinStack.push(10);// stack Overflow
		System.out.println(coinStack.peek()+" is on the Top");
		coinStack.pop();
		coinStack.pop();
		coinStack.pop();
		System.out.println(coinStack.peek()+" is on the Top");
		coinStack.pop();
		coinStack.pop();
		coinStack.pop();
	}

}