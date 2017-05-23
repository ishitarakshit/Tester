package com.practice.collection;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.practice.collection.CustomHashMap;

public class CustomHashMapTest {

	CustomHashMap hm = new CustomHashMap();

	@Test
	public void testPutAndGet() {
		hm = new CustomHashMap();
		hm.put("name", "ping");
		assertEquals("ping", hm.get("name"));
	}
	
	@Test
	public void testKeysAtSameArrayIndex() {
		String key1 = "name";
		String value1 = "sam";
		String key2 = "mane";
		String value2 = "dev";
		hm.put(key1, value1);
		hm.put(key2, value2);
		assertEquals(hm.calculateArrayIndex(key1), hm.calculateArrayIndex(key2));
		int index = hm.calculateArrayIndex(key1);
		assertEquals(2, hm.getArray()[index].size());
		assertEquals(value1, hm.get(key1));
		assertEquals(value2, hm.get(key2));
	}
	
	@Test
	public void putNullKey(){
		String value = "abc";
		hm.put(null, value);
		assertEquals(value, hm.get(null));
	}
	
	@Test
	public void putTwoNullKeys(){
		String value1 = "abc";
		String value2 = "pqr";
		hm.put(null, value1);
		hm.put(null, value2);
		assertEquals(value2, hm.get(null));
	}

}
