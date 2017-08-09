package com.lily.littleproject;

public class LinkedListDemo2 {
	Node head;
	Node current;

	public static void main(String[] args) {
		LinkedListDemo2 link=new LinkedListDemo2();
		for(int i=0;i<5;i++){
			link.add(i);
		}
		link.print(link.head);
		System.out.println("反转后链表:");
		Node reverse=link.linkedReverse(link.head);
		link.print(reverse);

	}
	class Node{
		Node next=null;
		int date;
		public Node(int date){
			this.date=date;
		}
	}
	public void add(int d){
		Node node=new Node(d);
		
		if(head==null){
			head=node;
			current=head;
		}else{
			current.next=node;
			current=current.next;
		}
	}
	
	public void print(Node head){
		if(head==null)
			return;
		current=head;
		while(current!=null){
			System.out.print(current.date+" ");
			current=current.next;
		}
	}
	//链表反转
	public Node  linkedReverse(Node head){
		if(head==null||head.next==null)
			return head;
		Node current=head;
		Node newhead=null;
		while(current!=null){
			Node temp=newhead;
			newhead=current;
			newhead.next=temp;
			current=current.next;
		}
		return newhead;
	}

}
