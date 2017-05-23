package com.practice;

import java.util.Arrays;
import java.util.Stack;

public class CheckBrackets {
	
	public int hasBalancedBrackets(String input) {
		Stack<Character> stack = new Stack<>(); 
		if (input.isEmpty()) return 1;
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (isOpeningBrace(c)) {
				stack.push(c);
				continue;
			}
			if (isClosingBrace(c)) {
				if(stack.isEmpty()) {
					return 0;
				}
				char last = stack.pop();
				if (c == getMatchingBrace(last)) {
					continue;
				} else {
					return 0;
				}
			}
		}
		return stack.isEmpty() ? 1 : 0;
	}
	
	private char getMatchingBrace(char c) {
		if (c == '{') return '}';
		else if (c == '(') return ')';
		else if (c == '[') return ']';
		else if (c == '<') return '>';
		else return ' ';
		
	}
	
	private boolean isClosingBrace(char c) {
		return ')' == c || '}' == c || ']' == c || '>' == c;
	}


	boolean isOpeningBrace(char c) {
		return '(' == c || '{' == c || '[' == c || '<' == c;
	}
	
	public static void main(String[] args) {
		CheckBrackets cb = new CheckBrackets();
		System.out.println(cb.hasBalancedBrackets("[]{}()<>"));
		System.out.println(cb.hasBalancedBrackets("(h[e{10}()()("));
		System.out.println(cb.hasBalancedBrackets("{{aa}asdf}a[{}]"));
		System.out.println(cb.hasBalancedBrackets("}{aa}asdf}a[{}]"));
	}
	
//	public boolean isBracketPairs(String str) {
//		Map<Character,Character> brackets = new HashMap<Character,Character>();
//		brackets.put('(',')');
//	}

}
