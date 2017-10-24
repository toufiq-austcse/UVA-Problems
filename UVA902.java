/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UVA902 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNextInt()){
		List<String> list = new ArrayList<>();
		int n = sc.nextInt();
		String s = sc.next();
		
		int i=0;
		while(i<=s.length()-n){
			list.add(s.substring(i, i+n));
			i++;
		}
		int max =0;
		String ans ="";
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int j=0;j<list.size();j++){
			if(map.get(list.get(j))==null){
				map.put(list.get(j), 1);
			}
			
			else{
				int a = map.get(list.get(j));
				a++;
				map.put(list.get(j),a);
				if(a>max){
					max = a;
					ans = list.get(j);
				}
			}
		}
		
		System.out.println(ans);
		
		
		
		}
	}
}
