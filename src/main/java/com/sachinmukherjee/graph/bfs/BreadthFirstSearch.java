package com.sachinmukherjee.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

/*
 * BreadthFirstSearch implementation using DirectedGraph
 */
public class BreadthFirstSearch {
	
	int nodes;
	int edges;
	boolean[][] graph;
	
	BreadthFirstSearch(int nodes,int edges){
		this.nodes=nodes;
		this.edges=edges;
		this.graph=new boolean[nodes][nodes];
		initialize(nodes);
	}
	
	private void initialize(final int nodes) {
		for(int i=0; i<nodes;i++) {
			for(int j=0; j<nodes;j++) {
				graph[i][j] = false;
			}
		}
	}
	
	private void addEdge(int source, int destination) {
		graph[source][destination]=true;
	}
	
	private void removeEdge(int source, int destination) {
		graph[source][destination]=false;
	}
	
	private void bfs(boolean[][] graph, int source) {
		Queue<Integer> queue = new LinkedList<>();
		//To mark all the visited nodes
		boolean[] visitedNodes = new boolean[nodes];
		queue.add(source);
		visitedNodes[source]=true;
		
		//process untill the queue is not empty
		while(! queue.isEmpty()) {
			//get the top most element
			int node = queue.remove();
			//get all the connected nodes of the given source
			boolean[] neighbours = graph[node];
			for(int i=0; i<neighbours.length;i++) {
				boolean neighbourNode = neighbours[i];
				//if edge exists and node is not visited
				if(neighbourNode && !visitedNodes[i]) {
					visitedNodes[i]=true;
					queue.add(i);
				}
			}
		}
	}
}
