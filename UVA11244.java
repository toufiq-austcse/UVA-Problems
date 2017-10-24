package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.util.*;
public class UVA11244 {
    int Row,Column;
    int count =0;

    UVA11244(int r, int c){
         Row = r;
         Column = c;
    }


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


     boolean isSafe(String[] graph,int row,int columnm,boolean[][]isVisited){

        return ((row>=0)&&(columnm>=0)&&(row<Row) && (columnm<Column) && (!isVisited[row][columnm]) && graph[row].charAt(columnm)=='*');
    }

    void DFS(String[] graph,int row,int column,boolean[][] isVisited){
         int[] rowNumber =   {-1,-1,-1,0,0,1,1,1};
         int[] columnNumber={-1,0,1,-1,1,-1,0,1};


             isVisited[row][column] = true;



           //  System.out.println(row+" "+column);
        count++;



         for(int i=0;i<8;i++){
             if(isSafe(graph,row+rowNumber[i],column+columnNumber[i],isVisited)){

                 DFS(graph,row+rowNumber[i],column+columnNumber[i],isVisited);
             }
         }

    }
           public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

               while (true){
                   int r = sc.nextInt();
                   int c = sc.nextInt();
                   if(r==0 && c==0){
                       break;
                   }
                   UVA11244 ob = new UVA11244(r,c);
                  String[] g = new String[r];

                   for(int i=0;i<r;i++){
                       g[i]= sc.next();
                   }

                  boolean[][] isVisted = new boolean[r][c];
                   int result =0;

                  for(int i=0;i<r;i++){
                      for(int j=0;j<c;j++){
                          if(!isVisted[i][j] && g[i].charAt(j)=='*'){
                              ob.DFS(g,i,j,isVisted);
                            //  System.out.println(ob.count);
                              if(ob.count==1){
                                  result++;
                              }
                              ob.count=0;
                          }
                      }
                  }

                   System.out.println(result);

               }

           }
}
