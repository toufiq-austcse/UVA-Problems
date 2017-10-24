package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA11723 {

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
               MyScanner  sc = new MyScanner();
               int cas =1;

               while (true){
                   int r = sc.nextInt();
                   int n = sc.nextInt();
                   if(r==0 && n==0){
                       break;
                   }

                   int numberofRoadRemaining = r-n;

                   int numberOfWordRequiredforEachDigit = numberofRoadRemaining/n;
                   int extraWord = numberofRoadRemaining%n;


                   if(extraWord>0) {
                       numberOfWordRequiredforEachDigit = numberOfWordRequiredforEachDigit + 1;
                   }

                       if(numberOfWordRequiredforEachDigit>26){
                           System.out.println("Case "+cas+": impossible");
                       }
                       else{
                           System.out.println("Case "+cas+": "+numberOfWordRequiredforEachDigit);
                       }


                   cas++;
               }
           }
}
