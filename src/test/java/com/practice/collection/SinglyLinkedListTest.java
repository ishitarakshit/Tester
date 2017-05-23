package com.practice.collection;

import static org.junit.Assert.*;

import org.junit.Test;

public class SinglyLinkedListTest {

	private static final int VALUE1 = 10;
	private static final int VALUE2 = 20;
	private static final int VALUE3 = 45;

	@Test
	public void testAddToTail() {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.addToTail(VALUE1);
		sl.addToTail(VALUE2);
		sl.addToTail(VALUE3);
		assertEquals(3, sl.size());
		assertEquals(VALUE1, sl.getHead().data);
		assertEquals(VALUE2, sl.getHead().next.data);
		assertEquals(VALUE3, sl.getTail().data);
	}
	
	@Test
	public void testDelete_InnerNode() {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.addToTail(VALUE1);
		sl.addToTail(VALUE2);
		sl.addToTail(VALUE3);
		sl.deleteNode(VALUE2);
		assertEquals(2, sl.size());
		assertEquals(VALUE1, sl.getHead().data);
		assertEquals(VALUE3, sl.getTail().data);
	}
	
	@Test
	public void testDelete_Head() {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.addToTail(VALUE1);
		sl.addToTail(VALUE2);
		sl.addToTail(VALUE3);
		sl.deleteNode(VALUE1);
		assertEquals(2, sl.size());
		assertEquals(VALUE2, sl.getHead().data);
		assertEquals(VALUE3, sl.getTail().data);
	}
	
	@Test
	public void testDelete_Tail() {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.addToTail(VALUE1);
		sl.addToTail(VALUE2);
		sl.addToTail(VALUE3);
		sl.deleteNode(VALUE3);
		assertEquals(2, sl.size());
		assertEquals(VALUE1, sl.getHead().data);
		assertEquals(VALUE2, sl.getTail().data);
	}
	
	@Test
	public void testAddBeforeHead() {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.addBeforeHead(VALUE1);
		sl.addBeforeHead(VALUE2);
		sl.addBeforeHead(VALUE3);
		assertEquals(3, sl.size());
		assertEquals(VALUE3, sl.getHead().data);
		assertEquals(VALUE1, sl.getTail().data);
	}

}
