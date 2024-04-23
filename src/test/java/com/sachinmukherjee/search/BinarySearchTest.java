package com.sachinmukherjee.search;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

	private BinarySearch binarySearch;

	@BeforeEach
	public void initialize() {
		binarySearch = new BinarySearch();
	}
	
	@Test
	public void testSearch() {
		final int[] collection = { 11,22,45,67,85,99,101,105,110,150,166 };
		final int search = 99;
		assertTrue(binarySearch.search(collection, search));
		
		final int search1 = 5;
		assertFalse(binarySearch.search(collection, search1));
	}
}
