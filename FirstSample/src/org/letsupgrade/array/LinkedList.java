package org.letsupgrade.array;

public class LinkedList {

	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	Node head;//starting point
	LinkedList(){
		this.head=null;
	}
	public void insert(int data) {
		Node newNode= new Node(data);
		newNode.next=null;
		if(head==null) {
			head=newNode;
		}else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			//Let's insert the new Node to last location
			last.next= newNode;
		}
	}
	public void print() {
		Node currNode= head;
		while(currNode!=null) {
			System.out.println(currNode.data);
			currNode=currNode.next;
		}
	}
	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.print();
	}
}













