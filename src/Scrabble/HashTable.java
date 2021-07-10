package Scrabble;

import java.util.*;

public class HashTable {
	Hashtable<String, LinkedList> hm ;
	public HashTable() {
		Hashtable<String, LinkedList> hm = new Hashtable<String, LinkedList>();
	}
	
	public void put(String key, String object) {
		if (hm.containsKey(key)) {
			searchList(key, object);
		}
		else {
			createEntry(key,object);
		}
	}
	
	public String[] get(String key) {
		LinkedList list = hm.get(key);
		String[] returnArray = (String[]) list.toArray();
		return returnArray;
	}
	
	private void searchList(String key, String object) {
		LinkedList list = hm.get(key);
		if (!list.contains(object)) {
			list.addLast(object);
		}
		hm.put(key,list);
	}
	
	private void createEntry(String key, String object) {
		LinkedList list = new LinkedList();
		list.add(object);
		hm.put(key, list);
	}
}
