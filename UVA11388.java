/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;
public class UVA11388 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(b%a==0){
				System.out.println(a+" "+b);
			}
			else{
				System.out.println(-1);
			}
			
		}
		
	}
}
