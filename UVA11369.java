/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;
public class UVA11369 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			for(int j=0;j<n;j++){
				list.add(sc.nextInt());
			}
			
			Collections.sort(list);
			int discount = 0;
			int count=0;
			
			for(int j= list.size()-1;j>=0;j--){
				count ++;
				if(count==3){
					discount += list.get(j);
					count =0;
				}
			}
			
			System.out.println(discount);
		}
	}
}
