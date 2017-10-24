/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;
public class UVA12751 {

	public static void main(String[] arg){
		Scanner sc = new  Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=1;i<=t;i++){
			int n= sc.nextInt();
			int k = sc.nextInt();
			int x = sc.nextInt();
			
			List<Integer> list = new ArrayList<>();
			
			for(int j=1;j<=n;j++){
				list.add(j);
			}
			
			
			
			int count =0;
			while(count!=k){
				list.remove(x-1);
				count++;
			}
          
			int sum =0;
			for(int j=0;j<list.size();j++){
				sum += list.get(j);
			}

			System.out.println("Case "+i+": "+sum);
			
			
		}
	}
}
