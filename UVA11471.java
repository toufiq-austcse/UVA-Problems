/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;
public class UVA11471 {
	
	static int GCD(int a,int b){
		if(a%b==0)
			return b;
		return GCD(b,a%b);
	}
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			int g=0;
			
			for(int i=1;i<=n;i++){
				for(int j=i+1;j<=n;j++){
					g += GCD(i, j);
					
				}
			}
			
			
			System.out.println(g);
		}
	}

}
