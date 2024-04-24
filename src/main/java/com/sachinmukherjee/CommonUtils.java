package com.sachinmukherjee;

import com.sachinmukherjee.tree.binary.Node;

public class CommonUtils {
	
	private CommonUtils() {
		throw new UnsupportedOperationException();
	}
	
	
	public static void insertData(Node root) {
		/*
		 			1
		 		   / \
		          2   3
		         /\   /\
		        4  5  6 7
		       /         \
		      8           9
		 */
		
		root.setData(1);
		
		root.setLeft(new Node(2));
		root.setRight(new Node(3));
		
		root.getLeft().setLeft(new Node(4));
		root.getLeft().setRight(new Node(5));
		
		
		root.getRight().setLeft(new Node(6));
		root.getRight().setRight(new Node(7));
		
		root.getLeft().getLeft().setLeft(new Node(8));
		
		root.getRight().getRight().setRight(new Node(9));
	}
	
	
	public static void printTree(Node root) {
		
	}

}
