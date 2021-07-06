package Scrabble;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Dictionary {
	public Dictionary() throws FileNotFoundException {
	File f = new File("");
	Scanner myReader = new Scanner(f);
	while(myReader.hasNextLine())
		{
		String data = myReader.nextLine();
		System.out.println(data);
		}
	myReader.close();
	}
	
	public String getPermutation(String input) {
		return "hallo";
	}
	
	public String[] longestChain() {
		String[] returnString = {"Hallo", "Du da!"};
		return returnString;
	}
	

}