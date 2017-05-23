package com.practice;

public class BinarySearchTree {

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	public int calculateDistance(int[] values, int n, int node1, int node2) {
		//Node root = createBST(values, n);
		Node root = createBST(values, n);
		Node lca = findLca(root, node1, node2);
		System.out.println("lca : " + lca.data);
		System.out.println("lca left : " + lca.left.data);
		System.out.println("lca right : " + lca.right.data);
		System.out.println("distance between lca and node 1: " + calculateDistance(lca, node1));
		System.out.println("distance between lca and node 2: " + calculateDistance(lca, node2));
		return (calculateDistance(lca, node1) + calculateDistance(lca, node2));
	}

	private int calculateDistance(Node node, int val) {
		if (node.data == val) {
			return 0;
		}

		return val > node.data ? 1 + calculateDistance(node.right, val) : 1 + calculateDistance(node.left, val);
	}

	private Node findLca(Node node, int x, int y) {
		if (x > node.data && y > node.data) {
			return findLca(node.right, x, y);
		} else if (x < node.data && y < node.data) {
			return findLca(node.left, x, y);
		} else {
			return node;
		}

	}

	public Node createBST(int[] values, int n) {
		if (n == 0) {
			return null;
		}
		Node root = new Node(values[0]);
		for (int i = 1; i < values.length; i++) {
			addNode(root, values[i]);
		}
		return root;
	}

	public void addNode(Node node, int val) {
		if (val > node.data) {
			if (node.right == null) {
				node.right = new Node(val);
			} else {
				addNode(node.right, val);
			}
		} else {
			if (node.left == null) {
				node.left = new Node(val);
			} else {
				addNode(node.left, val);
			}
		}
	}
}
