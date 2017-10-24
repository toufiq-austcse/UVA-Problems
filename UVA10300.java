/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;
public class UVA10300 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++){
			int f = sc.nextInt();
			
			int[] farmYard = new int[f];
			int[] animalNmbr = new int[f];
			int[] ef = new int[f];
			
			for(int j=0;j<f;j++){
				farmYard[j] = sc.nextInt();
				animalNmbr[j] = sc.nextInt();
				ef[j] = sc.nextInt();
			}
			
			long total =0;
			for(int j=0;j<f;j++){
			
				
				total += farmYard[j]*ef[j];
				
				
			}
			
			System.out.println(total);
			
			
		}
	}
}
