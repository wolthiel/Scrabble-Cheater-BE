package Scrabble;

import java.util.*;

public class HashTable {
	Hashtable<Integer, LinkedList> hm ;
	public HashTable() {
		Hashtable<Integer, LinkedList> hm = new Hashtable<Integer, LinkedList>();
	}
	
	public void put(int key, String object) {
		if (hm.containsKey(key)) {
			searchList(key, object);
		}
		else {
			createEntry(key,object);
		}
	}
	
	public String[] get(Integer key) {
		LinkedList<String> list = hm.get(key);
		String[] returnArray = (String[]) list.toArray();
		return returnArray;
	}
	
	public String[] getLongestList() {
		int[] superkey = {0};
		int[] superlength = {0};
		hm.forEach((k, v) -> {
			if (v.size() > superlength[0]) {
				superkey[0] = k;
				superlength[0] = v.size();
			}
		});
		return get(superkey[0]);
	}
	
	private void searchList(int key, String object) {
		LinkedList<String> list = hm.get(key);
		if (!list.contains(object)) {
			list.addLast(object);
		}
		hm.put(key,list);
	}
	
	private void createEntry(int key, String object) {
		LinkedList<String> list = new LinkedList<String>();
		list.add(object);
		hm.put(key, list);
	}
}

