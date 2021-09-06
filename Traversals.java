package Homeworks;
 
public class Traversals {
	
	public static void main(String[] args) {
		Nodes data = createData()	;
	InorderTraversal(data);
	System.out.println();
	postorderTraversal(data);
	System.out.println();
	preorderTraversal(data);
	}

	public static void preorderTraversal(Nodes s) {
		  if(s == null)
		  	return;
		  System.out.println(s.value+" ");
		  preorderTraversal(s.leftSide);
		  preorderTraversal(s.rightSide);
	}
	public static void postorderTraversal(Nodes s) {
		 if(s == null)
		  	return;
		  postorderTraversal(s.leftSide);
		  postorderTraversal(s.rightSide);
		  System.out.println(s.value+" ");
	}
	public static void InorderTraversal(Nodes s) {
		if(s == null )
			return ;
		InorderTraversal(s.leftSide);
		System.out.println(s.value+" ");
		InorderTraversal(s.rightSide);
	}
	@Override
	public String toString() {
	   System.out.println("{");
		return super.toString();
	}
	public static Nodes createData() {
	
		Nodes a = new Nodes( "a");
		Nodes b = new Nodes("b");
		Nodes c = new Nodes("c");
		Nodes d = new Nodes("d");
		Nodes e = new Nodes("e");
		Nodes f = new Nodes("f");
		Nodes g = new Nodes( "g");
		
		a.leftSide   =b;
		a.rightSide   =g;
		b.leftSide   =c;
		b.rightSide =d;
		c.leftSide   =e;
		e.rightSide =f;
		
		return a;
	}
	
	}
	



