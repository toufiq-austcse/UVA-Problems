package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA,Problem No 10929
 */


					
import java.math.BigInteger;
import java.util.Scanner;

public class UVA10929 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String s ="";
		while(!(s= sc.nextLine()).equals("0")){
			BigInteger big = new BigInteger(s);
			BigInteger rem = new BigInteger("11");
			String temp = big.remainder(rem).toString();
			if(temp.equals("0")){
				System.out.println(s+" is a multiple of 11.");
			}
			else{
				System.out.println(s+" is not a multiple of 11.");
			}
			
		}
	}

}
