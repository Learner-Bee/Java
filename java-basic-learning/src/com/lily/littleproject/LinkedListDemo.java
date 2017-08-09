package com.lily.littleproject;

/**
 * �����������������
 * 1���½�����
 * 2����ӽڵ�
 * 3�������ڵ㣬�����������
 * 4����ȡ�ڵ����
 * 5����ȡ�����м�λ�õ�����
 * @author Administrator
 *
 */
public class LinkedListDemo {
	Node head=null;
    Node current=null;
    
	public static void main(String[] args) {
		LinkedListDemo list=new LinkedListDemo();
		for(int i=0;i<5;i++){
			list.addNode(i);//ѭ����ӽڵ�
			
		}
		//list.getLength(list.head);
		//list.getMid(list.head);
		list.print(list.head);//��ӡ����

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
	
	//���������ݹ�
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
	//��ȡ�����нڵ����
	public void getLength(Node head){
		if(head==null)
			return;
		current=head;
		int length=0;
		while(current!=null){
			length++;
			current=current.next;
		}
		System.out.println("�ڵ����Ϊ��"+length);
	}
	//���ҵ�������м�ڵ㣨��ͨ����ȡ���������㣩.
	//ͨ������ָ�룬һ��ÿ����������һ��ÿ����һ��������һ���ߵ����ʱ���ڶ����͵����м�
	public void getMid(Node head){
		if(head==null)
			return;
		Node first=head;
		Node second=head;
		while(head!=null&&second.next!=null){
			first=first.next;
			second=second.next.next;
			
		}
		System.out.println("������м�ڵ�Ϊ��"+first.date);
	}

}
