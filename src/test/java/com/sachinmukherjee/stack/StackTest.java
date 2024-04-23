package com.sachinmukherjee.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {

	private Stack stack;

	@BeforeEach
	public void initialize() {
		stack = new Stack(5);
	}

	@Test
	public void testIsEmpty() {
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void testIsFull() {
		assertFalse(stack.isFull());
	}
	
	@Test
	public void testPush() {
		for(int i=0; i<5; i++) {
			Random random = new Random();
			stack.push(random.nextInt());
		}
			assertTrue(stack.isFull());
	}
	
	@Test
	public void testPop() {
		stack.push(15);
		stack.push(166);
		
		assertEquals(166, stack.pop());
	}
}
