package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.util.*;

public class UVA371 {



    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);

        while (true){
            long l = sc.nextLong();
            long h = sc.nextLong();



            if(l>h){
                long temp = l;
                l = h;
                h = temp;
            }

            long ans = Long.MIN_VALUE;
            long number = -1;

            if(l==0 && h==0){
                break;
            }


            for(long i=l;i<=h;i++){
                long count =0;

                long n = i;

                while (n!=1){
                    if(n%2==0){
                        n = n/2;
                    }
                    else{
                        n = 3*n+1;
                    }

                    count++;
                }

                if(i==1){
                    count =3;
                }

                if(count>ans){
                    ans = count;
                    number = i;
                }

            }

            System.out.println("Between "+l+" and "+h+", "+number+" generates the longest sequence of "+ans+" values.");

        }

    }





}
