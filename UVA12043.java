package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.util.*;
public class UVA12043 {


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

            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();

            long[] arr = calculate(a, b,k);
            System.out.println(arr[0]+" "+arr[1]);
        }
    }

    public static long[] calculate(int a, int b, int k) {
    	      long totalNumberofDivisors =0;
    	      long sumOFDivisors =0;

    	      for(int i=a;i<=b;i++){
    	          if(i%k==0){
    	              Set<Integer> set = divisorsSet(i);

                      totalNumberofDivisors +=set.size();
                      Iterator<Integer> it = set.iterator();
                      while (it.hasNext()){
                          sumOFDivisors += it.next();
                      }
                  }
              }

             long[] arr = new long[2];
        arr[0] = totalNumberofDivisors;
        arr[1] = sumOFDivisors;
        return arr;
    }

    public static Set<Integer> divisorsSet(int i) {
    	     Set<Integer> divisors = new TreeSet<>();

    	      for(int j=1;j*j<=i;j++){
    	          if(i%j==0){
    	              int a = i/j;
    	              divisors.add(a);
    	              divisors.add(j);
                  }
              }

              return divisors;
    }


}
