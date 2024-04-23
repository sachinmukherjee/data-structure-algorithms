package com.sachinmukherjee.tree.binary;

public class Node {

	public final int data;
	public Node left;
	public Node right;

	public Node(final int data) {
		this.data = data;
		left=right=null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}
