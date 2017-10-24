/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;
public class UVA488 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			if(i>0){
			System.out.println();
			}
			int a = sc.nextInt();
			int f = sc.nextInt();
			
			for(int j=0;j<f;j++){
				for(int k=1;k<=a;k++){
					for(int l=1;l<=k;l++){
						System.out.print(k);
					}
					System.out.println();
				}
				
				for(int k=a-1;k>=1;k--){
					for(int l=1;l<=k;l++){
						System.out.print(k);
					}
					
					System.out.println();
					
				}
				if(j!=f-1)
				System.out.println();
				
			}
			
			
			
		}
	}
}
