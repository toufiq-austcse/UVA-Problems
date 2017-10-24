/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;

public class UVA12996 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=1;i<=t;i++){
			int n = sc.nextInt();
			int l = sc.nextInt();
			
			int[] mangos = new int[n];
			int[] eatLimit = new int[n];
			int needToEat = 0;
			
			for(int j=0;j<n;j++){
				mangos[j] = sc.nextInt();
				needToEat += mangos[j];
			}
			
			for(int j=0;j<n;j++){
				eatLimit[j] = sc.nextInt();
			}
			
			int total =0;
			for(int j=0;j<n;j++){
				
				if(mangos[j]<=eatLimit[j]){
					total +=mangos[j];
				}
				else{
					total += eatLimit[j];
				}
			}
			
			
			if(total==needToEat && total<=l){
				System.out.println("Case "+i+": Yes");
			}
			else{
				System.out.println("Case "+i+": No");
			}
			
		}
	}
}
