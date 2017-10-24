package UVA;

import java.util.List;
import java.io.*;
import java.util.*;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class UVA10098 {

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


    public List<String> permute(char[] input){

    	      Set<Character> set = new TreeSet<>();

    	      for(int i=0;i<input.length;i++){
    	          set.add(input[i]);
              }

              char[] str = new char[set.size()];
              int[] count = new int[set.size()];

             Iterator<Character> it = set.iterator();
             int index =0;
             while (it.hasNext()){
                 char in = it.next();
                 int counter =0;
                 for(int i=0;i<input.length;i++){
                     if(in==input[i]){
                        counter++;
                     }
                 }

                 str[index] = in;
                 count[index] = counter;
                 index++;
             }

             List<String> resultString = new ArrayList<>();
             char[] result = new char[input.length];

             permuteUtil(str,count,resultString,result,0);

             return resultString;

    }

    public void permuteUtil(char[] str, int[] count, List<String> resultString, char[] result, int level) {
        if(level==result.length){
            resultString.add(new String(result));
        }

        for(int i=0;i<str.length;i++){
            if(count[i]==0){
                continue;
            }

            result[level] = str[i];
            count[i]--;

            permuteUtil(str,count,resultString,result,level+1);

            count[i]++;

        }
    }

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            String s = sc.next();
            UVA10098 ob = new UVA10098();
           List<String> list = ob.permute(s.toCharArray());

           for (String string :list){
               System.out.println(string);
           }

           if(i<t){
               System.out.println();
           }
        }
    }

}
