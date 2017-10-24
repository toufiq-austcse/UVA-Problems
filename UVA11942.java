package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA 11942
 */

import java.util.Arrays;
import java.util.Scanner;

public class UVA11942 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		System.out.println("Lumberjacks:");
		for(int i=0;i<t;i++){
			int[] arr = new int[10];
			int[] dup = new int [10];
			for(int j=0;j<arr.length;j++){
				arr[j] = sc.nextInt();
				
			}
			
			boolean isInorder = true;
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					continue;
				}
				else{
					isInorder = false;
					break;
				}
			}
			if(isInorder){
				System.out.println("Ordered");
			}
			if(!isInorder){
				boolean revInorder = true;
				for(int j=0;j<arr.length-1;j++){
					if(arr[j]>arr[j+1]){
						continue;
					}
					else{
						revInorder = false;
						break;
					}
				}
				
				if(revInorder){
					System.out.println("Ordered");
				}
				else{
					System.out.println("Unordered");
				}
				
			}
			
			
		}
	}

}
