package com.sachinmukherjee.search;

public class BinarySearch {
	
	public boolean search(int[] elements,int search) {
		int low=0;
		int high = elements.length;
		
		while(low <= high) {
			int mid = (low+high)/2;
			if(elements[mid] < search) {
				low = mid + 1;
			}else if(elements[mid] > search) {
				high = mid - 1;
			}else {
				return true;
			}
		}
		return false;
	}
}
