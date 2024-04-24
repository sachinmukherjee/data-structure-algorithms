package com.sachinmukherjee.tree.binary;

public class Node {

	private  int data;
	private Node left;
	private Node right;

	
	public Node() {
		
	}
	
	public Node(final int data) {
		this.data = data;
	}
	
	public Node(final int data, final Node left,final Node right) {
		this.data=data;
		this.left=left;
		this.right=right;
	}
	
	

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}
