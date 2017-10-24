package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA10324 {



    static boolean isSame(int i,int j,String s){
    	      for(int l=i;l<j;l++){
    	          if(s.charAt(l)!=s.charAt(l+1)){
    	              return false;
                  }
              }

              return true;
    }
           public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int c =1;

               while (sc.hasNext()){
                   String s = sc.next();
                   int n = sc.nextInt();

                   System.out.println("Case "+c+":");
                  for(int i=0;i<n;i++){
                      int a = sc.nextInt();
                      int b = sc.nextInt();

                      if(isSame(Math.min(a,b),Math.max(a,b),s)){
                          System.out.println("Yes");
                      }
                      else{
                          System.out.println("No");
                      }
                  }
                  c++;
               }

           }
}
