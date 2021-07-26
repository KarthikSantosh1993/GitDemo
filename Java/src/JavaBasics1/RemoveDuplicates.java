package JavaBasics1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names= "karthik";
		char[] array= names.toCharArray();
		
		Set<Character> uniqueChars = new HashSet<>();  //just removes duplicates but doesn't sort in alphabetical order
		Set<Character> s= new TreeSet<>();   //for alphabetical order
		
		for (char c:array) {
			System.out.print(c);
			s.add(c);
			uniqueChars.add(c);		
		}
		
		System.out.println(s);
		System.out.println(uniqueChars);
		
		List<String>  name= new ArrayList<String>();
		
		name.add("karthik");
		name.add("cbjhvbjv");
		name.add("cbjhvbjv");
		name.add("asdf");
		name.add("abcde");
		Set<String> uniqueNames= new HashSet<String>(name);
		Set<String> alphaOrder= new TreeSet<String>(name);
		System.out.println(name);
		System.out.println(uniqueNames);
		System.out.println(alphaOrder);
		
	}

}
