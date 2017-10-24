/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UVA10928 {
	int v;
	List<Integer> adj[];
	
	/**
	 * 
	 */
	public UVA10928(int n) {
		// TODO Auto-generated constructor stub]
		v = n;
		adj = new LinkedList[v];
		for(int i=0;i<n;i++){
			adj[i] = new LinkedList<>();
		}
	}
	
	void addEdge(int u,int v){
		adj[u].add(v);
	}
	
	public static void main(String[] arg){
		
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		sc.nextLine();
		
		while(t!=0){
			
			int temp =Integer.MAX_VALUE;
			String b = sc.nextLine();
			int v = Integer.parseInt(b);
			
			UVA10928 ob = new UVA10928(v);
			
			for(int i=0;i<v;i++){
				int count =0;
				//System.out.println(i);
				//if(sc.hasNext()){
				String s = sc.next();
				String part[] = s.split(" ");
				//}
				
				
				for(String o: part){
					ob.addEdge(i, Integer.parseInt(o));
					count++;
					if(count<temp){
						temp = count;
					}
				}
				
			}
			
			
			int sp =0;
			for(int i=0;i<ob.adj.length;i++){
				
				
				if(ob.adj[i].size()==temp){
					if(sp==0){
					System.out.print(i+1);
					}
					else{
						System.out.print(" "+(i+1));
					}
					sp++;
				}
			}
			System.out.println();
			t--;
			if(t!=0){
				System.out.println();
			}
			
		}
		
	}

}
