package Homeworks;

import java.util.Scanner;

public class Palindroms {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in) ;
		
		System.out.print("Enter the String : ");
		String inputString = scan.nextLine();
		System.out.println("Longest Palindrome is : "+ Palindroms.LongestPalindrome(inputString));
		scan.close();

	}
	
	public static String LongestPalindrome (String inputString) {
		
		//validation
		if(inputString.isEmpty())
return " Enter proper String";
		if(inputString.length() == 1)
			return inputString;
		
		String longest = inputString.substring(0,1);
		
		for(int i = 0; i < inputString.length(); i++) {
			// odd checking
			String temp = checktheEquality(inputString,i,i);
			if(longest.length()	< temp.length()) {
				longest = temp;
			}
			
			// even checking 
			temp = checktheEquality(inputString, i, i+1);
			
			if(longest.length() < temp.length()) {
				longest = temp;
			}
			
		}
		return  longest;
			
	}
	public static String checktheEquality(String inputString , int begin , int end	) {
		
		while(begin >= 0 && end <= inputString.length() - 1 && inputString.charAt(begin) == inputString.charAt(end)) {
			
			begin --;
			end++;
		}
		
		
		
		return inputString.substring(begin+1 , end) ;
		
	}
}
