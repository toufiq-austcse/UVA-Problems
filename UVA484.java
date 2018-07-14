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
public class UVA484 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Map<Integer,Integer> map = new LinkedHashMap<>();
        Set<Integer> set = new LinkedHashSet<>();

        while (sc.hasNext()){
            int n = sc.nextInt();
            set.add(n);

           /* if(n==544){
                break;
            }*/

            if(map.containsKey(n)){
                int temp = map.get(n)+1;
                map.put(n,temp);
            }
            else{
                map.put(n,1);
            }
        }

       Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            int temp = it.next();
            System.out.println(temp+" "+map.get(temp));
        }


    }



}
