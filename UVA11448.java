package UVA;

import java.math.BigInteger;
import java.util.Scanner;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 11448
 */


					
public class UVA11448 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
			BigInteger f1 = sc.nextBigInteger();
			BigInteger f2 = sc.nextBigInteger();
			BigInteger res = f1.subtract(f2);
			System.out.println(res);
		}
	}

}
