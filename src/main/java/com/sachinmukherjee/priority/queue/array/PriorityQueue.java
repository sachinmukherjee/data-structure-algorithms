package com.sachinmukherjee.priority.queue.array;


/**
 * Priority Queue(Max) Implementation Using Array
 * @author Sachin Mukharjee
 *
 */
public class PriorityQueue {
	
	private int[] item = new int[10000];
	private int size = -1;
	
	
	/**
	 * @param element
	 * Inserts element into the queue
	 */
	public void enqueue(int element) {
		if(size == item.length-1) {
			throw new UnsupportedOperationException("Queue is Full");
		}
		size++;
		item[size]=element;
	}
	
	/**
	 * @return index of maximum element from the queue
	 */
	public int peek() {
		int maxElement = Integer.MIN_VALUE;
		int index = -1;
		
		for(int i=0; i<=size;i++) {
			if(item[i] > maxElement) {
				index = i;
				maxElement = item[i];
			}
		}
		return index;
	}
	
	
	/**
	 * Removes maximum element from the queue
	 */
	public void dequeue() {
		if(-1 == size) {
			throw new UnsupportedOperationException("Queue is Empty");
		}
		
		int maxElementIndex = peek();
		for(int i=maxElementIndex; i<=size;i++) {
			item[i] = item[i+1];
		}
	}
	
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.enqueue(20);
		queue.enqueue(15);
		queue.enqueue(5);
		queue.enqueue(10);
		queue.enqueue(2);
		
		queue.dequeue();
		queue.enqueue(150);
		
		System.out.println(queue.peek());

	}

}
