package com.sachinmukherjee.tree.binary.tree.traversal;

import java.util.Stack;

import com.sachinmukherjee.tree.binary.Node;

public class PreOrderTraversal {

	private void traverse(final Node root) {
		Stack<Node> stack = new Stack<>();
		Node current = root;
		while (true) {

			while (null != current) {
				System.out.println(current.data);
				stack.push(current);
				//Process left subtree
				current = current.left;
			}
			if (stack.isEmpty()) {
				break;
			}
			current = stack.pop();
			//Process right sub tree
			current = current.right;
		}
		stack.clear();

	}
}
