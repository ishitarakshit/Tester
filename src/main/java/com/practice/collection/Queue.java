package com.practice.collection;

import java.util.NoSuchElementException;

public class Queue {

	class QueueNode {
		int data;
		QueueNode next;

		public QueueNode(int data) {
			this.data = data;
		}
	}

	private QueueNode first;
	private QueueNode last;

	public boolean isEmpty() {
		return first == null;
	}

	public void add(int item) {
		QueueNode newNode = new QueueNode(item);
		if (last != null) {
			last.next = newNode;
		}
		last = newNode;
		if (first == null) {
			first = last;
		}
	}

	public int remove() {
		if (isEmpty()) throw new NoSuchElementException();
		int item = first.data;
		first = first.next;
		if (first == null) {
			last = null;
		}
		return item;
	}

	public int peek() {
		if (isEmpty()) throw new NoSuchElementException();
		return first.data;
	}

}
