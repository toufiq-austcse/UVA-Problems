package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.util.*;
public class UVA914 {

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
    static boolean[] primeNumbers(int n){
    	      boolean[] isPrime = new boolean[n+1];

    	      for(int i=0;i<isPrime.length;i++){
    	          isPrime[i] = true;
              }

        isPrime[0] = isPrime[1] = false;

              for(int i=2;i*i<=n;i++){
    	          if(isPrime[i]){
    	              for(int j = i*2;j<=n;j+=i){
    	                  isPrime[j] = false;
                      }
                  }
              }
              isPrime[0] = false;

              return isPrime;
    }

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        boolean[] isPrime = primeNumbers(1000000);

        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            int l = sc.nextInt();
            int u = sc.nextInt();

            List<Integer> list = new ArrayList<>();

            for(int j=l;j<=u;j++){
                if(isPrime[j]){
                    list.add(j);
                }
            }



                List<Integer> difference = new ArrayList<>();
                int[] arr = new int[114 + 1];

                for (int j = 0; j < list.size() - 1; j++) {
                    int diff = (Math.abs(list.get(j) - list.get(j + 1)));
                    arr[diff]++;
                }

                boolean isNo = false;

                int max = 0;
                int maxIndex = 0;

                boolean flag = true;

                for (int j = 0; j < arr.length; j++) {
                    if(max==arr[j] && arr[j]!=0){
                        flag = false;
                    }

                    if(arr[j]>max){
                        max = arr[j];
                        maxIndex = j;
                        flag = true;

                    }
                }

                if(flag && max!=0){
                    System.out.println("The jumping champion is "+maxIndex);
                }
                else{
                    System.out.println("No jumping champion");
                }

                


            }

        }



}
