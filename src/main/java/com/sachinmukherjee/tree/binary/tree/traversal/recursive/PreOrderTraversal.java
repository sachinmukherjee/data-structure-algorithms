package com.sachinmukherjee.tree.binary.tree.traversal.recursive;

import java.util.Stack;

import com.sachinmukherjee.CommonUtils;
import com.sachinmukherjee.tree.binary.Node;

/*
 * Root -> Left -> Right
 */
public class PreOrderTraversal {
	
	public void traverse(Node root) {
		
		Stack<Node> stack = new Stack<Node>();
		
		while(true) {
		
		//If root is not equal to null	
		while(null != root) {
			//Print the current node
			System.out.println(root.getData());
			//Push the current node
			stack.push(root);
			//go to left node
			root = root.getLeft();
		}
		
		//If stack is empty then break out of loop
		if(stack.isEmpty())
			break;
		
		//pop the last node
		root = stack.pop();
		//go to the right node
		root = root.getRight();
		}
	}
	
	
	public static void main(String[] args) {
		PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
		Node root = new Node();
		CommonUtils.insertData(root);
		preOrderTraversal.traverse(root);
		
	}
}
