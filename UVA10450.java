/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;

public class UVA10450 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
			int n= sc.nextInt();
			long a = 2;
			long b = 3;
			if(n==1){
				System.out.println("Scenario #"+i+":");
				System.out.println(a);
			}
			else if(n==2){
				System.out.println("Scenario #"+i+":");
				System.out.println(b);
			}
			else{
				for(int j=3;j<=n;j++){
					long temp = a;
					a = b;
					b = temp+b;
				}
				System.out.println("Scenario #"+i+":");
				System.out.println(b);
			}
			if(t!=1){
			System.out.println();
			}
		}
		
	}
}
