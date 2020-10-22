package Octover20;

public class Linkedlist {
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node{//노드 프라이빗해서 일반적 접근 불가능
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
		newNode.next = head;//새로만든 노드의 다음에 기존 선두를 입력
		head=newNode;//선두를 새 노드로 교체
		size++;
		if(head.next==null) {//새 노드의 다음이 없으면 끝 노드로 지정
			tail = head;
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size==0) {//처음 실행한다면 addFirst() 실행
			addFirst(input);
		}
		else {
			tail.next=newNode;//기존 끝 노드의 다음을 지정함
			tail = newNode;//새걸로 교체
			size++;
		}
	}
	
	Node node(int index) {//특정 위치의 노드 찾기
		Node x = head;//선두부터 탐색 시작
		for (int i = 0; i < index; i++) {//탐색하려는 위치까지
			x = x.next;//노드들의 다음 노드로 이동함
		}
		return x;//마지막 x를 반환
	}
	
	public void add(int k, Object input){//중간에 삽입하는 경우
		if(k == 0) {//지정 위치가 0이면 헤드에 삽입
			addFirst(input);
		}
		else {
			Node temp1 = node(k-1);//k번 앞의 노드를 가져옴.
			Node temp2 = temp1.next;//그 뒤도 가져옴
			Node newNode = new Node(input);//중간에 넣음
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			if(newNode.next == null) {//새 노드의 다음이 없다
				tail = newNode;//끝 노드를 새 노드로 지정
			}
		}
	}
	
	public String toString() {//선라이트 옐로 오버라이드
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
	
	public Object removeFirst() {//선두 지우고 지워진 선두 출력
		Node temp = head;//선두 노드 저장
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
		Node temp = node(k-1);//바로 앞 노드 가져옴
		Node todoDeleted = temp.next;//삭제할거 가져옴
		temp.next=temp.next.next;//앞 노드의 다음 노드 수정
		Object returnData = todoDeleted.data;
		if(todoDeleted == tail) {//지울게 마지막이면 끝은 앞 노드
			tail = temp;
		}
		todoDeleted = null;//삭제 대상을 지운다.
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

