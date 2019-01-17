package com.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefixTest {
	LongestCommonPrefix lcp = new LongestCommonPrefix();
	
	@Test
	public void testTwoLetterPrefix() {
		String[] testArr = {"flower","flow","flight"};
		String prefix = lcp.longestCommonPrefix(testArr);
		assertEquals("fl", prefix);
	}
	
	@Test
	public void testNoPrefix() {
		String[] testArr = {"dog","racecar","car"};
		String prefix = lcp.longestCommonPrefix(testArr);
		assertEquals("", prefix);
	}
	
	@Test
	public void testOneStringArray() {
		String[] testArr = {"a"};
		String prefix = lcp.longestCommonPrefix(testArr);
		assertEquals("a", prefix);
	}
	
	@Test
	public void testOneCharStringsArray() {
		String[] testArr = {"a", "a"};
		String prefix = lcp.longestCommonPrefix(testArr);
		assertEquals("a", prefix);
	}
	
	@Test
	public void testZeroLengthArray() {
		String[] testArr = {};
		String prefix = lcp.longestCommonPrefix(testArr);
		assertEquals("", prefix);
	}
	
	@Test
	public void testBlankStringOnlyArray() {
		String[] testArr = {""};
		String prefix = lcp.longestCommonPrefix(testArr);
		assertEquals("", prefix);
	}
	
	@Test
	public void testArraywithOneBlankStringArray() {
		String[] testArr = {"flower",""};
		String prefix = lcp.longestCommonPrefix(testArr);
		assertEquals("", prefix);
	}

}
