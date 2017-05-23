package com.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxOccurrenceOfLetterTest {
	
	MaxOccurrenceOfLetter mol = new MaxOccurrenceOfLetter();
	public static final String ALL_LOWERCASE = "aaaabbbrrrrtttaaa";
	public static final String ALL_UPPERCASE = "BBBCCCCDDCCAA";
	public static final String LOWER_UPPER = "XXXwwwwRRRxxxX";

	@Test
	public void testFindWithoutSorting() {
		assertEquals('a', mol.findWithoutSorting(ALL_LOWERCASE));
		assertEquals('C', mol.findWithoutSorting(ALL_UPPERCASE));
		assertEquals('w', mol.findWithoutSorting(LOWER_UPPER));
	}
	
	@Test
	public void testSortAndFind() {
		assertEquals('a', mol.sortAndFind(ALL_LOWERCASE));
		assertEquals('C', mol.sortAndFind(ALL_UPPERCASE));
		assertEquals('X', mol.sortAndFind(LOWER_UPPER));
	}

}
