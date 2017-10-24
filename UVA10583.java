/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.Scanner;

public class UVA10583 {
	int id[];
	int sz[];
	
	/**
	 * 
	 */
	public UVA10583(int n) {
		// TODO Auto-generated constructor stub
		id = new int[n];
		sz = new int[n];
		
		for(int i=0;i<n;i++){
			id[i] = i;
			sz[i] = i;
		}
	}
	
	int root(int i){
		while(i!=id[i]){
			i = id[i];
		}
		return i;
	}
	
	boolean isConnected(int i,int j){
		return root(i)==root(j);
	}
	
	void union(int p,int q){
		int i = root(p);
		int j = root(q);
		if(i==j){
			return;
		}
		
		if(sz[i]<sz[j]){
			id[i] = j;
			sz[j] += sz[i];
		}
		else {
			id[j] = i;
			sz[i] += sz[j];
		}
	}
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int cs=1;
		while(true){
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n==0 && m==0){
			break;
		}
		UVA10583 ob = new UVA10583(n);
		
		for(int i=0;i<m;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			ob.union(a-1,b-1 );
		}
		
		int total=0;
	 for(int j=0;j<ob.id.length;j++){
		if(ob.id[j]==j){
			total++;
		}
	 }
	 System.out.println("Case "+cs+": "+total);
	 cs++;
		}
		
	}
}
