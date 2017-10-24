/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;
public class UVA871 {

	int verticesN;
	LinkedList<Integer> adj[];
	
	UVA871(int n){
		verticesN = n;
		adj = new LinkedList[verticesN];
		
		for(int i =0;i<n;i++){
			adj[i] = new LinkedList<>();
		}
	}
	
   void	addEdge(int u,int v){
		adj[u].add(v);
	}
   
   void dfs(int s,boolean[] visited){
	   visited[s] = true;
	   
	   Iterator<Integer> it = adj[s].listIterator();
	   
	   while(it.hasNext()){
		   int n = it.next();
		   if(!visited[n]){
			   dfs(n, visited);
			   
		   }
	   }
   }
   
   
   public static void main(String[] arg){
	   Scanner sc = new Scanner(System.in);
	   UVA871 ob = new UVA871(25);
	   
	   int n = sc.nextInt();
	   sc.nextLine();
	   while(n!=0){
	   
	   for(int i=0;i<5;i++){
		   String s = sc.nextLine();
		   for(int j=0;j<s.length();j++){
			   if(s.charAt(j)==1){
				   ob.addEdge(i, j);
			   }
		   }
		  
	   }
	   
	   boolean[] isVisited = new boolean[5];
	   for(int i =0;i<5;i++){
		   ob.dfs(i, isVisited);
		   for(int j=0;j<5;j++){
			   System.out.print(isVisited[j]+" ");
		   }
		   System.out.println();
		   
	   }
	   
	   for(int j=0;j<5;j++){
		   System.out.print(isVisited[j]+" ");
	   }
	   System.out.println();
	   
	   n--;
	   }
   }
}
