package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 *
 * UVA ,Problem No 424
 */


					
import java.math.BigInteger;
import java.util.Scanner;

public class UVA424 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String s ="";
		BigInteger sum = new BigInteger("0");
		while(!(s =sc.nextLine()).equals("0")){
			BigInteger a = new BigInteger(s);
			 sum = sum.add(a);
			
		}
		System.out.println(sum.toString());
	}
}
