package com.lily.littleproject;

/**
 * 单链表操作。包括：
 * 1、新建链表
 * 2、添加节点
 * 3、遍历节点，输出链表内容
 * 4、获取节点个数
 * 5、获取链表中间位置的数据
 * @author Administrator
 *
 */
public class LinkedListDemo {
	Node head=null;
    Node current=null;
    
	public static void main(String[] args) {
		LinkedListDemo list=new LinkedListDemo();
		for(int i=0;i<5;i++){
			list.addNode(i);//循环添加节点
			
		}
		//list.getLength(list.head);
		//list.getMid(list.head);
		list.print(list.head);//打印链表

	}
	class Node{
		Node next=null;
		int date;
		public Node(int date){
			this.date=date;
		}
	}
	//向链表中插入数据
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
	
	//遍历链表，递归
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
	//获取链表中节点个数
	public void getLength(Node head){
		if(head==null)
			return;
		current=head;
		int length=0;
		while(current!=null){
			length++;
			current=current.next;
		}
		System.out.println("节点个数为："+length);
	}
	//查找单链表的中间节点（不通过获取长度来计算）.
	//通过两个指针，一个每次走两个，一个每次走一步，当第一个走到最后时，第二个就到了中间
	public void getMid(Node head){
		if(head==null)
			return;
		Node first=head;
		Node second=head;
		while(head!=null&&second.next!=null){
			first=first.next;
			second=second.next.next;
			
		}
		System.out.println("链表的中间节点为："+first.date);
	}

}
