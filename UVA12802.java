/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.Scanner;

public class UVA12802 {

	static boolean isPrime(int n){
		if(n<=1){
			return true;
		}
		for(int i=2;i*i<=n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			String s = Integer.toString(a);
			
			StringBuffer rev = new StringBuffer(s).reverse();
			
			//System.out.println(isPrime(a)+" "+s.equals(rev.toString()));
			//System.out.println("A "+a+"  "+"rev "+rev);
			if(s.equals(rev.toString()) && isPrime(a)){
				long ans = a*2;
				System.out.println(ans);
				break;
			}
			else{
				long ans = a*2;
				System.out.println(ans);
			}
		}
	}
}
