/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;
public class UVA12527 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int ans =0;
			for(int i=n;i<=m;i++){
				String in = Integer.toString(i);
				boolean flag = false;
				
				for(int j=0;j<in.length();j++){
					for(int k=j+1;k<in.length();k++){
						if(in.charAt(j)==in.charAt(k)){
							flag = true;
						}
					}
				}
				if(!flag){
				ans++;	
				}
			}
			
			System.out.println(ans);
		}
	}
}
