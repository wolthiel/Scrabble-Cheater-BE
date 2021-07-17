package Scrabble;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class ScrabbleCheater {
	public static void main(String[] args) throws FileNotFoundException {
		String[] names = parseWords();
		Dictionary dictionary = new Dictionary();
		for (String name : names ) {
			dictionary.put(name);
		}
		
		System.out.println(Arrays.toString( dictionary.lookup("Actress")));
		System.out.println("The longest chain is "+ Arrays.toString( dictionary.longestChain()));
		System.out.println("It's length is "+ dictionary.longestChain().length );
//		System.out.println(dictionary.getPermutation("adeelrt"));
//		System.out.println(dictionary.longestChain());
//		System.out.println(dictionary.longestChain().length);
	}
	
	private static String[] parseWords() {
		String[] string = {"Albert", "Bernd"};
		return string;
	}

}