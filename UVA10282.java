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
public class UVA10282 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


        Map<String,String> map = new HashMap<>();
        while (true){
            String line = in.readLine();

           // System.out.println(line.length());
            if(line.length()==0){
                break;
            }
            String[] arr = line.split(" ");
            map.put(arr[1],arr[0]);
        }

        String q ="";
        while ((q=in.readLine())!=null){
            if(!map.containsKey(q)){
                System.out.println("eh");
            }
            else {
               System.out.println(map.get(q));
            }
        }

    }


}
