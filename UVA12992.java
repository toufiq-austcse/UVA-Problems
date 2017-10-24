package UVA;

import java.util.Scanner;

/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA ,Problem No -12992
 */


					

public class UVA12992 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0 ;i<n;i++){
			int a = sc.nextInt();
			System.out.println("Case "+"#"+(i+1)+": "+(2*a-1));
		}
	}
}
