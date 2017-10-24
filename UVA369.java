/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.math.BigInteger;
import java.util.*;
public class UVA369 {
	
	
	public static void main(String[] arg){
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n==0 && m==0){
				break;
			}
			
			
			
			BigInteger M = BigInteger.ONE;
			BigInteger N = BigInteger.ONE;
			int temp = n-m;
			
			BigInteger sub = BigInteger.ONE;
			
			for(int i=2;i<=m;i++){
				M = M.multiply(new BigInteger(String.valueOf(i)));
			}
			for(int i=2;i<=n;i++){
				N = N.multiply(new BigInteger(String.valueOf(i)));
			}
			for(int i=2;i<=temp;i++){
				sub= sub.multiply(new BigInteger(String.valueOf(i)));
			}
			

			BigInteger mul = sub.multiply(M);
			BigInteger ans = N.divide(mul);
			System.out.println(n+" things taken "+m+" at a time is "+ans+" exactly.");
			

		}
	}

}
