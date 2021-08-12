package DayEight;

import DaySeven.Node;

public class removeLast {
  
	int data;
  Node next;
  void Node(int tmp){
  	data = tmp;
  }
  
  static Node removeLastElement(Node head) {
  	if ( head == null || head.next == null) {
  		return null;
  	}
  	Node temp =  head;
  	while(temp.next.next != null) {
  		temp = temp.next;
  	}
  	temp.next = null;
  	return head;
  }
  static void printList(Node head) {
  	while(head != null ) {
  		System.out.println(head.data+ " ");
  		head = head.next;
  	}
  	
  }
}

