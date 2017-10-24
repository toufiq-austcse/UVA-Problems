package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA12459 {


           public static void main(String[] args) {
              Scanner sc  = new Scanner(System.in);



              while (sc.hasNext()){
                  int n = sc.nextInt();
                  if(n==0){
                      break;
                  }

                  long a = 1;
                  long b = 2;

                  if(n==1){
                      System.out.println(a);
                  }
                 else if(n==2){
                      System.out.println(b);
                  }

                  else{


                      for(int i=3;i<=n;i++){
                          long temp = a+b;
                          a=b;
                          b = temp;
                      }
                      System.out.println(b);
                  }


              }
           }
}
