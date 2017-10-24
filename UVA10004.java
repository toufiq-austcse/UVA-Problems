/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class UVA10004 {
	int v ;
	List<Integer> adj[];
	
	/**
	 * 
	 */
	public UVA10004(int n) {
		v = n;
		adj = new LinkedList[v];
		
		for(int i=0;i<v;i++){
			adj[i] =  new LinkedList<>();
		}
	}
	
	void addEdge(int u,int v){
		adj[u].add(v);
		adj[v].add(u);
	}
	
	boolean isBipertite(int src){
		int[] colorArr = new int[v];
		
		for(int i=0;i<v;i++){
			colorArr[i] =-1;
		}
		
		colorArr[src] = 1;
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(src);
		
		while(queue.size()!=0){
			int u = queue.poll();
			
			if(adj[u].contains(u)){
				return false;
			}
			
			Iterator<Integer> it = adj[u].listIterator();
			
			while(it.hasNext()){
				int n = it.next();
				//System.out.println(colorArr[n]);
				
				if(adj[u].contains(n) && colorArr[n]==-1){
					colorArr[n] = 1- colorArr[u];
					queue.add(n);
				}
				
				else if(adj[u].contains(n) && colorArr[n]== colorArr[u]){
					return false;
				}
				
				//System.out.println("After changing "+colorArr[n]);
			}
		}
		
		return true;
	}
	
	public static void main(String[] arg){
		Scanner sc = new Scanner( System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			int m = sc.nextInt();
			
			UVA10004 ob = new UVA10004(n);
			
			for(int i =0;i<m;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				ob.addEdge(a, b);
			}
			if(ob.isBipertite(0)){
				System.out.println("BICOLORABLE.");
			}
			else{
				System.out.println("NOT BICOLORABLE.");
			}
			
		}
	}

}
