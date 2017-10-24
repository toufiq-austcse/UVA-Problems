package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA,Problem No 11462
 *
 */


					
import java.util.Arrays;
import java.util.Scanner;

public class UVA11462 {

	public static void main(String[] arg)  {
		Scanner sc = new Scanner(System.in);
		int n;
		while( (n = sc.nextInt())!=0){
		int [] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			if(i==n-1){
				System.out.print(a[i]);
			}
			else{
			System.out.print(a[i]+" ");
			}
		}
		System.out.println();
	}
	}
}
