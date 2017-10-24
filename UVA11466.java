package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA11466 {

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


           public static void main(String[] args) {
               MyScanner sc = new MyScanner();


              while (true){
                  long n = Math.abs(sc.nextLong());
                  if(n==0){
                      break;
                  }
                  long max = 0;
                  long count =0;

                  for(long i =2;i*i<=n;i++){

                      if(n%i==0){
                          count++;
                          max = Math.max(max,i);

                          while (n%i==0){
                              n/=i;
                          }
                      }

                  }

                  if(n>1){
                      count++;
                      max = Math.max(max,n);
                  }

                  if(count<=1){
                      System.out.println("-1");
                  }
                  else{
                      System.out.println(max);
                  }


              }



           }
}
