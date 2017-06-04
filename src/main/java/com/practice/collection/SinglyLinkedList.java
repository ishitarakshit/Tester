package com.practice.collection;

public class SinglyLinkedList {

	private int size = 0;
	private Node head;

	public int size() {
		return size;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		Node current = this.head;
		while (current.next != null) {
			current = current.next;
		}
		return current;
	}
	
	public void addToTail(int data) {
		Node toAdd = new Node(data);
		if (this.size == 0) {
			this.head = toAdd;
		} else {
			Node current = this.head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = toAdd;
		}
		size++;
	}
	
	public void addBeforeHead(int data) {
		Node toAdd = new Node(data);
		if(size == 0) {
			this.head = toAdd;
		} else {
			toAdd.next = this.head;
			this.head = toAdd;
		}
		size++;
	}
	
	public void deleteNode(int data) {
		if (size == 0) { return; }
		
		if (this.head.data == data) {
			this.head = head.next;
			size--;
		} else {
			Node current = this.head;
			while(current.next != null) {
				if(current.next.data == data) {
					current.next = current.next.next;
				} else {
					current = current.next;
				}
			} 
			if(current.data == data) {
				current = null;
			}
			size--;
		}
	}
}
