package com.sachinmukherjee.graph.directed;

/*
 * Directed Graphs using Array
 */
public class DirectedGraph {
	
	boolean[][] graph;
	int nodes;
	int edges;
	
	
	public DirectedGraph(int nodes, int edges){
		this.nodes = nodes;
		this.edges=edges;
		this.graph = new boolean[nodes][nodes];
		initializeGraph();
	}
	
	private void initializeGraph() {
		for(int i=0; i<nodes;i++) {
			for(int j=0; j<nodes;j++) {
				graph[i][j]=false;
			}
		}
	}
	
	private void addEdge(int source,int destination) {
		graph[source][destination]=true;
	}
	
	private void removeEdge(int source, int destination) {
		graph[source][destination]=false;
	}
	
	private void printGraph() {
		for(int i=0; i<nodes;i++) {
			System.out.print("Vertex "+i +" Connected With ----->");
			for(int j=0; j<nodes;j++) {
				boolean pathExists = graph[i][j];
				if(pathExists) {
					System.out.println(" ");
					System.out.println(j);
				}
			}
			System.out.println();
		}
	}
}
