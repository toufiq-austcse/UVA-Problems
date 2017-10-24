package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class UVA11344 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            BigInteger m  = sc.nextBigInteger();
            int numberOfElemenr = sc.nextInt();

            Set<BigInteger> set = new TreeSet<>();
            for(int j=0;j<numberOfElemenr;j++){
                set.add(sc.nextBigInteger());
            }

            Iterator<BigInteger> it = set.iterator();
            boolean isDIvisibleByAllElement = true;
            while (it.hasNext()){
                BigInteger a = it.next();
                if(!m.mod(a).equals(BigInteger.ZERO)){
                    isDIvisibleByAllElement = false;
                    break;
                }

            }

            if(isDIvisibleByAllElement){
                System.out.println(m+" - Wonderful.");
            }
            else{
                System.out.println(m+" - Simple.");
            }
        }
    }
}
