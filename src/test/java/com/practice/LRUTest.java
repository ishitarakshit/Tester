package com.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class LRUTest {
	
	private static final String KEY1 = "A";
	private static final String KEY2 = "B";
	private static final String KEY3 = "C";
	private static final String KEY4 = "D";
	private static final int VALUE1 = 100;
	private static final int VALUE2 = 200;
	private static final int VALUE3 = 300;
	private static final int VALUE4 = 400;
	private static final int CAPACITY = 3;

	@Test
	public void testCacheWhenEmpty() {
		LRU lru = new LRU(CAPACITY);
		lru.insert(KEY1, VALUE1);
		lru.insert(KEY2, VALUE2);
		assertEquals(VALUE1, lru.getVal(KEY1));
		assertEquals(VALUE2, lru.getVal(KEY2));
	}
	
	@Test
	public void testCacheWhenFull() {
		LRU lru = new LRU(CAPACITY);
		lru.insert(KEY1, VALUE1);
		lru.insert(KEY2, VALUE2);
		lru.insert(KEY3, VALUE3);
		lru.insert(KEY4, VALUE4);
		assertEquals(VALUE4, lru.getVal(KEY4));
		assertEquals(VALUE3, lru.getVal(KEY3));
		assertEquals(VALUE2, lru.getVal(KEY2));
		assertEquals(-1, lru.getVal(KEY1));
	}

}
