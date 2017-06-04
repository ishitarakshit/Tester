package com.practice.collection;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class QueueTest {

	private static final int VALUE1 = 10;
	private static final int VALUE2 = 20;
	
	@Test
	public void testIsEmpty() {
		Queue queue = new Queue();
		assertTrue(queue.isEmpty());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testPeekEmptyQueue() {
		Queue queue = new Queue();
		queue.peek();
	}
	
	@Test
	public void testAdd() {
		Queue queue = new Queue();
		queue.add(VALUE1);
		queue.add(VALUE2);
		assertEquals(VALUE1, queue.peek());
	}
	
	@Test
	public void testRemove() {
		Queue queue = new Queue();
		queue.add(VALUE1);
		queue.add(VALUE2);
		int removed = queue.remove();
		assertEquals(VALUE1, removed);
		assertEquals(VALUE2, queue.peek());
	}

}
