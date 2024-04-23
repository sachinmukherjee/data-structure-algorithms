package com.sachinmukherjee.search;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {

	private LinearSearch linearSearch;

	@BeforeEach
	public void initialize() {
		linearSearch = new LinearSearch();
	}

	@Test
	public void testSeach() {
		final int[] collection = { 50, 100, 12, 99, 123, 567, 13, 45, 67, 89, 99, 44, 23, 34, 90, 213 };
		final int search = 13;
		assertTrue(linearSearch.search(collection, search));
	}
}
