package com.practice.collection;

public class DoublyLinkedList {
	public static class Node {
		public int data;
		public Node next;
		public Node prev;

		public Node(int data) {
			this.data = data;
		}
	}

	private int size = 0;
	private Node head;
	private Node tail;

	public int getSize() {
		return this.size;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public void addFirst(Node toAdd) {
		if (size == 0) {
			this.head = toAdd;
			this.tail = toAdd;
		} else {
			this.head.prev = toAdd;
			toAdd.next = this.head;
			this.head = toAdd;
		}
		size++;
	}

	public void removeNode(Node node) {
		if (size == 0) {
			return;
		}
		if (this.head.data == node.data) {
			this.head = head.next;
			head.prev = null;
			size--;
		} else if(this.tail.data == node.data) {
			removeLast();
		}
		else {
			Node current = this.head;
			while (current.next != null) {
				if (current.data == node.data) {
					current.next.prev = current.prev;
					current.prev.next = current.next;
					current = current.next;
				} else {
					current = current.next;
				}
			}
			size--;
		}
	}

	public Node removeLast() {
		Node toRemove = null;
		if (size == 0) {
			toRemove = null;
		} else if (size == 1) {
			toRemove = this.head;
			this.head = head.next;
		} else {
			toRemove = this.tail;
			this.tail = tail.prev;
			this.tail.next = null;
		}
		size--;
		return toRemove;
	}

}
