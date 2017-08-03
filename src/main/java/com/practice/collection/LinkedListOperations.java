package com.practice.collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOperations {
	
	public void removeDupesUsingSet(LinkedList<Integer> input) {
		HashSet<Integer> temp = new HashSet<Integer>();
		ListIterator<Integer> iterator = input.listIterator();
		while(iterator.hasNext()) {
			Integer current = iterator.next();
			if(temp.contains(current)) {
				iterator.remove();
			} else {
				temp.add(current);
			}
		}
	}

}
