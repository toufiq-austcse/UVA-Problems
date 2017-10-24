/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

	//NOT ACcepted			
package UVA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;



public class UVA247 {

	private int verticesNumber;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency List
    Map<Integer,String>  map = new HashMap<>();
    static List<String> names = new ArrayList<>();
    int count =0;
   static String out ="";
    
    /**
	 * 
	 */
	public UVA247(int n) {
		verticesNumber = n;
        adj = new LinkedList[verticesNumber];
        for (int i=0; i<verticesNumber; ++i)
            adj[i] = new LinkedList();
	}
	
	
	
	//Function to add an edge into the graph
    void addEdge(int u, int v )  { 
    	adj[u].add(v);
    	
    	}
 
 
   void dfs(int s,boolean[] visited){
	   visited[s] = true;
	   
	
	  // System.out.print(names.get(s));
	   out += names.get(s)+", ";
	  
	  count++;
	 
	  
	    Iterator<Integer> it = adj[s].listIterator();
	   
	   while(it.hasNext()){
		   int n = it.next();
		   if(!visited[n]){
			   dfs(n, visited);
			  
		   }
	   }
	   
   }
   
   UVA247 getRevers(){
	   UVA247 reverse = new UVA247(verticesNumber);
	   
	   for(int i=0;i<verticesNumber;i++){
		   Iterator<Integer> it = adj[i].listIterator();
		   
		   while(it.hasNext()){
			   reverse.adj[it.next()].add(i);
		   }
	   }
	   return reverse;
   }
   
   void topologocalSort(int s,boolean[] visited,Stack<Integer> stack){
	   visited[s] = true;
	   
	   Iterator<Integer> it = adj[s].listIterator();
	   
	   while(it.hasNext()){
		   int n = it.next();
		   
		   if(!visited[n]){
			   topologocalSort(n, visited, stack);
		   }
	   }
	   
	   stack.push(s);
	   
   }
   
   void printSCCs(){
	   Stack<Integer> statck = new Stack<>();
	   boolean[] isVisited = new boolean[verticesNumber];
	   
	   for(int i =0;i<verticesNumber;i++){
		   
		   if(!isVisited[i]){
			   topologocalSort(i, isVisited, statck);
		   }
	   }
	   
	   
	   UVA247 rev = getRevers();
	   
	   for(int i =0;i<isVisited.length;i++){
		   isVisited[i] = false;
	   }
	   
	   while(statck.size()!=0){
		   int n = statck.pop();
		   
		   if(!isVisited[n]){
			   count =0;
			  rev.dfs(n, isVisited);
			 
			  out +="\n";
			   //System.out.println();
			  
			   
		   }
		   
		   
		   
	   }
	  
   }
   
   public static void main(String[] arg){
	   Scanner sc = new Scanner(System.in);
	   int l=1;
	   while(true){
		   int n = sc.nextInt();
		   int m = sc.nextInt();
		   if(n==0 && m==0){
			   break;
		   }
		   int nm =0;
		   sc.nextLine();
		  
		  
		   UVA247 ob = new UVA247(n);
		   for(int i=0;i<m;i++){
			   
			   String conn = sc.nextLine();
			   String[] parts = conn.split(" ");
			   if(!names.contains(parts[0])){
				  // names.add(parts[0]);
				   names.add(nm++, parts[0]);
				   //ob.map.put(nm++,parts[0]);
			   }
			   
			   if(!names.contains(parts[1])){
				 
				names.add(nm++, parts[1]);
			   }
			   
			 
			   ob.addEdge(names.indexOf(parts[0]),names.indexOf(parts[1]));
		   }
		   System.out.println("Calling circles for data set "+l+":");
		   ob.printSCCs();
		   //System.out.println(ob.map);
		   //System.out.println(names);
		  // System.out.println(out);
		   char[] outchr = out.toCharArray();
		   String finalSt="";
		   for(int i=0;i<outchr.length;i++){
			   if (outchr[i]==',' && outchr[i+1]==' ' && outchr[i+2] =='\n' ){
				 
				   outchr[i-2] = '\n';
				 
				  
				   outchr[i] ='A';
				   outchr[i-1] = 'A';
				  
				   
				   
			   }
			   
			   
		   }
		 
		   for(int i=0;i<outchr.length;i++){
			   System.out.print(outchr[i]);
		   }
		 
		  
			  
		   
		   names.clear();
		   l++;
		  
		  
	   }
   }
}
