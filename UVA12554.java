/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

package UVA;

import java.util.*;

public class UVA12554 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String[] arr = { "Happy", "birthday", "to", "you", "Happy", "birthday", "to", "you", "Happy", "birthday", "to",
				"Rujia", "Happy", "birthday", "to", "you" };

		int n = sc.nextInt();
		String[] a = new String[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {

			a[i] = sc.nextLine();

		}

		int count = 0;
		int total = 0;

		if (n <= 16) {
			for (int i = 0; i < n; i++) {
				total++;

				System.out.println(a[i] + ": " + arr[count++]);
				if (i == n - 1 && total != arr.length) {
					i = -1;
				}
				if (count == 16) {
					break;
				}

			}

		}
		
		else{
			
			for(int i=0;i<n;i++){
				System.out.println(a[i]+": "+arr[count++]);
				
				if(count==16){
					count =0;
				}
				
				
				
			}
			
			
			for(int i=0;i<n;i++){
				System.out.println(a[i]+": "+arr[count++]);
				
				if(count==16){
					break;
				}
			}
			
			
		}

	}
}