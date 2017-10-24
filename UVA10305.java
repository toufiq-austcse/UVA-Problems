/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;
public class UVA10305 {
	
	int verticesNumber;
	LinkedList<Integer> adj[];
	
	
	 UVA10305(int n) {
		verticesNumber = n+1 ;
		adj = new LinkedList[verticesNumber];
		for(int i =1;i<verticesNumber;i++){
			adj[i] = new LinkedList<>();
		}
	}
	 
	 void addEdge(int u,int v){
		 adj[u].add(v);
	 }
	 
	 void dfs(int s,boolean[] visited,Stack<Integer> stack){
		 visited[s] = true;
			
			Iterator<Integer> it = adj[s].listIterator();
			
			while(it.hasNext()){
				int n = it.next();
				if(!visited[n]){
					dfs(n, visited, stack);
				}
			}
			
			stack.push(s);
	 }
	 
	 void topSort(){
		 boolean[] isVisited = new boolean[verticesNumber];
			Stack<Integer> stack = new Stack<>();
			
			for(int i =1;i<verticesNumber;i++){
				if(!isVisited[i]){
					dfs(i, isVisited, stack);
				}
			}
			
			while(stack.size()!=1){
				System.out.print((stack.pop())+" ");
			}
			System.out.println(stack.pop());
	 }
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		
		
		while(sc.hasNext()){
			int n =sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0){
				break;
			}
			
			UVA10305 ob = new UVA10305(n);
			
			for(int i = 0;i<m;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				ob.addEdge(a, b);
			}
			
			ob.topSort();
			}
		
		
	}

}
