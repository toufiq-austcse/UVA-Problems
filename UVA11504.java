/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;



public class UVA11504 {

	int v;
	List<Integer> adj[];
	 int count =0;
	
	public UVA11504(int n) {
		v= n;
		adj = new LinkedList[n];
		for(int i =0;i<n;i++){
			adj[i] = new LinkedList<>();
		}
	}
	
	void addEdge(int u,int v){
		adj[u].add(v);
	}
	
	void dfs(int s,boolean[] visited){
		visited[s] = true;
		Iterator<Integer> it = adj[s].listIterator();
		while(it.hasNext()){
			int n = it.next();
			if(!visited[n]){
				dfs(n,visited);
				
			}
		}
		
	}
	
	
	 
	 public static void main(String[] arg){
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 for(int i=0;i<t;i++){
			 int n = sc.nextInt();
			 int m = sc.nextInt();
			 int c=0;
			 UVA11504 ob = new UVA11504(n);
			 for(int j=0;j<m;j++){
				 int a = sc.nextInt();
				 int b = sc.nextInt();
				 ob.addEdge(a-1, b-1);
			 }
			 boolean[] isVisted = new boolean[n];
			 for(int j=0;j<n;j++){
				 if(!isVisted[j]){
					 ob.dfs(j, isVisted);
					 c++;
				 }
			 }
			 System.out.println(c);
		 }
	 }
}
