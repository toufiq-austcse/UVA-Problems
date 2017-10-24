package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA12502 {


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
               int t = sc.nextInt();
               for(int i=1;i<=t;i++){


                   double a = sc.nextDouble();
                   double b = sc.nextDouble();
                   double c = sc.nextDouble();

                   double avgHrs = (a+b)/3;
                   a = a- avgHrs;
                   b = b - avgHrs;

                   double pay =0;

                   if(b<=0){
                       pay =c;
                   }
                   else if(a<=0){
                       pay =0;
                   }
                   else{

                       pay =(c/(a+b))*a;
                   }

                   System.out.println((int)Math.round(pay));


               }
           }
}
