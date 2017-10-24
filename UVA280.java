/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;


import java.util.*;



public class UVA280 {

    static int v;
    static List<Integer> adj[];
    static boolean[] visited ;
    
    
    
	public UVA280(int n) {
		v = n;
		adj = new LinkedList[n];
		visited = new boolean[n];
		for(int i=0;i<n;i++){
			adj[i] = new LinkedList<>();
		}
	}
	
	 void addEdge(int u,int v){
		adj[u].add(v);
	}
	
	 void dfs(int s,boolean[] v){
		v[s] = true;
		//System.out.print(s+" ");
		Iterator<Integer> it = adj[s].listIterator();
		
		while(it.hasNext()){
			int n = it.next();
			if(!v[n]){
				dfs(n, v);
			}
		}
	}
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n= sc.nextInt();
			if(n==0){
				break;
			}
			UVA280 ob = new UVA280(n);
			while(true){
				int x = sc.nextInt();
				if(x==0){
					break;
				}
				while(true){
					int y = sc.nextInt();
					if(y==0){
						break;
					}
					ob.addEdge(x-1, y-1);
				}
			}
			
		  int qua = sc.nextInt();
		  
		  for(int i=0;i<qua;i++){
			  int a = sc.nextInt()-1;
			  ob.dfs(a, visited);
			 
			  
			 if(!adj[a].contains(a)){
				 visited[a] = false;
			 }
			 int count =0;
			  for(int j=0;j<n;j++){
				if(!visited[j]){
					count++;
				}
			  }
			  System.out.print(count);
			  for(int j=0;j<n;j++){
				  if(!visited[j]){
				 System.out.print(" "+(j+1));
				  }
			  }
			  System.out.println();
			  for(int j=0;j<n;j++){
				  visited[j] = false;
			  }
		  }
		}
		
	}
	
	
	
	
	

}
