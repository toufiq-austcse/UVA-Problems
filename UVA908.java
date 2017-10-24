/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UVA908 {
	static class Edge implements Comparable<Edge>{
		int u,v,w;
		Edge(int u,int v,int w){
			this.u= u;
			this.v = v;
			this.w = w;
		}
		/* (non-Javadoc)
		 * @see java.lang.Comparable#compareTo(java.lang.Object)
		 */
		@Override
		public int compareTo(Edge o) {
			
			return this.w-o.w;
		}
	}
	
	int[] id;
	 List<Edge> ans = new ArrayList<>();
	
	/**
	 * 
	 */
	public UVA908(int n) {
		id = new int[n];
		for(int i=0;i<n;i++){
			id[i] = i;
		}
	}
	
	int find(int n){
		while(n!=id[n]){
			n = id[n];
		}
		
		return n;
	}
	
	void union(int u,int v){
		id[u] = v;
	}
	
	void mst(List<Edge> edge){
		for(int i=0;i<edge.size();i++){
			int uu = find(edge.get(i).u);
			int vv = find (edge.get(i).v);
			if(uu!=vv){
				union(uu, vv);
				ans.add(edge.get(i));
			}
		}
				
	}
	
	public static void main(String[] arg) throws Exception{
	Scanner sc = new Scanner(System.in);
	int count =0;
	while(sc.hasNext()){
		if(count!=0){
			System.out.println();
		}
	int n = sc.nextInt();
	UVA908 ob = new UVA908(n);
	List<Edge> listk = new ArrayList<>();
	
	for(int i=0;i<n-1;i++){
		int a= sc.nextInt()-1;
		int b =sc.nextInt()-1;
		int c = sc.nextInt();
		listk.add(new Edge(a, b, c));
	}
	
	int k = sc.nextInt();
	
	for(int i=0;i<k;i++){
		int a = sc.nextInt()-1;
		int b = sc.nextInt()-1;
		int c = sc.nextInt();
		listk.add(new Edge(a, b, c));
	}
	
	int m = sc.nextInt();
	List<Edge> edges = new ArrayList<>();
	
	for(int i=0;i<m;i++){
		int a = sc.nextInt()-1;
		int b = sc.nextInt()-1;
		int c = sc.nextInt();
		Edge edge = new Edge(a, b, c);
		edges.add( edge);
	}
	
	Collections.sort(edges);
	
	ob.mst(edges);
	
	int distancep =0;
	
	for(int i=0;i<ob.ans.size();i++){
		distancep +=ob. ans.get(i).w;
	}
	
	System.out.println(distancep);
	
	UVA908 ob1 = new UVA908(n);
	
	Collections.sort(listk);
	
	ob1.mst(listk);
	
	int disfinal =0;
	
	for(int i=0;i<ob.ans.size();i++){
		disfinal+= ob1.ans.get(i).w;
	}
	
	System.out.println(disfinal);
	count++;
	}
	
	}

}
