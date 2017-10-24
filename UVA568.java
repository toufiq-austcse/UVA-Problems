package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 568
 */

				
import java.math.BigInteger;

import java.util.Scanner;

public class UVA568 {

	public static void main(String[] arg){
		Scanner sc = new Scanner( System.in);
		while(sc.hasNext()){
		int n = sc.nextInt();
		
		BigInteger f1 = new BigInteger("1");
		
		for(int i=2;i<=n;i++){
			f1 = f1.multiply(BigInteger.valueOf(i));
		}
		
		String s = f1.toString();
		int len = f1.toString().length();
		int j;
		//int pos=0;
		for( j=len-1;j>=1;j--){
			if(s.charAt(j)!='0'){
				//System.out.println(s.charAt(j));
				//pos = j;
				break;
			}
		}
		
		for(int k=1;k<=5- Integer.toString(n).length();k++){
			System.out.print(" ");
		}
		System.out.print(n+" -> "+s.charAt(j));
		System.out.println();
		
		}
	}
}
