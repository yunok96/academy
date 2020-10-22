package Octover20;

public class Linkedlist {
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node{//��� �����̺��ؼ� �Ϲ��� ���� �Ұ���
		private Object data;
		private Node next;
		public Node(Object input) {
			this.data=input;
			this.next=null;
		}
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;//���θ��� ����� ������ ���� ���θ� �Է�
		head=newNode;//���θ� �� ���� ��ü
		size++;
		if(head.next==null) {//�� ����� ������ ������ �� ���� ����
			tail = head;
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size==0) {//ó�� �����Ѵٸ� addFirst() ����
			addFirst(input);
		}
		else {
			tail.next=newNode;//���� �� ����� ������ ������
			tail = newNode;//���ɷ� ��ü
			size++;
		}
	}
	
	Node node(int index) {//Ư�� ��ġ�� ��� ã��
		Node x = head;//���κ��� Ž�� ����
		for (int i = 0; i < index; i++) {//Ž���Ϸ��� ��ġ����
			x = x.next;//������ ���� ���� �̵���
		}
		return x;//������ x�� ��ȯ
	}
	
	public void add(int k, Object input){//�߰��� �����ϴ� ���
		if(k == 0) {//���� ��ġ�� 0�̸� ��忡 ����
			addFirst(input);
		}
		else {
			Node temp1 = node(k-1);//k�� ���� ��带 ������.
			Node temp2 = temp1.next;//�� �ڵ� ������
			Node newNode = new Node(input);//�߰��� ����
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			if(newNode.next == null) {//�� ����� ������ ����
				tail = newNode;//�� ��带 �� ���� ����
			}
		}
	}
	
	public String toString() {//������Ʈ ���� �������̵�
		if(head==null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		while(temp.next != null) {
			str += temp.data + ",";
			temp = temp.next;
		}
		str += temp.data;
		return str + "]";
	}
	
	public Object removeFirst() {//���� ����� ������ ���� ���
		Node temp = head;//���� ��� ����
		head = temp.next;
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}
	
	public Object remove(int k) {
		if(k == 0) {
			return removeFirst();
		}
		Node temp = node(k-1);//�ٷ� �� ��� ������
		Node todoDeleted = temp.next;//�����Ұ� ������
		temp.next=temp.next.next;//�� ����� ���� ��� ����
		Object returnData = todoDeleted.data;
		if(todoDeleted == tail) {//����� �������̸� ���� �� ���
			tail = temp;
		}
		todoDeleted = null;//���� ����� �����.
		size--;
		return returnData;
	}
	
	public int size() {
		return size;
	}
	
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
}

