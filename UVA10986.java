/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class UVA10986 {
	
	static class Edge{
		int to,weight;
		Edge(int to,int weight){
			this.to = to;
			this.weight = weight;
		}
		
	}
	
	static class Node implements Comparable<Node>{
		int node,dist,parent;
		Node(int n,int d,int p){
			node = n;
			dist = d;
			parent = p;
		}

		@Override
		public int compareTo(Node o) {
			
			if(this.dist == o.dist){
				return Integer.compare(this.node,o.node);
			}
			
			return this.dist -o.dist;
		}
		
	}
	
	static List<Edge> adj[];
	static int edges,nodes;
	static int[] distance;
	static Scanner sc = new Scanner(System.in);
	
	static void createGraph(){
		adj = new ArrayList[nodes];
		
		for(int i=0;i<adj.length;i++){
			adj[i] = new ArrayList<>();
		}
		
		for(int i=0;i<edges;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int w = sc.nextInt();
			adj[a].add( new Edge(b, w));
			adj[b].add( new Edge(a, w));
			
		}
	}
	
	static void findShortestpath(int start){
		distance = new int[nodes];
		
		for(int i=0;i<nodes;i++){
			distance[i] = Integer.MAX_VALUE;
		}
		
		distance[start] =0;
		
		TreeSet<Node> set = new TreeSet<>();
		
		set.add( new Node(start, 0, -1));
		
		while(set.size()>0){
			Node curr = set.pollFirst();
			
			for(Edge edge: adj[curr.node]){
				
				if(distance[curr.node]+edge.weight<distance[edge.to]){
					set.remove( new Node(edge.to, distance[edge.to], -1));
					distance[edge.to] = distance[curr.node]+edge.weight;
					set.add( new Node(edge.to, distance[edge.to], curr.node));
				}
			}
			
		}
	}
	
	public static void main(String[] arg){
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int t = sc.nextInt();
			nodes = n;
			edges = m;
			createGraph();
			findShortestpath(s);
			
			if(distance[t]==Integer.MAX_VALUE){
				System.out.println("Case #"+i+": "+"unreachable");
			}
			else{
				System.out.println("Case #"+i+": "+distance[t]);
			}
			
		}
	}
	

}
