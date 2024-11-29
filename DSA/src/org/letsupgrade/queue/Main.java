package org.letsupgrade.queue;

public class Main {
	public static void main(String[] args) {
		Queue myQueue= new Queue();
		
		myQueue.enqueue(4);
		myQueue.enqueue(3);
		myQueue.enqueue(90);
		myQueue.enqueue(42);
		myQueue.enqueue(76);
		System.out.println("Size of MyQueue: "+myQueue.getSize());
		System.out.println("Is the QueueEmpty "+myQueue.isEmpty());
		System.out.println("Peek: "+myQueue.peek());
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
	}

}
