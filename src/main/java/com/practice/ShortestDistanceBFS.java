package com.practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ShortestDistanceBFS {
	
	class Node {
		int data;
		List<Node> neighbours;

		public Node(int data) {
			this.data = data;
			this.neighbours = new ArrayList<>();
		}
		
		public void addNeighbours(Node... nodes) {
			neighbours.addAll(Arrays.asList(nodes));
		}
	}
	 
	
	int shortestDistance(int numberOfVertices, Node source, Node target) {
		Queue<Node> queue = new ArrayDeque<>(numberOfVertices);
		Map<Node, Boolean> visited = new HashMap<>();
		Map<Node, Node> prev = new HashMap<>();
		Node current = source;
		queue.add(current);
		visited.put(current, true);
		while(!queue.isEmpty()) {
			current=queue.remove();
			if (current.equals(target)){
	            break;
	        } else {
				for(Node neighbour:current.neighbours) {
					if(!visited.containsKey(neighbour)) {
						queue.add(neighbour);
						visited.put(neighbour, true);
						prev.put(neighbour, current);
					}
				}
			}
		}
		prev.forEach((k, v) -> System.out.println((k.data + ":" + v.data)));
		
		int distance=0;
		for(Node node = target; node != null && node != source ; node = prev.get(node)) {
			distance++;
	    }
	   return distance;
	}
}
