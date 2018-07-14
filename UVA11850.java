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
public class UVA11850 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            if(n==0){
                break;
            }

            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(sc.nextInt());
            }

            Collections.sort(list);

            boolean isPossible = true;
            for(int i=0;i<n-1;i++){
                if(Math.abs(list.get(i)-list.get(i+1))>200){
                    isPossible = false;
                }

                else if(Math.abs(1422-list.get(n-1))*2>200){
                    isPossible = false;
                }

            }

            if(!isPossible){
                System.out.println("IMPOSSIBLE");
            }
            else{
                System.out.println("POSSIBLE");
            }
        }
    }
}
