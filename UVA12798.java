/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;
public class UVA12798 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int total = n;
			
			for(int i=0;i<n;i++){
				boolean flag = false;
				for(int j=0;j<m;j++){
					int a = sc.nextInt();
					if(a==0 && flag== false){
						total--;
						flag = true;
						
					}
				}
			}
			
			System.out.println(total);
				
		}
	}
}
