package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA821 {


          //Code for Faster Input
    	  public static class MyScanner {

    	      BufferedReader br;
    	      StringTokenizer st;

    	      public MyScanner() {
    	         br = new BufferedReader(new InputStreamReader(System.in));
    	      }

    	      String next() {
    	          while (st == null || !st.hasMoreElements()) {
    	              try {
    	                  st = new StringTokenizer(br.readLine());
    	              } catch (IOException e) {
    	                  e.printStackTrace();
    	              }
    	          }
    	          return st.nextToken();
    	      }

    	      int nextInt() {
    	          return Integer.parseInt(next());
    	      }

    	      long nextLong() {
    	          return Long.parseLong(next());
    	      }

    	      double nextDouble() {
    	          return Double.parseDouble(next());
    	      }

    	      String nextLine(){
    	          String str = "";
    		  try {
    		     str = br.readLine();
    		  } catch (IOException e) {
    		     e.printStackTrace();
    		  }
    		  return str;
    	      }

    	   }
    	   //--------------------------------------------------------



          List<Integer> adj[];
    	  int nodes;

    	  UVA821 (int n){
    	      nodes = n;
    	      adj = new LinkedList[nodes];
    	      for(int i=0;i<nodes;i++){
    	          adj[i] = new LinkedList<>();
              }
          }
    int[] level ;

          void addEdge(int u,int v){
    	      adj[u].add(v);
          }

          void BFS(int source){
              boolean[] isVisited = new boolean[nodes];
              level = new int[nodes];

              level[source] =0;

              Queue<Integer> queue = new LinkedList<>();
              queue.add(source);
              isVisited[source] = true;
              while(!queue.isEmpty()){
                  int top = queue.poll();
             //     System.out.println(top+" ");
                  Iterator<Integer> it = adj[top].listIterator();
                  while(it.hasNext()){
                      int a = it.next();
                      if(!isVisited[a]){
                          isVisited[a] = true;
                          queue.add(a);
                          level[a] = level[top]+1;
                      }
                  }
              }
          }
          List<Integer> list = new ArrayList<>();

           void pathcosts(int[] arr){
              for(int i=0;i<arr.length;i++){
                  if(arr[i]!=0) {
                      list.add(arr[i]);
                  }
              }
          }
          void clear(int[] arr){
               for(int i=0;i<arr.length;i++){
                   arr[i] = 0;
               }
          }

           public static void main(String[] args) {
               MyScanner sc = new MyScanner();
               int t =1;

               while (true) {
                   UVA821 ob = new UVA821(100);
                   Set<Integer> set = new HashSet<>();
                   int a = sc.nextInt();
                   int b = sc.nextInt();
                   if(a==0 && b==0){
                       break;
                   }


                   while (true) {


                       if (a == 0 && b == 0) {
                       /*ob.BFS(2);
                       System.out.println("-----------------------");
                       for(int i=0;i<ob.level.length;i++){
                           System.out.println(ob.level[i]);
                       }*/
                           Iterator<Integer> it = set.iterator();
                           while (it.hasNext()) {
                               ob.BFS(it.next() - 1);
                               ob.pathcosts(ob.level);
                               ob.clear(ob.level);
                           }

                           int total = 0;
                           for (int i = 0; i < ob.list.size(); i++) {
                               total += ob.list.get(i);
                           }
                           int dem = ob.list.size();
                           double ans = total / (double) dem;
                           System.out.printf("Case %d: average length between pages = %.3f clicks\n",t, ans);
                           break;

                       }
                       set.add(a);
                       set.add(b);


                       ob.addEdge(a - 1, b - 1);
                       a = sc.nextInt();
                       b = sc.nextInt();

                   }
                   t++;

               }
           }
}
