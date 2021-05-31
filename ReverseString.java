package HomeWork;

public class ReverseString {
public  static void main (String[] args) {
	String r = reverse ("ragan");
	
}
	
 public static String reverse (String s) {
	 char[] letters = new char[s.length()];
	 
	 
	 for(int i = s.length() - 1; i >= 0; i--) {
		 System.out.print(s.charAt(i) +  " ");
	 }
	 return s;
 }
 
}