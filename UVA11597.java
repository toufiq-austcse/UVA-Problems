package UVA;

import java.util.Scanner;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA ,11597
 */


					
public class UVA11597 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		long i=1;
		while(true){
			long n = sc.nextLong();
			if(n==0){
				break;
			}
			long res = n/2;
			System.out.println("Case "+i+": "+ res);
			i++;
		}
	}

}
