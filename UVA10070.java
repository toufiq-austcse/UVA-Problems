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
public class UVA10070 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger fourBigInteger = new BigInteger(String.valueOf("4"));
        BigInteger hundredBigInteger = new BigInteger(String.valueOf("100"));
        BigInteger FourHundredBigInteger = new BigInteger(String.valueOf("400"));
        BigInteger huluchuluBigInteger = new BigInteger(String.valueOf("15"));
        BigInteger bulukuluBigInteger = new BigInteger(String.valueOf("55"));

        boolean isFirst = true;
        while (sc.hasNext()){
            if(!isFirst){
                System.out.println();
            }
            isFirst = false;
            boolean isleapYear = false;
            boolean isHuluchuclu = false;
            boolean isBuluchulu = false;
            BigInteger year = sc.nextBigInteger();
           if((year.mod(fourBigInteger).compareTo(BigInteger.ZERO)==0)&&(year.mod(hundredBigInteger).compareTo(BigInteger.ZERO)!=0) || (year.mod(FourHundredBigInteger).compareTo(BigInteger.ZERO)==0)){
               System.out.println("This is leap year.");
               isleapYear = true;
           }

           if((year.mod(huluchuluBigInteger).compareTo(BigInteger.ZERO)==0)){
               System.out.println("This is huluculu festival year.");
               isHuluchuclu = true;
           }

            if(isleapYear &&(year.mod(bulukuluBigInteger).compareTo(BigInteger.ZERO)==0)){
                System.out.println("This is bulukulu festival year.");
                isBuluchulu = true;
            }

            if(!isBuluchulu && !isleapYear && !isHuluchuclu){
                System.out.println("This is an ordinary year.");
            }


        }
    }


}
