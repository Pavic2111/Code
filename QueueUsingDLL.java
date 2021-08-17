package ds;

public class QueueUsingDLL {
	private DLL list = null;
	
	public QueueUsingDLL() {
		this.list = new DLL();
	}
	public void EnQueue(int data) {
		list.add(data);
		System.out.println( data+  " EnQueued into Queue");
	}
	public void DeQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		int data = First();
		list.remove(0);
		System.out.println(data+  " DeQueued from Queue");
	}
	public int First() {
		return list.get(0);
	}
	public int Last() {
		return list.get(size() -1);
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public int size() {
		return list.size();
	}
	public static void main(String[] args) {
		QueueUsingDLL q = new QueueUsingDLL();
		q.EnQueue(10);
		q.EnQueue(20);
		q.EnQueue(30);
		System.out.println(q);
		q.DeQueue();
		System.out.println(q);
		System.out.println("First Element is :"+ q.First());
		System.out.println("Last Element is :"+q.Last());
		q.DeQueue();
		q.DeQueue();
		System.out.println(q);
		System.out.println("Size of the Queue is :"+q.size());
		System.out.println("Is Queue empty : " + q.isEmpty());
	}

}
