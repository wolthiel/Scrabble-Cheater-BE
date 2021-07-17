package Scrabble;

import java.util.*;

public class HashTable {
	LinkedList<String>[] hm;
	int size;
	public HashTable(int numberOfKeys) {
		size = numberOfKeys;
		hm = new LinkedList[size];
	}
	
	public void put(int key, String object) {
		if (hm[index(key)] != null) {
			searchList(index(key), object);
		}
		else {
			createEntry(index(key),object);
		}
	}
	
	public String[] get(Integer key) {
		LinkedList<String> list = hm[index(key)];
		String[] returnArray = (String[]) list.toArray();
		return returnArray;
	}
	
	public String[] getLongestList() {
		int superkey = 0;
		int superlength = 0;
		for (int i = 0; i < size; i++) {
			if (hm[i].size() > superlength) {
				superkey = i;
				superlength = hm[i].size();
			}
		};
		return get(superkey);
	}
	
	private void searchList(int key, String object) {
		LinkedList<String> list = hm[key];
		if (!list.contains(object)) {
			list.addLast(object);
			}
		hm[key] = list; 
		}
	
	private void createEntry(int key, String object) {
		LinkedList<String> list = new LinkedList<String>();
		list.add(object);
		hm[key] = list;
	}
	
	private int index(int key) {
		int result = Math.abs(key) % size;
		return result;
	}
}

