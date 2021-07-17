package Scrabble;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Dictionary {
	File f;
	int wordsCounter = 0;
	HashTable ht;
	
	public static void main(String[] args) throws FileNotFoundException {
		Dictionary d = new Dictionary();
	}
	
	public Dictionary() throws FileNotFoundException {
	f = new File("src\\Scrabble\\dictwords.txt");
	Scanner myReader = new Scanner(f);
	ht = new HashTable(100000007);
	while(myReader.hasNextLine())
		{
		String data = myReader.nextLine();
		wordsCounter += 1;
		//System.out.println(data);
		put(data);
		}
	myReader.close();
	System.out.println("There are " + wordsCounter + " words stored in the list.");
	System.out.println(Arrays.toString( lookup("Actress")));
	}
	
	public String[] longestChain() {
		String[] returnString = {"Hallo", "Du da!"};
		return returnString;
	}
	
	public void put (String input) {
		ht.put(getHashValue(input), input);
	}
	
	public String[] lookup (String input) {
		int key = getHashValue (input);
		String[] result = ht.get(key);
		return result;
	}
		
	public static int getHashValue (String key) {
		//wenn die Normalisierungsmethode bereits geschrieben ist, 
		// kann diese gelöscht werden
		char[] letters = key.toUpperCase().toCharArray();
		Arrays.sort(letters);
		
		
		// converts key in int -> normalizes the value of the chars
		int hashValue = 0;
		for (int i =0; i < letters.length; i++) {
			// 31 is prime number -> https://horstmann.com/htw/2021/info2/day17/#(11)
			hashValue = 31 * hashValue + letters[i];
		}
		
		return hashValue;
	}

}
