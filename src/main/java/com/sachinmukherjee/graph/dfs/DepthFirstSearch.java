package com.sachinmukherjee.graph.dfs;

import java.util.Stack;

/*
 * DepthFirstSearch implementation using DirectedGraph
 */
public class DepthFirstSearch {
	
	int nodes;
	int edges;
	boolean[][] graph;
	
	
	public DepthFirstSearch(int nodes, int edges) {
		this.nodes=nodes;
		this.edges=edges;
		this.graph=new boolean[nodes][nodes];
	}
	
	
	private void addEdge(int source, int destination) {
		graph[source][destination]=true;
	}
	
	private void removeEdge(int source, int destination) {
		graph[source][destination]=true;
	}
	
	private void dfs(boolean[][] graph,final int source) {
		Stack<Integer> stack = new Stack<>();
		boolean[] visitedNodes = new boolean[nodes];
		stack.push(source);
		visitedNodes[source]=true;
		
		while(! stack.isEmpty()) {
			//remove the top element from the stack
			int node = stack.pop();
			//get all the neighbours for that node
			boolean[] neighbourNode = graph[node];
			for(int i=0; i<neighbourNode.length;i++) {
				//if edge exists and the node is not visited
				if(graph[node][i] && !visitedNodes[i]) {
					stack.push(i);
					visitedNodes[i]=true;
				}
			}
		}
	}
}
