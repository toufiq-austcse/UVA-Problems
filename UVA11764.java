package UVA;

/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 11764
 */


					
import java.util.Scanner;

public class UVA11764 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++){
			int l = sc.nextInt();
			int[] arr = new int[l];
			for(int j=0;j<l;j++){
				arr[j] = sc.nextInt();
			}
			int high =0;
			int low =0;
			for(int k =0;k<l-1;k++){
				if(arr[k]<arr[k+1]){
					high++;
				}
				else if (arr[k]>arr[k+1]){
					low++;
				}
			}
			
			System.out.println("Case "+(i+1)+": "+high+" "+low);
		}
	}

}
