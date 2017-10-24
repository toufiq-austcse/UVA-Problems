package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA12541 {

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

    public static List<String> getSmallest(List<String> list,int index){
    	      List<String> names = new ArrayList<>();

    	      List<Integer> dates = new ArrayList<>();

    	      for(int i=0;i<list.size();i++){
    	          String s = list.get(i);
    	          String[] part = s.split(" ");

    	          dates.add(Integer.parseInt(part[index]));

              }

              Collections.sort(dates);

        int date = dates.get(0);


        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            String[] part = s.split(" ");

          if(Integer.parseInt(part[index])==date){
              names.add(s);
          }

        }


        return names;
    }

    public static List<String> getLargest(List<String> list,int index){
        List<String> names = new ArrayList<>();

        List<Integer> dates = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            String[] part = s.split(" ");

            dates.add(Integer.parseInt(part[index]));

        }

        Collections.sort(dates);

        int date = dates.get(dates.size()-1);


        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            String[] part = s.split(" ");

            if(Integer.parseInt(part[index])==date){
                names.add(s);
            }

        }


        return names;
    }
           public static void main(String[] args) {
               MyScanner sc  = new MyScanner();
               int n = sc.nextInt();
               List<String> list = new ArrayList<>();

               for(int i=0;i<n;i++){
                   String s = sc.nextLine();

                   list.add(s);


               }
               List<String> small = getSmallest(list,3);

               List<String> smallmonth = getSmallest(small,2);

               List<String> smallday = getSmallest(smallmonth,1);


               List<String> large = getLargest(list,3);

               List<String>largemonth = getLargest(large,2);

               List<String> largeday = getLargest(largemonth,1);


               String[]  youngest = largeday.get(0).split(" ");
               String[] largest = smallday.get(0).split(" ");

               System.out.println(youngest[0]);
               System.out.println(largest[0]);






           }
}
