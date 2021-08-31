package Homeworks;

public class QueueWithDLL {

	private DoubleLinkedList list = null;
	
	public QueueWithDLL() {
		this.list = new DoubleLinkedList();
	}
	public void EnQueue(int data) {
		list.addFirst(data);
		System.out.println(data+ " EnQueued into Queue");
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public int size() {
		return list.Size();
	}
	
	public static void main(String[] args) {
		QueueWithDLL qq = new QueueWithDLL();
		qq.EnQueue(10);
		qq.EnQueue(20);
		qq.EnQueue(30);
		System.out.println("the size of the queue is : "+qq.size());
		System.out.println("is quueu empty ?"+ qq.isEmpty() );
	}
	
}
