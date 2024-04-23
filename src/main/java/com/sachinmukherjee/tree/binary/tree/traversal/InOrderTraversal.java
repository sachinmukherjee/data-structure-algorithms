package com.sachinmukherjee.tree.binary.tree.traversal;

import java.util.Stack;

import com.sachinmukherjee.tree.binary.Node;

public class InOrderTraversal {

	private void traverse(Node root) {
		if (null == root) {
			return;
		}
		Stack<Node> stack = new Stack<>();
		while (true) {
			while (null != root) {
				stack.push(root);
				root = root.left;
			}
			if (stack.isEmpty()) {
				break;
			}

			root = stack.pop();
			System.out.println(root.data);
			root = root.right;
		}
	}
}
