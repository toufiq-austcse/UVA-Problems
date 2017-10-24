package UVA;



import java.io.*;
import java.util.*;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class UVA10338 {

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
       MyScanner in = new MyScanner();

       // InputReader in = new InputReader(System.in);
       // OutputWriter out = new OutputWriter(System.out);

        int t = in.nextInt();


        for (int l = 1; l <= t; l++) {

            String s = in.next();
           // System.out.println(s);
            List<Integer> list = new ArrayList<>();
            Set<Character> set = new TreeSet<>();

            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }

            Iterator<Character> it = set.iterator();

            while (it.hasNext()) {
                int count = 0;
                char a = it.next();

                for (int i = 0; i < s.length(); i++) {
                    if (a == s.charAt(i)) {
                        count++;
                    }
                }

                if (count > 1) {
                    list.add(count);
                }
            }

            long total = 1;

            for (int i = 0; i < list.size(); i++) {
                total = total * factorial(list.get(i));
            }

            long ans = factorial(s.length()) / total;

            System.out.println("Data set " + l + ": " + ans);

        }
    }
    static long factorial(int n) {
        long total = 1;

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }

        return total;
    }
    }

