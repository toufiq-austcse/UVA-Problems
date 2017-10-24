package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA ,Problem No - 11879
 */


					
import java.math.BigInteger;
import java.util.Scanner;

public class UVA11879 {
	public static void main(String[] arg){
		Scanner sc = new  Scanner(System.in);
		String s = "";
		while(!(s = sc.nextLine()).equals("0")){
		BigInteger big = new BigInteger(s);
		BigInteger v = new BigInteger("17");
		String f = big.remainder(v).toString();
		int rem = Integer.parseInt(f);
		 if(rem == 0){
			 System.out.println("1");
		 }
		 else{
			 System.out.println("0");
		 }
		}
	}

}
