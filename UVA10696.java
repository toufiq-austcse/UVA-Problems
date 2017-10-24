/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.Scanner;

public class UVA10696 {

	public static void main(String[] arg){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			if(n<=100){
				System.out.println("f91("+n+") = "+91);
			}
			else{
				System.out.println("f91("+n+") = "+(n-10));
			}
		}
	}
}
