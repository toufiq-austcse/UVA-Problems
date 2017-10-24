package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *UVA 10222
 */

import java.util.Scanner;

public class UVA11799 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
			int max = -1;
			int n = sc.nextInt();
			for(int j=0;j<n;j++){
				int a = sc.nextInt();
				if(a>max){
					max = a;
				}
			}
			
			System.out.println("Case "+i+": "+max);
		}
	}
}
