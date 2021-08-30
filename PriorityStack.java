package Homeworks;

public class PriorityStack {
private int MAX;
private int [] store;
private int nItems;

public PriorityStack() {
	MAX = 10;
	store = new int[MAX];
	nItems = 0;
}
public void push(int vfr) {
	int i;
	if(nItems == 0) {
		store[0] = vfr;
		nItems++;
		return ;
	}
	for(i = nItems - 1; i >= 0; i--) {
		if(vfr > store[i]) {
			store[i+1] = store[i];
		} else {
			break;
		}
	}
	store[i+1] = vfr;
	nItems++;
}
public void printPriorityStack() {
	for(int i = 0; i< nItems; i++) {
		System.out.println(store[i] + " ");
	}
}
	public int Pop() {
		return store[--nItems];
}
	public boolean isFull() {
		return nItems == MAX;
	}
	public boolean isEmpty() {
		return nItems == 0;
	}
	public int  getPeek() {
		return  store[nItems -1];
}
	public static void main(String[] args) {
		PriorityStack ps = new PriorityStack();
		ps.push(20);
		ps.push(40);
		ps.push(50);
		ps.push(60);
		
		ps.printPriorityStack();
		
		System.out.println();
		System.out.println("The highiest priority is: "+ps.Pop());
		ps.printPriorityStack();
		
		System.out.println();
		System.out.println("The highiest priority is: "+ps.Pop());
		ps.printPriorityStack();
		System.out.println("The highiest priority is: "+ps.Pop());
		ps.printPriorityStack();
		System.out.println("The highiest priority is: "+ps.Pop());
		System.out.println("The Stack is empty!");
		System.out.println("Is the Stack empty: " + ps.isEmpty());
	}
}

