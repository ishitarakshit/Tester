package com.practice.collection;

import java.util.LinkedList;

public class CustomHashMap {

	int length = 10;
	LinkedList<Entry>[] arr = new LinkedList[length];

	public int calculateHash(String key) {
		if (key != null) {
			return key.hashCode();
		}
		return 0;
	}

	public int calculateArrayIndex(String key) {
		return (calculateHash(key) % length);
	}

	public LinkedList<Entry>[] getArray() {
		return arr;
	}

	public void put(String key, String value) {
		int index = calculateArrayIndex(key);
		Entry entry = new Entry(key, value);
		if (arr[index] == null) {
			arr[index] = new LinkedList<Entry>();
		}
		if (key == null && !arr[index].isEmpty()) {
			arr[index].clear();
		}
		arr[index].add(entry);
	}

	public String get(String key) {
		int index = calculateArrayIndex(key);
		LinkedList<Entry> entries = arr[index];
		for (Entry entry : entries) {
			if (entry.getKey() != null) {
				if (entry.getKey().equals(key)) {
					return entry.getValue();
				}
			} else {
				return entry.getValue();
			}
		}
		return null;
	}

}
