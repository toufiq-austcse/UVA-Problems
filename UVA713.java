/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.math.BigInteger;
import java.util.*;
public class UVA713 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//sc.nextLine();
		for(int i=0;i<n;i++){
			String a = sc.next();
			String b = sc.next();
			
			StringBuffer revA = new StringBuffer(a).reverse();
			StringBuffer revB = new StringBuffer(b).reverse();
			
			
		    BigInteger A = new BigInteger(revA.toString());
		    BigInteger B = new BigInteger(revB.toString());
		    
		    BigInteger ans = A.add(B);
		    StringBuffer revans = new StringBuffer(ans.toString()).reverse();
		   
		    String finalnas = revans.toString();
		    BigInteger ses = new BigInteger(finalnas);
		    
		    System.out.println(ses);
		    }
		
	}
}
