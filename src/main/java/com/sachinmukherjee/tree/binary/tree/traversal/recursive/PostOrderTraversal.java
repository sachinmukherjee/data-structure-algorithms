package com.sachinmukherjee.tree.binary.tree.traversal.recursive;

import java.util.Stack;

import com.sachinmukherjee.CommonUtils;
import com.sachinmukherjee.tree.binary.Node;

/*
 * Left -> Right -> Root
 */
public class PostOrderTraversal {

	
	public void traverse(Node root) {
		Stack<Node> stack = new Stack<>();
		
		
		while(true) {
		
		//If node is not equal to null
		while(null != root) {
			//add the node to stack 
			stack.push(root);
			//traverse to left child
			root = root.getLeft();
		}
		
		//if stack is empty then move out of loop
		if(stack.isEmpty()) {
			break;
		}
		
		//get the latest element from stack
		root = stack.pop();
		//print the data
		System.out.println(root.getData());
		//traverse to the right child
		root = root.getRight();
		}
	}
	
	public static void main(String[] args) {
		PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
		
		Node root = new Node();
		
		CommonUtils.insertData(root);
		
		postOrderTraversal.traverse(root);
	}
}
