package Scrabble;

import java.io.FileNotFoundException;

public class ScrabbleCheater {
	public static void main(String[] args) {
		String[] names = parseWords();
		Dictionary dictionary = new Dictionary(700);
		for (String name : names ) {
			dictionary.put(name);
		}
		
		System.out.println(dictionary.getPermutation("adeelrt"));
		System.out.println(dictionary.longestChain());
		System.out.println(dictionary.longestChain());
		System.out.println(dictionary.longestChain().size());
	}
	
	private static String[] parseWords() {
		String[] string = {"Albert", "Bernd"};
		return string;
	}

}
