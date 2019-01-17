package com.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.practice.ShortestDistanceBFS.Node;

public class ShortestDistanceTest {
	static ShortestDistanceBFS bfs = new ShortestDistanceBFS();
	
	static Node node1 = bfs.new Node(1);
	static Node node5 = bfs.new Node(5);
	static Node node7 = bfs.new Node(7);
	static Node node3 = bfs.new Node(3);
	static Node node4 = bfs.new Node(4);
	static Node node10 = bfs.new Node(10);
	static Node node15 = bfs.new Node(15);
	static Node node6 = bfs.new Node(6);
	static Node node20 = bfs.new Node(20);
	static Node node11 = bfs.new Node(11);
	
	@BeforeClass
	public static void setUp() {
	/*	
	   1	5              7         
	 	\  /  \  	     /
		3 		4 ---  10 --- 15
	   / 	    |    	   	  
	  6        20 --- 11 	
	*/
		
		node1.addNeighbours(node3);
		node5.addNeighbours(node3, node4);
		node7.addNeighbours(node10);
		node3.addNeighbours(node6, node1, node5);
		node4.addNeighbours(node5, node10, node20);
		node10.addNeighbours(node4, node7, node15);
		node15.addNeighbours(node10);
		node6.addNeighbours(node3);
		node20.addNeighbours(node4, node11);
		node11.addNeighbours(node20);
	}
	
	@Test
	public void testShortestDist1() {
		int shortestDist = bfs.shortestDistance(10, node5, node6);
		assertEquals(2, shortestDist);
	}
	
	@Test
	public void testShortestDist2() {
		int shortestDist = bfs.shortestDistance(10, node7, node20);
		assertEquals(3, shortestDist);
	}
	
	@Test
	public void testShortestDist2EndVertices() {
		int shortestDist = bfs.shortestDistance(10, node6, node15);
		assertEquals(5, shortestDist);
	}
	
	
	@Test
	public void testShortestDistance2NeighboursOfSameNode() {
		int shortestDist = bfs.shortestDistance(10, node3, node4);
		assertEquals(2, shortestDist);
	}

}
