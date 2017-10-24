/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

/*
 * s = (n(n+1))/2;
 * n2 +n-2s =0;
 * the seqn is just like ax2+bx+c;
 * so x = (-b(+-)sqrt(b2-4ac))/2a;
 * so 
 * 
 * n = (sqrt(1+8s)-1)/2;
 * 
 *  ans =(Math.sqrt(1+8*n)-1)/2.0;
 *  
 *  given the sum of nth term we just need to find value of n
 */
import java.util.*;
public class UVA11614 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		
		for(int i=0;i<t;i++){
			long n = sc.nextLong();
			double ans =(Math.sqrt(1+8*n)-1)/2.0;
			long a =(long)ans;
			System.out.println(a);
		}
	}
}
