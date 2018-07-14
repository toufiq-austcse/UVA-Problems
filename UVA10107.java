package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.math.*;
import java.util.*;
public class UVA10107 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int count =0;
        while (sc.hasNext()){
            list.add(sc.nextInt());
            Collections.sort(list);

            if(list.size()%2!=0){
                System.out.println(list.get((count/2)));
            }

            else{

                int num1 = list.get(count/2);
                int num2 = list.get((count/2)+1);


                System.out.println((num1+num2)/2);
            }


            count++;
        }

    }

}
