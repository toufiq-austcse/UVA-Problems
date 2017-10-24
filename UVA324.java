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
public class UVA324 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
           int  n =sc.nextInt();
           if(n==0){
               break;
           }


            String factorialVal = findVal (n);
           int[] arr = new int[10];

           for(int i=0;i<factorialVal.length();i++){
               if(factorialVal.charAt(i)=='0'){
                   arr[0]++;
               }
               else if(factorialVal.charAt(i)=='1'){
                   arr[1]++;
               }
               else if(factorialVal.charAt(i)=='2'){
                   arr[2]++;
               }
               else if(factorialVal.charAt(i)=='3'){
                   arr[3]++;
               }
               else if(factorialVal.charAt(i)=='4'){
                   arr[4]++;
               }
               else if(factorialVal.charAt(i)=='5'){
                   arr[5]++;
               }
               else if(factorialVal.charAt(i)=='6'){
                   arr[6]++;
               }else if(factorialVal.charAt(i)=='7'){
                   arr[7]++;
               }else if(factorialVal.charAt(i)=='8'){
                   arr[8]++;
               }
               else if(factorialVal.charAt(i)=='9'){
                   arr[9]++;
               }


           }
            System.out.println(n+"! --");
            for(int i=0;i<=4;i++){
                System.out.print("   ");
                System.out.print("("+i+")");
                System.out.print("   ");
                System.out.print(arr[i]);
            }
            System.out.println();
            for(int i=5;i<=9;i++){
                System.out.print("   ");
                System.out.print("("+i+")");
                System.out.print("   ");
                System.out.print(arr[i]);
            }
            System.out.println();

        }
    }

    public static String findVal(int n) {

      BigInteger res =BigInteger.ONE;

     for(int i=2;i<=n;i++){
         res = res.multiply(new BigInteger(Integer.toString(i)));
     }

     return res.toString();
    }
}
