/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;
public class UVA10302 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long x = sc.nextLong();
			long total =0;
			for(long i=1;i<=x;i++){
				
				total += i*i*i;
			}
			System.out.println(total);
		}
	}
}
