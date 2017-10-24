/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;

public class UVA11900 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=1;i<=t;i++){
			int n = sc.nextInt();
			int p = sc.nextInt();
			int q = sc.nextInt();
			int arr[] = new int[n];
			
			for(int j=0;j<n;j++){
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			int totalEgg=0;
			int totalGm = 0;
			int l=0;
			while(true){
				if(totalEgg>=p || totalGm>=q){
					break;
				}
				
				totalEgg ++;
				totalGm += arr[l];
				l++;
				System.out.println(totalGm);
			}
			
		//	System.out.println(totalEgg);
			
		}
		
	}

	
}
