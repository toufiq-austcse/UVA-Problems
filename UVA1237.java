package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA1237 {

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

    static List<String>  containNumber(int n,List<String> list[]){
    	      List<String> names = new ArrayList<>();
    	      for(int i=0;i<list.length;i++){
    	          if(n>=Integer.parseInt(list[i].get(1)) && n<=Integer.parseInt(list[i].get(2))){
    	              names.add( list[i].get(0));
                  }
              }
              return names;
    }
           public static void main(String[] args) {
               MyScanner sc = new MyScanner();
               int t = sc.nextInt();
               while (t-->0){
                   int d = sc.nextInt();
                   List<String>[] list = new ArrayList[d];
                   for(int i=0;i<d;i++){
                       list[i] = new ArrayList<>();
                   }

                   for(int i=0;i<d;i++){
                       String[] part = sc.nextLine().split(" ");

                       list[i].add(part[0]);
                       list[i].add(part[1]);
                       list[i].add(part[2]);
                   }

                   int q = sc.nextInt();
                   for(int j=0;j<q;j++){

                       int p = sc.nextInt();
                      List<String> nm = containNumber(p,list);
                      if(nm.size()>=2 || nm.size()==0){
                          System.out.println("UNDETERMINED");
                      }
                      else{
                          System.out.println(nm.get(0));
                      }

                   }
                   if(t>0){
					   System.out.println();
				   }
               }
           }

}
