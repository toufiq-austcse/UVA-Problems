package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;

public class UVA673 {


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

    static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.lastElement()=='(' && s.charAt(i)==')'){
                stack.pop();
            }
            else if(!stack.isEmpty() && stack.lastElement()=='[' && s.charAt(i)==']'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
           public static void main(String[] args) {
               MyScanner sc = new MyScanner();
               int n = sc.nextInt();

               for(int i=0;i<n;i++){
                   String s = sc.nextLine();

                   if(isBalanced(s)){
                       System.out.println("Yes");
                   }
                   else{
                       System.out.println("No");
                   }
               }
           }
}
