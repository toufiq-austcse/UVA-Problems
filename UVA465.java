package UVA;

import java.math.BigInteger;
import java.util.Scanner;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class UVA465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String s = sc.nextLine();

            BigInteger check = new BigInteger("2147483647");

            if(s.contains("+")){
                String[] part = s.split("\\+");

                BigInteger a = new BigInteger(part[0].trim());
                BigInteger b = new BigInteger(part[1].trim());

             BigInteger res = a.add(b);
                System.out.println(s);

                if(a.compareTo(check) ==1){
                    System.out.println("first number too big");
                }
                if(b.compareTo(check) ==1){
                    System.out.println("second number too big");
                }
                if(res.compareTo(check) ==1){
                    System.out.println("result too big");
                }
            }
            else   if(s.contains("*")){
                String[] part = s.split("\\*");

                BigInteger a = new BigInteger(part[0].trim());
                BigInteger b = new BigInteger(part[1].trim());

                BigInteger res = a.multiply(b);
                System.out.println(s);

                if(a.compareTo(check) ==1){
                    System.out.println("first number too big");
                }
                if(b.compareTo(check) ==1){
                    System.out.println("second number too big");
                }
                if(res.compareTo(check) ==1){
                    System.out.println("result too big");
                }
            }
            }
        }
    }

