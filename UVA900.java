package UVA;

import java.util.Scanner;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 900
 */

				
public class UVA900 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			int a =1;
			int b =2;
			if(n==1){
				System.out.println("1");
			}
			else if(n==2){
				System.out.println("2");
			}
			else{
			int total =0;
			for(int i=3;i<=n;i++){
				
				total =a+b;
				a=b;
				b=total;
				
			}
			System.out.println(total);
			}
		}
		
		
	}
	

}
