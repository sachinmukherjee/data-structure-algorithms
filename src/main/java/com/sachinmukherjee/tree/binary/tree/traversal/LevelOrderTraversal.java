package com.sachinmukherjee.tree.binary.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

import com.sachinmukherjee.tree.binary.Node;

public class LevelOrderTraversal {

	private void traverse(Node root) {
		if (null == root) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			root = queue.poll();
			System.out.println(root.data);
			if (null != root.left) {
				queue.add(root.left);
			}

			if (null != root.right) {
				queue.add(root.right);
			}
		}
	}
}
