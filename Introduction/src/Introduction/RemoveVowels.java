package Introduction;

public class RemoveVowels {
	// Removing vowels from string without replace function 
	
	
	public void removeVowelsFromString() {
		String input = new String("Stay home, stay safe and wear mask in this pandemic");

		char[] stream = input.toCharArray(); // changing to char array

		for (int i = 0; i < stream.length; i++) {

			if (stream[i] == 'a' || stream[i] == 'e' || stream[i] == 'i' || stream[i] == 'o' || stream[i] == 'u') // verifying
																													// vowels
				stream[i] = ' '; // if vowel found replacing vowels with 'Space'
		}
		System.out.println(stream);
	}

	public static void main(String[] args) {

		RemoveVowels p = new RemoveVowels();
		p.removeVowelsFromString();

	}

}
