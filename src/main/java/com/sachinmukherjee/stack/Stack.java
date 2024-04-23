package com.sachinmukherjee.stack;

public class Stack {

	private int[] elements;
	private int size;
	private int pointer = 0;

	public Stack(final int size) {
		this.size = size;
		elements = new int[size];
	}

	public boolean isEmpty() {
		return pointer == 0;
	}

	public boolean isFull() {
		return size == pointer;
	}

	public int push(final int element) {
		if (isFull())
			throw new UnsupportedOperationException("Stack is Full");
		elements[pointer++] = element;
		return element;
	}

	public int pop() {
		if (isEmpty())
			throw new UnsupportedOperationException("Stack is Empty");
		return elements[--pointer];
	}
	
}
