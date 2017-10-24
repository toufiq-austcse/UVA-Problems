package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA1727 {


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

    static int NumberOfWekend(String firstDay,int numberOFdaysOnThatMonth){
    	     List<String> list = new ArrayList<>();
    	     list.add("SUN");
             list.add("MON");
             list.add("TUE");
             list.add("WED");
             list.add("THU");
             list.add("FRI");
             list.add("SAT");

             int start = list.indexOf(new String(firstDay));
             int totaldays=1;
             int count =0;


                 for (int i = start; totaldays<= numberOFdaysOnThatMonth; i++) {
                     if (list.get(i) == "FRI" || list.get(i) == "SAT") {
                         count++;
                       //  System.out.println("i "+i);
                     }
                         totaldays++;
                         if(i==6){
                             i=-1;
                         }

                     }

                     return count;
                 }


           public static void main(String[] args) {
               MyScanner sc = new MyScanner();
               int t = sc.nextInt();
               HashMap<String,Integer> map = new HashMap<>();

               map.put("JAN",31);
               map.put("FEB",28);
               map.put("MAR",31);
               map.put("APR",30);
               map.put("MAY",31);
               map.put("JUN",30);
               map.put("JUL",31);
               map.put("AUG",31);
               map.put("SEP",30);
               map.put("OCT",31);
               map.put("NOV",30);
               map.put("DEC",31);

               for(int i=0;i<t;i++){
                   String[] in = sc.nextLine().split(" ");
                   System.out.println(NumberOfWekend(in[1],map.get(in[0])));
               }











           }
}
