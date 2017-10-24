package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA 12646
 */

import java.util.Scanner;

public class UVA12646 {

	public static void main(String[] arg){
		Scanner sc = new  Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			 if(a==b && b==c) {
					System.out.println("*");
				}
			 else 
			if(a==b){
				System.out.println("C");
			}
			else if(a==c){
				System.out.println("B");
			}
			else if(b == c){
				System.out.println("A");
			}
		
		}
	}
}
