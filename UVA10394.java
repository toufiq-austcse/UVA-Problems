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
public class UVA10394 {
    static boolean[] sieveOfEratosthenes(int n ) {
        boolean[] isPrime = new boolean[n + 1];

        /*A value in prime[i] will finally be false
          if it is not prime.
        */

        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }

        //ekti sonkha kake kake vag kore tar track trakhbo

        for (int i = 2; i * i <= n; i++) {

            if (isPrime[i] == true) {
                for (int j = i * 2; j <= n; j += i) {
                    /*
                     gunitok gula newa hobe..such as 4,6,8... or 3,6,9....
                      karon ekti sonkha only tar gunitok gulare vag korbe
                     */
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    static boolean isValid(List<Integer> list){
        if(list.get(0)+2==list.get(1)){
            return true;
        }

        return false;
    }

static class pair{
        int a;
        int b;

    public pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] isPrime = sieveOfEratosthenes(20000000);

        int count = 0;
        int start = 2;

        List<pair> list = new ArrayList<>();


        List<Integer> integr = new ArrayList<>();

        for (int i = 2; i < isPrime.length; i++) {

            if (isPrime[i]) {
                integr.add(i);
            }

            if (integr.size() == 2) {
                if(isValid(integr))
                    list.add(new pair(integr.get(0),integr.get(1)));


                i -=1;
                integr.clear();
            }



          //  System.out.println("i " +i);

        }


        while (sc.hasNext()) {
            int n = sc.nextInt();


            System.out.println("("+list.get(n-1).getA()+", "+list.get(n-1).getB()+")");
        }


    }

}
