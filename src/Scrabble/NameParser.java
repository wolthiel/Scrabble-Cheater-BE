package Scrabble;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class NameParser {
	// import a file with names for different places/things to later use in Graph
	public static HashSet<String> parseNames(String path) throws FileNotFoundException {
		HashSet<String> names = new HashSet<String>();
		File file = new File(path);
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			names.add(sc.nextLine());
		}
		sc.close();
		return names;
	}
}
