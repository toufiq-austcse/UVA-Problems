/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA1174 {

	 static class Edge implements Comparable<Edge>{
		 int u,v,w;
		 Edge(int u,int v,int w){
			 this.u = u;
			 this.v = v;
			 this.w = w;
			 }
		/* (non-Javadoc)
		 * @see java.lang.Comparable#compareTo(java.lang.Object)
		 */
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return this.w -o.w;
		}
	 }
	 
	 int[] id;
	  List<Edge> ans = new ArrayList<>();
	 
	 /**
	 * 
	 */
	public UVA1174(int n) {
		id = new int[n];
		for(int i =0;i<n;i++){
			id[i] = i;
		}
		
	}
	
	int find(int n){
		while(n!=id[n]){
			n = id[n];
		}
		return n;
	}
	 
	void union(int i,int j){
		id[i] = j;
	} 
	
	void MST(List<Edge> edge){
		for(int i=0;i<edge.size();i++){
			int uu = find(edge.get(i).u);
			int vv = find(edge.get(i).v);
			
			if(uu!=vv){
				union(uu, vv);
				ans.add(edge.get(i));
			}
			
		}
	}
	public static void main(String[] arg) throws IOException{
		
	Scanner sc= new Scanner(System.in);
	
	
		
		
			int t  = sc.nextInt();
			for(int j=0;j<t;j++){
			//System.out.println();
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		UVA1174 ob  = new UVA1174(m);
		List<Edge> edges =new ArrayList<>();
		int count=0;
		
		for(int i=0;i<n;i++){
			
			String u = sc.next();
			String v = sc.next();
			int cost = sc.nextInt();
			
			if(!map.containsKey(u)){
				map.put(u, count++);
			}
			if(!map.containsKey(v)){
				map.put(v, count++);
			}
			
			Edge edge = new Edge(map.get(u), map.get(v), cost);
			edges.add(edge);
			
		}
		
		Collections.sort(edges);
		ob.MST(edges);
		
		int total =0;
		for(int i=0;i<ob.ans.size();i++){
			total+=ob.ans.get(i).w;
		}
		
		System.out.println(total);
		if(j<t-1){
			System.out.println();
		}
		
			}
		
	}
	

}
