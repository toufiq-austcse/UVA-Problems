package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.util.*;
public class UVA543 {


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

    static boolean[] sieve(int n ){
    	      boolean[] isPrime = new boolean[n+1];

    	      for(int i=0;i<isPrime.length;i++){
    	          isPrime[i] = true;
              }
              isPrime[0] = false;
        isPrime[1] = false;


              for(int i=2;i*i<=n;i++){

    	          if(isPrime[i]){
    	              for(int j=2*i;j<=n;j+=i){
    	                  isPrime[j] = false;
                      }
                  }
              }
              isPrime[2] =false;

              return isPrime;
    }
           public static void main(String[] args) {
               MyScanner  sc =  new MyScanner();
               while(true){
                   int n = sc.nextInt();
                   if(n==0){
                       break;
                   }

                   boolean[] primes = sieve(n);

                   int a = 0;
                   int b = 0;

                   for(int i=3;i<n;i++){
                       if(primes[i]){
                          int temp = n-i;

                          if(primes[temp]){
                              a = i;
                              b = temp;
                              break;
                          }
                       }
                   }


                       System.out.println(n+" = "+a+" + "+b);
                   }

           }
}
