package com.lily.littleproject;

public class LinkedListDemo2 {
	Node head;
	Node current;

	public static void main(String[] args) {
		LinkedListDemo2 link = new LinkedListDemo2();
		for (int i = 0; i < 5; i++) {
			link.add(i);
		}
		link.add(1);

		System.out.println("��ʼ����:");
		link.print(link.head);
		// System.out.println("��ת������:");
		// Node reverse=link.linkedReverse(link.head);
		// link.print(reverse);

		// System.out.println("ȥ�غ������Ϊ��");
		// link.delDouble(link.head);
		// link.print(link.head);

		Node newNode = link.quchong(link.head);
		System.out.println("\nȥ�غ�����:");
		link.print(newNode);
	}

	class Node {
		Node next = null;
		int data;

		public Node(int date) {
			this.data = date;
		}
	}

	public void add(int d) {
		Node node = new Node(d);

		if (head == null) {
			head = node;
			current = head;
		} else {
			current.next = node;
			current = current.next;
		}
	}

	public void print(Node head) {
		if (head == null)
			return;
		current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	// ������ת.ͨ���½�������ÿ�α�����ֵѭ�������������У�ÿ�ν�������ֵ����newhead�Ȼ��֮ǰnewhead�Ľڵ�������ڽڵ�ĺ���
	public Node linkedReverse(Node head) {
		if (head == null || head.next == null)
			return head;
		Node current = head;
		Node newhead = null;
		while (current != null) {
			Node next1 = current.next;// �Ƚ���ǰ�ڵ��next��ȡ��
			Node temp = newhead;// ��newhead������ʱtemp�ڵ�
			newhead = current;// ��ǰ�ڵ�����������ͷ���
			newhead.next = temp;// newhead��next���ڸ�ֵǰ��newhead��Ҳ������һ���ڵ㣩
			current = next1;// ��ȡԭ�ڵ��next���˴�����ֱ�ӻ�ȡcurrent.next����Ϊ��һ�������Ѿ����丳ֵΪnull��
		}
		return newhead;
	}

	// ɾ����������ظ��ڵ� ��
	// 1�����ѭ����(����head��ֱ�����Ԫ��)
	// 2���½����pָ��head
	// 3���ڲ�ѭ��p(����p��ֱ�����Ԫ��)
	// 3.1��if head.date�Ƿ��p.next.date��ȣ���p.next����p���Ƚϣ���Ϊ����ɾ��ʱ�����Խ�����ָ��������������
	// 3.1.1��ȣ�ɾ����Ƚ�㣬��p.nextָ��p.next.next
	// 3.1.2���ȣ�p�����λ
	// 4.�ڲ�ѭ����������head����
	public void delDouble(Node head) {
		if (head == null || head.next == null)
			return;// �жϽڵ�Ϊ�ջ���ֻ��һ���ڵ��ʱ�򣬲���������
		while (head.next != null) {
			Node p = head;
			while (p.next != null) {
				if (head.data == p.next.data) {
					p.next = p.next.next;
				} else {
					p = p.next;
				}
			}
			head = head.next;
		}
		// return head;
	}

	/**
	 * �������ȥ�ظ�
	 * 
	 * @param head
	 * @return
	 */
	public Node quchong(Node head) {

		// ���ж�
		if (head == null || head.next == null) {
			return head;
		}

		// ����һ���µ������������ͷ����ԭ�������ͷ���������nextΪnull
		Node newHead = new Node(head.data);

		// ԭ�������ѭ��ÿ�α���ʱ�ĵ�ǰ�ڵ�
		Node outterCurrent = head.next;

		while (outterCurrent != null) {

			// �������ڲ�ѭ����ÿ�α���ʱ�ĵ�ǰ�ڵ�
			Node innerCurrent = newHead;

			while (innerCurrent != null) {

				// ������������data���ʱ��˵���ظ�����������ѭ��
				if (outterCurrent.data == innerCurrent.data) {
					break;
				}

				// nextΪ�գ�˵���Ѿ�������������һ��Ԫ�أ���ʱ����ԭ�����Ԫ����ӵ��������ĩβ������������ѭ��
				if (innerCurrent.next == null) {

					innerCurrent.next = new Node(outterCurrent.data);
					break;
				}

				innerCurrent = innerCurrent.next;

			}

			outterCurrent = outterCurrent.next;
		}

		return newHead;
	}

}
