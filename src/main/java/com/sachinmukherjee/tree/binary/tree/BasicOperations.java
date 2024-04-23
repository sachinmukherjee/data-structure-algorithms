package com.sachinmukherjee.tree.binary.tree;

import com.sachinmukherjee.tree.binary.Node;

public class BasicOperations {
	/*
	 * Node root;
	 * 
	 * public void addRightNode(final int data) { Node node = new Node(data);
	 * 
	 * if (null == root) { root = node; } else { Node current = root; while (null !=
	 * current) { current = current.right; } current = node; }
	 * 
	 * }
	 * 
	 * public void addLeftNode(final int data) { Node node = new Node(data); if
	 * (null == root) { root = node; } else { Node current = root; while (null !=
	 * current) { current = current.left; } current = node; } }
	 */
	public static Node addRightNode(Node root, final int data) {
		Node node = new Node(data);

		if (null == root) {
			root = node;
		} else {
			Node current = root;
			while (null != current) {
				current = current.right;
			}
			current = node;
		}
		return node;

	}

	public static Node addLeftNode(Node root, final int data) {
		Node node = new Node(data);
		if (null == root) {
			root = node;
		} else {
			Node current = root;
			while (null != current) {
				current = current.left;
			}
			current = node;
		}
		return node;
	}
}
