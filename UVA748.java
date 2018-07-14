package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
import java.math.*;
public class UVA748 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            BigDecimal a = sc.nextBigDecimal();
            int n = sc.nextInt();

            BigDecimal ans = a.pow(n).stripTrailingZeros();
            String ansString = ans.toPlainString();


           int i=0;
           while (i<ansString.length()){
               if(ansString.charAt(i)!='0'){
                   break;
               }

               i++;
           }
         //   System.out.println(i);
            System.out.println(ansString.substring(i));


        }
    }
}
