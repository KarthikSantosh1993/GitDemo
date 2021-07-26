package JavaBasics1;

import java.util.HashMap;

public class SgtringClass {
	
	public static void main(String[] args) {
		
		String inputString= new String("hello world");    //creating string 
		
		HashMap<Character, Integer> charOccurance= new HashMap<Character, Integer>();
		
		char[] charStream = inputString.toCharArray() ;
		
		
		for (char c: charStream) {
			
			if(charOccurance.containsKey(c)) {
				charOccurance.put(c, charOccurance.get(c)+1);
			}
			else 
				charOccurance.put(c, 1);
			
			
		}
		
		System.out.println(charOccurance);
		
	
		
		
	}
}
