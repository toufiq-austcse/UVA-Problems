package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 10523
 */

				

import java.math.BigInteger;
import java.util.Scanner;

public class UVA10523 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			BigInteger n = sc.nextBigInteger();
			BigInteger a = sc.nextBigInteger();
			BigInteger sum = new BigInteger("0");
			int val = n.intValue();
			for(int i=1;i<=val;i++){
				sum = sum.add(a.pow(i).multiply(BigInteger.valueOf(i)));
			}
			
			System.out.println(sum);
		}
		
	}
}
