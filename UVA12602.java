package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;

public class UVA12602 {


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
               int n = sc.nextInt();

             for(int i=0;i<n;i++){
                 String s = sc.nextLine();
                String[] part = s.split("-");

                long valeOfLetter = getvalueOFletters(part[0]);
                long absValueofsecondpart = Math.abs(Integer.parseInt(part[1]));

                long diff = Math.abs(valeOfLetter - absValueofsecondpart);

               //System.out.println(valeOfLetter);

                if(diff<=100){
                    System.out.println("nice");
                }
                else{
                    System.out.println("not nice");
                }
             }
           }

    private static long getvalueOFletters(String s) {

    	      String temp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    	      long sum = 0;
    	      int pow =s.length()-1;

    	      for(int i=0;i<s.length();i++){
    	          sum+= (temp.indexOf(s.charAt(i))*Math.pow(26,pow));
                  pow--;
              }

              return sum;
    }


}
