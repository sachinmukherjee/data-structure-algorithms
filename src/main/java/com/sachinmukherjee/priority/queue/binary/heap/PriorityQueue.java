package com.sachinmukherjee.priority.queue.binary.heap;

/*
 * Max Queue(Ascending Order)
 * https://www.geeksforgeeks.org/priority-queue-using-binary-heap/
 * Parent must be smaller than its child
 */
public class PriorityQueue {

	private int[] heap;
	private int size;
	private int capacity;

	public PriorityQueue(final int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.heap = new int[capacity];
	}

	private int parent(int index) {
		return (index - 1) / 2;
	}

	private int leftChild(int index) {
		return (2 * index + 1);
	}

	private int rightChild(int index) {
		return (2 * index + 2);
	}

	private void swap(int index1, int index2) {
		int temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = temp;
	}

	/*
	 * Bottom to Up
	 */
	private void heapifyUp(int index) {
		while (index > 0 && heap[parent(index)] > heap[index]) {
			swap(index, parent(index));
			index = parent(index);
		}
	}

	/*
	 * Top to Bottom
	 */
	private void heapifyDown(int index) {
		int minIndex = index;
		
		//Get the index of left child
		int left = leftChild(index);
		//if left child is smaller then size and left is smaller than minIndex
		if (left < size && heap[left] < heap[minIndex]) {
			minIndex = left;
		}

		//if right is smaller than size and right is smaller than minIndex
		int right = rightChild(index);
		if (right < size && heap[right] < heap[minIndex]) {
			minIndex = right;
		}

		if (index != minIndex) {
			//Swap the data
			swap(index, minIndex);
			//Heapify Down
			heapifyDown(minIndex);
		}
	}

	/*
	 * Adds element to queue
	 */
	public void offer(int element) {
		if (size == capacity) {
			throw new IllegalStateException("Priority Queue is full");
		}

		heap[size] = element;
		size++;
		heapifyUp(size - 1);
	}

	/*
	 * Removes the max element from the queue
	 */
	public int poll() {
		if (size == 0) {
			throw new IllegalStateException("Priority Queue is Empty");
		}
		
		//Get the fist element from the heap
		int minValue = heap[0];
		//made last element as first element
		heap[0] = heap[size - 1];
		size--;
		heapifyDown(0);

		return minValue;
	}

	public int peek() {
		if (size == 0) {
			throw new IllegalStateException("Priority queue is empty.");
		}

		return heap[0];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue(10);

		pq.offer(5);
		pq.offer(2);
		pq.offer(8);
		pq.offer(1);
		pq.offer(3);

		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
