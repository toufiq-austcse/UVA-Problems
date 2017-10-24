package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA572 {

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

          int m ;
    	  int n;

    	 boolean isSafe(int x,int y,char[][] grid ,boolean [][] isVisited){



                 return (x >= 0) &&( y >= 0) && (x < m) && (y < n) && (grid[x][y] == '@' && !isVisited[x][y]);



          }

          void DFS(char[][] grid,boolean[][] isVisited,int x,int y){
    	     int[] dx = {-1,-1,-1,0,0,1,1,1};
    	     int[] dy = {-1,0,1,-1,1,-1,0,1};
    	     isVisited[x][y] = true;



    	     for(int i=0;i<8;i++){

                     if (isSafe(x + dx[i], y + dy[i], grid, isVisited)) {


                         DFS(grid, isVisited, x + dx[i], y + dy[i]);
                     }

             }
          }
           public static void main(String[] args) {
               MyScanner sc = new MyScanner();

               while (true){
                   UVA572 ob = new UVA572();
                   ob.m =  sc.nextInt();
                   ob.n = sc.nextInt();
                   if(ob.m==0){
                       break;
                   }
                   char[][] grid = new  char[ob.m][ob.n];
                   List<Integer> x = new ArrayList<>();
                   List<Integer> y = new ArrayList<>();
                   for(int i=0;i<ob.m;i++){
                      String s = sc.nextLine();
                      for(int j=0;j<s.length();j++){
                          grid[i][j] = s.charAt(j);
                          if(grid[i][j]=='@'){
                              x.add(i);
                              y.add(j);
                          }
                      }
                   }
                   boolean[][] isVisited = new boolean[ob.m][ob.n];
                   int count =0;

                  for (int i=0;i<x.size();i++){
                      if(!isVisited[x.get(i)][y.get(i)]) {
                          ob.DFS(grid, isVisited, x.get(i), y.get(i));
                          count++;
                      }
                  }

                   System.out.println(count);

               }
           }
}
