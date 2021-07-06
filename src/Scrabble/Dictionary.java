package Scrabble;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Dictionary {
	File f;
	int wordsCounter = 0;
	
	public Dictionary() throws FileNotFoundException {
	f = new File("");
	Scanner myReader = new Scanner(f);
	while(myReader.hasNextLine())
		{
		String data = myReader.nextLine();
		wordsCounter += 1;
		System.out.println(data);
		}
	myReader.close();
	System.out.println("There are " + wordsCounter + " words stored in the list.");
	}
	
	public String getPermutation(String input) {
		return "hallo";
	}
	
	public String[] longestChain() {
		String[] returnString = {"Hallo", "Du da!"};
		return returnString;
	}
	
	public void put (String input) {
		
	}

}