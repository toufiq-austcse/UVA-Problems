package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA 12372
 */

import java.util.Scanner;

public class UVA12372 {
public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for(int i=1;i<=t;i++){
		int l =sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		if(l>20 || w>20 || h>20){
			System.out.println("Case "+i+": "+"bad");
		}
		else{
			System.out.println("Case "+i+": "+"good");
		}
	}
}
}
