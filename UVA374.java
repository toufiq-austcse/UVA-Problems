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
public class UVA374 {

	public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	
	while(sc.hasNext()){
		
	BigInteger	B=sc.nextBigInteger();
	BigInteger	P=sc.nextBigInteger();
	BigInteger	M=sc.nextBigInteger();
		
	BigInteger out = B.modPow(P, M);
	System.out.println(out);
	}
	
	
	}
}
