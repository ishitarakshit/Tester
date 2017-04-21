package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

public class QuickSort {

	private static int findPivot(int start, int end) {
		int pivotIndex = (end - start) / 2;
		return pivotIndex;
	}

	private static List<Integer> partition(List<Integer> input) {
		int start = 0;
		int end = input.size() - 1;
		int pivotIndex = findPivot(start, end);
		int pivot = input.get(pivotIndex);
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		right.add(pivot);
		for (int i = start; i <= end; i++) {
			int currentElement = input.get(i);
			if (currentElement != pivot) {
				if (currentElement < pivot) {
					left.add(currentElement);
				} else {
					right.add(currentElement);
				}
			}
		}
		if (left.size() > 2) {
			left = partition(left);
		}
		if (right.size() > 2) {
			right = partition(right);
		}
		List<Integer> result = ListUtils.union(left, right);
		return result;
	}

	public static void main(String[] args) {
		List<Integer> testArr = Arrays.asList(60, 10, 0, 50, 30, 80, 100);
		if (!testArr.isEmpty()) {
			System.out.println("input: " + testArr);
			System.out.println("sorted: " + partition(testArr));
		} else {
			System.out.println("Input list is empty");
		}

	}
}
