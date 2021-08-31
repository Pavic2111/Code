
package Homeworks;

public class StackUsingDLL {

	private DoubleLinkedList list = null ;
	
	public   StackUsingDLL() {
		this.list = new DoubleLinkedList();
	}
	public void push(int data) {
		list.addFirst(data);
		System.out.println(data + " Inserted into stack");
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return ;
		}
		int data = peek();
		list.removeLast();
		System.out.println(data+ " removed from stack");
	
	}
	public int peek() {
	return list.Size()-1;
	}
	public int size() {
		return  list.Size();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	@Override
	public String toString() {
		return list.toString();
	}
	public static void main(String[] args) {
		StackUsingDLL s = new StackUsingDLL();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println("Top Element is : "+s.peek());
		System.out.println(s);
		System.out.println("Size of the Stack is "+ s.size());
		s.pop();
		s.pop();
		System.out.println(s);
		System.out.println("Size of the Stack is "+ s.size());
		s.pop();
		System.out.println("Is Stack Empty : "+s.isEmpty());
		
		
	}
}