package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class UVA10183
{


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

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (true) {
                BigInteger a = in.nextBigInteger();
                BigInteger b = in.nextBigInteger();

                if(a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO)){
                    break;
                }
                System.out.println(numberOfFebonacci(a,b));
            }

        }


        static long numberOfFebonacci(BigInteger a, BigInteger b) {

            BigInteger f1 = BigInteger.valueOf(0);
            BigInteger f2 = BigInteger.valueOf(1);
            BigInteger f3 = BigInteger.valueOf(1);

            long result =0;
            while (f3.compareTo(b)==-1 || f3.compareTo(b)==0){
                if(f3.compareTo(a)==1 || f3.compareTo(a)==0){
                    result++;
                    //System.out.println(f3);
                }

                f1 = f2;
                f2 = f3;
                f3 = f1.add(f2);
               // System.out.println(f3);
            }

            return result;
        }



}
