package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Uva 13109
 */


					
import java.util.Arrays;
import java.util.Scanner;

public class UVA13109 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
			int m = sc.nextInt();
			int w = sc.nextInt();
			int[] arr = new int[m];
			for(int j=0;j<m;j++){
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			int total =0;
			int count =0;
			for(int j=0;j<arr.length;j++){
				if((w=w-arr[j])>=0){
					
					count++;
				}
			}
			
			System.out.println(count);
		}
	}

}
