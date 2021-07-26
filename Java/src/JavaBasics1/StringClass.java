package JavaBasics1;

import java.util.HashMap;

public class StringClass {
	// String is an inbuilt class in Java not collection of characters
	/*ways to define string 
		1. String literal                ==>  String a="Hello"
		2. Creating an object for string ==>  String a = new String("Hello");
	*/
	
	public void palindrome() {
		String word= new String("madam");
		String reversedWord= new String("");
		
		for (int i=word.length()-1; i>=0; i--){
			reversedWord= reversedWord + word.charAt(i);
		}
		
		System.out.println("Given string is: " +word);
		System.out.println("Reversed string is: " +reversedWord);
		
		
		if(word.equals(reversedWord)) {
			System.out.println(word +" is a pallindrome");
		}
		else 
			System.out.println(word +" is not a pallindrome");
	}
	
	
	
	public static void main(String[] args) {
		
	StringClass reverse = new StringClass();
		reverse.palindrome(); 
	}
	
	

}
