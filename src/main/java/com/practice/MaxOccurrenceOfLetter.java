package com.practice;

import java.util.Arrays;

public class MaxOccurrenceOfLetter {
	
	public char findWithoutSorting(String input) {
		int maxCount = 0;
		char maxChar = 0;
		int[] countArr = new int[128];
		for(int i = 0; i < input.length(); i++) {
			int val = input.charAt(i);
			countArr[val] ++;
			if(countArr[val] > maxCount) {
				maxCount = countArr[val];
				maxChar = input.charAt(i);
			}
		}
		System.out.println("Result - char : " + maxChar+" count : "+maxCount);
		return maxChar;
		
	}

	public char sortAndFind(String input) {
		int maxCount = 0;
		char maxChar = 0;
		int currCount = 0;
		char[] content = input.toCharArray();
		Arrays.sort(content);
		for(int i=0; i < input.length() - 1; i++) {
			if(content[i] == content[i+1]) {
				currCount++;
			} else {
				if(currCount > maxCount) {
					maxCount = currCount;
					maxChar = content[i];
					currCount = 0;
				}
			}
			
		}
		System.out.println("Result - char : " + maxChar+" count : "+maxCount);
		return maxChar;
	}
}
