package com.sachinmukherjee.search;

public class LinearSearch {
	
	public boolean search(int[] elements, int search) {
		boolean result = false;
		for(int element:elements) {
			if(element==search) {
				result = true;
				break;
			}
		}
		return result;
	}
}
