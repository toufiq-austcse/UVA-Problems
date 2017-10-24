package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * Uva,Problem No - 10106
 */


					

import java.math.BigInteger;
import java.util.Scanner;

public class UVA10106 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		BigInteger x = new BigInteger(sc.nextLine());
		BigInteger y = new BigInteger(sc.nextLine());
		System.out.println(x.multiply(y));
		}
	}

}
