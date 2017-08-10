package com.lily.littleproject;

public class LinkedListDemo2 {
	Node head;
	Node current;

	public static void main(String[] args) {
		LinkedListDemo2 link=new LinkedListDemo2();
		for(int i=0;i<5;i++){
			link.add(i);
		}
		link.add(1);
		link.print(link.head);
		//System.out.println("反转后链表:");
		//Node reverse=link.linkedReverse(link.head);
		//link.print(reverse);
		
		System.out.println("去重后的链表为：");
		link.delDouble(link.head);
		link.print(link.head);

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
	//单链表反转.通过新建链表，将每次遍历的值循环插入新链表中，每次将遍历的值存在newhead里，然后将之前newhead的节点放在现在节点的后面
	public Node  linkedReverse(Node head){
		if(head==null||head.next==null)
			return head;
		Node current=head;
		Node newhead=null;
		while(current!=null){
			Node next1=current.next;//先将当前节点的next获取到
			Node temp=newhead;//将newhead存在临时temp节点
			newhead=current;//当前节点等于新链表的头结点
			newhead.next=temp;//newhead的next等于赋值前的newhead（也就是上一个节点）
			current=next1;//获取原节点的next。此处不能直接获取current.next。因为上一步操作已经将其赋值为null了
		}
		return newhead;
	}
	//删除单链表的重复节点 。
	//1、外层循环，(遍历head，直到最后元素)
	//2、新建结点p指向head
	//3、内层循环p(遍历p，直到最后元素)
	// 3.1、if head.date是否和p.next.date相等（用p.next不用p来比较，是为了在删除时，可以将结点的指针域连接起来）
	//   3.1.1相等，删除相等结点，将p.next指向p.next.next
	//   3.1.2不等，p向后移位
	//4.内层循环结束，将head后移
	public void delDouble(Node head){
		if(head==null||head.next==null)
			return ;//判断节点为空或者只有一个节点的时候，不进行排重
		while(head.next!=null){
			Node p=head;
			while(p.next!=null){
				if(head.date==p.next.date){
					p.next=p.next.next;
				}else{
					p=p.next;
				}
			}
			head=head.next;
		}
		//return head;
	}

}
