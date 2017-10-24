package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 10784
 */

				

import java.util.Scanner;
/*
 * Basic Formula: Number of diagonal in N-gon is (N * (N-3) ) / 2.
    U are given the right portion of the equation, now u have to find the value of N.
  Suppose, Given value X
  (N * (N-3) ) / 2 = X;
  after solution,
  N = (3+sqrt(9+8X))/2;
 */

public class UVA10784 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int i=1;
		while(true){
			long n = sc.nextLong();
			if(n==0){
				break;
			}
			double sqrtVal = Math.ceil(Math.sqrt(9+8*n));
			int result = (int) Math.ceil(((3+sqrtVal)/2));
			
			System.out.println("Case "+(i++)+": "+result);
			
			
		}
	}

}
