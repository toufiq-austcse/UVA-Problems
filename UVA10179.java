package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.util.*;
public class UVA10179 {

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


    static int loopPhi(int n){
        int ret = n;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){

                while (n%i==0){
                    n /=i;
                }
                ret -= (ret/i);
            }


        }

        if(n>1){
            ret -=(ret/n);
        }

        return ret;

    }


    public static void main(String[] args) {

        MyScanner sc = new MyScanner();

        while (true){
            int n= sc.nextInt();
            if(n==0){
                break;
            }
            System.out.println(loopPhi(n));
        }
    }
}
