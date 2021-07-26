package JavaBasics1;

import java.util.HashMap;

public class CharOccuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=new String("karthik abcdef");
		char[] characters= input.toCharArray();
		
		//int[] input= {4,5,5,5,6,3,9};
		HashMap<Character,Integer> charOccurance = new HashMap<Character,Integer>();
		//HashMap<Integer,Integer> charOccurance = new HashMap<Integer,Integer>();

		
		
		for(char character: characters) {
			
			if (charOccurance.containsKey(character) ) {
				charOccurance.put(character, charOccurance.get(character)+1);
			}
			else
				charOccurance.put(character, 1);
				
				
		}
		
		System.out.println(charOccurance);
		
	}

}
