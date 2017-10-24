package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA11728 {


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
    static int  sum_of_factors (int n ){
    	     int sum =0;

    	     for(int i=n;i>=1;i--){
    	         if(n%i==0){
    	             sum+=i;
                 }
             }


              return sum;
    }
           public static void main(String[] args) {
               MyScanner sc = new MyScanner();
              // int[] arr = sum_of_factors();
               int t =1;
               while (true) {
                   boolean isFOund = false;
                   int n = sc.nextInt();
                   if(n==0){
                       break;
                   }

                   for(int i=n;i>=0;i--){
                       if(sum_of_factors(i)==n){
                           System.out.println("Case "+t+": "+i);
                           isFOund = true;
                           break;
                       }
                   }
                   if(!isFOund){
                       System.out.println("Case "+t+": "+"-1");
                   }


					t++;


               }
           }
}
