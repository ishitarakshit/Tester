package com.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeTest {

	BinarySearchTree bst = new BinarySearchTree();
	
	@Test
	public void testCalculateDistance() {
		int[] input = {5, 3, 1, 2, 4, 6};
		int distance = bst.calculateDistance(input, 6, 2, 4);
		assertEquals(3, distance);
	}

}
