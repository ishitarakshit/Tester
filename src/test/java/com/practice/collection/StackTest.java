package com.practice.collection;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

public class StackTest {
	
	private static final int VALUE1 = 10;
	private static final int VALUE2 = 20;

	@Test
	public void testIsEmpty() {
		Stack stack = new Stack();
		assertTrue(stack.isEmpty());
	}
	
	@Test(expected = EmptyStackException.class)
	public void testPopEmptyStack() {
		Stack stack = new Stack();
		stack.pop();
	}
	

	@Test
	public void testPush() {
		Stack stack = new Stack();
		stack.push(VALUE1);
		stack.push(VALUE2);
		assertEquals(VALUE2, stack.peek());
	}
	
	@Test
	public void testPop() {
		Stack stack = new Stack();
		stack.push(VALUE1);
		stack.push(VALUE2);
		stack.pop();
		assertEquals(VALUE1, stack.peek());
	}
	
	@Test(expected = EmptyStackException.class)
	public void testPeekEmptyStack() {
		Stack stack = new Stack();
		stack.push(VALUE1);
		stack.push(VALUE2);
		stack.pop();
		stack.pop();
		stack.peek();
	}
}
