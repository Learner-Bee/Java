package com.lily.littleproject;

public class LinkedListDemo {
	Node head=null;
    Node current=null;
    
	public static void main(String[] args) {
		LinkedListDemo list=new LinkedListDemo();
		for(int i=0;i<5;i++){
			list.addNode(i);
			
		}
		list.print(list.head);

	}
	class Node{
		Node next=null;
		int date;
		public Node(int date){
			this.date=date;
		}
	}
	//�������в�������
	public void addNode(int d){
		Node node=new Node(d);
		if(head==null){
			head=node;
			current=head;
		}else{
			current.next=node;
			current=current.next;
		}
	}
	//��ӡ�����ݹ�
	public void print(Node head){
		if(head==null)
			return;
		current=head;
		while(current!=null){
			System.out.println(current.date);
			current=current.next;
			//print(head.next);
			
		}
		
	}

}
