package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *UVA 11455
 */


					

import java.util.Arrays;
import java.util.Scanner;

public class UVA11455 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int[] a = new int[4];
			for(int j=0;j<a.length;j++){
				a[j] = sc.nextInt();
			}
			
			if(a[0]==a[1] && a[1] == a[2] && a[2]==a[3]){
				System.out.println("square");
			}
			else{
				Arrays.sort(a);
				if(a[0]==a[1] && a[2]==a[3]){
					System.out.println("rectangle");
				}
				else if(a[0]+a[1]+a[2]>a[3]){
					System.out.println("quadrangle");
				}
				else{
					System.out.println("banana");
				}
			}
		}
	}

}
