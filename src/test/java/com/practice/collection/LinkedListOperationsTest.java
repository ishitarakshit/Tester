package com.practice.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;
import org.junit.Test;

public class LinkedListOperationsTest {
	
	LinkedListOperations ops = new LinkedListOperations();

	@Test
	public void testRemoveDupesUsingSet() {
		LinkedList<Integer> input = new LinkedList<>(Arrays.asList(new Integer[]{23,56,23,90,100,100,90}));
		ops.removeDupesUsingSet(input);
		assertEquals(4, input.size());
		assertTrue(input.containsAll(Arrays.asList(new Integer[]{23,56,90,100})));
	}

}
