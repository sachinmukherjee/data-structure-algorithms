package com.sachinmukherjee.tree.binary;

public class Node {

	private  int data;
	private Node left;
	private Node right;

	public Node(final int data) {
		this.data = data;
	}
	
	public Node(final int data, final Node left,final Node right) {
		this.data=data;
		this.left=left;
		this.right=right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}
