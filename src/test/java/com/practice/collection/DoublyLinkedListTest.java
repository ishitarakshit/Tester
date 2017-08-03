package com.practice.collection;

import static org.junit.Assert.*;

import org.junit.Test;

import com.practice.collection.DoublyLinkedList.Node;

public class DoublyLinkedListTest {
	
	private static final int VALUE1 = 100;
	private static final int VALUE2 = 200;
	private static final int VALUE3 = 300;


	@Test
	public void testAddFirst() {
		DoublyLinkedList dl = new DoublyLinkedList();
		Node node1 = new Node(VALUE1);
		Node node2 = new Node(VALUE2);
		dl.addFirst(node1);
		dl.addFirst(node2);
		assertEquals(2, dl.getSize());
		assertEquals(VALUE2, dl.getHead().data);
		assertEquals(VALUE1, dl.getTail().data);
	}
	
	@Test
	public void testRemoveNode() {
		DoublyLinkedList dl = new DoublyLinkedList();
		Node node1 = new Node(VALUE1);
		Node node2 = new Node(VALUE2);
		Node node3 = new Node(VALUE3);
		dl.addFirst(node1);
		dl.addFirst(node2);
		dl.addFirst(node3);
		dl.removeNode(node2);
		assertEquals(2, dl.getSize());
		assertEquals(VALUE3, dl.getHead().data);
		assertEquals(VALUE1, dl.getTail().data);
	}
	
	@Test
	public void testRemoveLast() {
		DoublyLinkedList dl = new DoublyLinkedList();
		Node node1 = new Node(VALUE1);
		Node node2 = new Node(VALUE2);
		Node node3 = new Node(VALUE3);
		dl.addFirst(node1);
		dl.addFirst(node2);
		dl.addFirst(node3);
		dl.removeLast();
		assertEquals(2, dl.getSize());
		assertEquals(VALUE3, dl.getHead().data);
		assertEquals(VALUE2, dl.getTail().data);
	}

}
