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
public class UVA444 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while (sc.hasNext()){
           String  s = sc.nextLine();

           if(s.contains("0")||s.contains("1")||s.contains("2")||s.contains("3")||s.contains("4")||s.contains("5")||s.contains("6")||s.contains("7")||s.contains("8")||s.contains("9")){
               String rev = new StringBuilder(s).reverse().toString();

               String temp ="";
               int start =0;
               String out ="";

               while (start<rev.length()){
                    temp+=Character.toString(rev.charAt(start));

                    if(Integer.parseInt(temp)>=100 && Integer.parseInt(temp)<=122){
                        out +=(char)Integer.parseInt(temp);

                        temp ="";
                    }
                    else if(Integer.parseInt(temp)>=32 && Integer.parseInt(temp)<=99){
                        out +=(char)Integer.parseInt(temp);

                        temp ="";
                    }

                    start++;
               }

               System.out.print(out.toString().trim()+"\n");
           }
           else {
               String out = "";

               for (int i = 0; i < s.length(); i++) {
                   int val = (int) s.charAt(i);
                   out += new Integer(val).toString();
               }

               String rev = new StringBuilder(out).reverse().toString();
               System.out.print(rev+"\n");
           }

        }
    }
}
