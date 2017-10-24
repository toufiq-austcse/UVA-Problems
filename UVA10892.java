package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA10892 {


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
     static long gcd(long a , long b){
    	      if(a%b==0) return b;
    	      return gcd(b,a%b);
     }

     static long lcm(long a,long b){
         //a*b = g*l
         return (a*b)/gcd(a,b);
     }

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        while (true){
            long n = sc.nextInt();
            if(n==0){
                break;
            }

            List<Long> list = new ArrayList<>();

            for(long i=1; i*i<=n;i++){
                if(n%i==0){
                    long res = n/i;

                    list.add(res);
                    if(res!=i){
                        list.add(i);
                    }
                }
            }

            Collections.sort(list);
            int count =0;

            for(long i=0;i<list.size();i++){
                for(long j= i;j<list.size();j++){
                    if(lcm(list.get((int) j),list.get((int) i))==n){
                       count++;
                    }
                }
            }

            System.out.println(n+" "+count);
        }
    }
}
