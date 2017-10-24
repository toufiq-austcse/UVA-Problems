package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 299
 */


					
import java.util.Scanner;

public class UVA299 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int total = 0;
			int l = sc.nextInt();
			int[] arr = new int[l];
			for(int j=0;j<l;j++){
				arr[j] = sc.nextInt();
			}
			
			boolean isSwaped = true;
			while(isSwaped){
				isSwaped = false;
				for(int k=0;k<l-1;k++){
					
					if(arr[k]>arr[k+1]){
						int temp = arr[k+1];
						arr[k+1] = arr[k];
						arr[k] = temp;
						isSwaped = true;
						total++;
					}
				}
			}
			
			System.out.println("Optimal train swapping takes "+total+" swaps.");
		}
	}
}
