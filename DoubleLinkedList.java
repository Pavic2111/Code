package Homeworks;
import java.util.NoSuchElementException;

public class DoubleLinkedList {
private  Node1 start;
private Node1 end;
private int size = 0;

public int Size() {
	return this.size;
}
public boolean addFirst(int value) {
 Node1 newNode = new Node1(value);
  if( start == null && end == null) {
  	start= newNode;
  	end = newNode;
  } else {
    Node1 second = start;
     Node1 first = newNode;
     first.next = second;
     second.previus = first;
     start = first;
   }
   size++;
   return true;
 }
  public boolean addLast(int value) {
    	Node1 newNode = new Node1(value);
    	 if (start == null && end == null) {
         start = newNode;
         end = newNode;
    } else {
    	 end.next = newNode;
       newNode.previus = end;
       end = newNode;
    }
    	 size++;
       return true;
}
    public String toString() {
      String tmpString = "[";
      Node1 s = start;
      while (s != null) {
        tmpString+= s.value + ", ";
        s = s.next;
      }
      tmpString += "]";
      return tmpString;
    }
    public Node1 removeLast() {
    	Node1 toRemove = start;
    	if(start == null || start.next == null) {
    		start = null;
    		return toRemove;
    	}
    	while(toRemove.next != null) {
    		toRemove = toRemove.next;
    	}
    	return toRemove.previus.next = null;   	
    }
     public Node1 removeFirst() {
    	if(isEmpty()) {
    		throw new NoSuchElementException();
    	}
    	Node1 temp = start;
    	if (start == end) {
    		end = null;
     } else {
    	 start.next.previus = null;
     }
    	start = start.next;
    	temp.next = null;
    			return temp;
		}
		public boolean isEmpty() {
			return false;
		}
	 public static void main(String[] args) {
		DoubleLinkedList s = new DoubleLinkedList();
		s.addFirst(20);
		s.addFirst(202);
		s.addFirst(30);
		s.addLast(40);
		s.removeFirst()	;
		s.removeLast();
		s.addFirst(40);
		
		System.out.println(s);
		
	}
}
	


    
        
    
    
    	
    	
    
    	 
     
