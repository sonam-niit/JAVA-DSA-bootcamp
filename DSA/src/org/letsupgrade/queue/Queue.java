package org.letsupgrade.queue;

public class Queue {

	private Node front,rear;
	private int size;
	
	public Queue() {
		front=rear=null; //at time of initialization
		size=0;
	}
	public boolean isEmpty() {
		return front==null;
	}
	public void enqueue(int data) {
		Node newNode= new Node(data);
		if(rear==null) {
			front=rear=newNode;
		}else {
			rear.next= newNode;
			rear=newNode;
		}
		size++;
		System.out.println("Enqueued "+data);
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Underflow");
			return -1;
		}
		int data= front.data;
		front=front.next;
		if(front==null) {
			rear=null;
		}
		size--;
		System.out.println("Dequeue "+data);
		return data;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Underflow");
			return -1;
		}
		return front.data;
	}
	public int getSize() {
		return size;
	}
}














