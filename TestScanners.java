package Homeworks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestScanners {
	
	
public static void main(String[] args) throws IOException {
 // Read character by character and printing how many times was enter
	Scanner s = new Scanner(System.in);
	String data = s.next();
	System.out.println("enter Character");
	char ch=(char) System.in.read()	;

int noOfTimesChWasFound = 0;

for (int i = 0; i<data.length(); i++)
{
	char c = data.charAt(i);
	if(c==ch)
{
		noOfTimesChWasFound++;
	}
}

System.out.println(noOfTimesChWasFound);
}
{
	//  PALINDROME
	Scanner scan = new Scanner(System.in);
	System.out.println("input a String");
	String reverse = "";
  String a = scan.next();
for(int i = a.length() -1; i>= 0; i--) {
	 reverse  += a.charAt(i);
	System.out.println(reverse);
      }
  boolean palindrome = true;
   for(int i = 0 ; i < a.length(); i++) {
  	if( a.charAt(i) != reverse.charAt(i)) {
		palindrome = false;
 	}
   }
   if (palindrome) {
	 System.out.println("PALINDROME!");
   } else
 System.out.println(" this is not a palindrome!");
 }


 // Reverse Number
Scanner code = new Scanner(System.in);
int original = code.nextInt();
int reverse = 0;
int remainder;
)


while(original != 0) {
 	 remainder = original % 10;
	 reverse = reverse * 10 + remainder;
	 original = original / 10;
    
 }
System.out.print("reverse of the number is : " + reverse );

//READ MULTIPLE TEXT
Scanner write = new Scanner(System.in);
String str = "";
List<Integer> numbers = new ArrayList<>();
private int i;
write.useDelimiter("\\t");
while(true) {
	System.out.print("type done to finish or write someting else4 : ");
	str = write.nextLine().trim();
  if (str.equalsIgnoreCase("done")) {
    break;
   
  }
  System.out.println("please enter a single word");
  write.next();
  String s = write.nextLine()	;
  int count = 1;
  for (int i = 0; i < s.length()-1; i++) ;
	if( (s.charAt(i) ==' ' ) && (s.charAt(i+1)!=' '))
  {
  	count++;
  }
	System.out.println("Number of words writenn : " + 	count);
}

}

}








				
  











