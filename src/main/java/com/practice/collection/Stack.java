package com.practice.collection;

import java.util.EmptyStackException;

public class Stack {
	class StackNode {
		int data;
		StackNode next;
		public StackNode(int data) {
			this.data = data;
		}
	}

	private StackNode top;
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int pop() {
		if(isEmpty()) throw new EmptyStackException();
		int item = top.data;
		top = top.next;
		return item;
	}
	
	public int peek() {
		if(isEmpty()) throw new EmptyStackException();
		return top.data;
	}
	
	public void push(int item) {
		StackNode newNode = new StackNode(item);
		newNode.next = top;
		top = newNode;
	}
}
