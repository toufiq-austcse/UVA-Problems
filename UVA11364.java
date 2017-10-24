package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 11364
 */

				
import java.util.Arrays;
import java.util.Scanner;

public class UVA11364 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			int[] arr  = new int[n];
			for(int j=0;j<n;j++){
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			int res = (arr [n-1] - arr[0])*2;
			
			System.out.println(res);
			}
	}
}
