/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.Scanner;

public class UVA100 {

	static int calculate(int n){
		int count =1;
		while(n!=1){
			if(n%2==0){
				n = n/2;
			}
			else{
				n = 3*n+1;
			}
			count++;
		}
		return count;
	}
	
	public static void main(String[] arg){
		Scanner sc = new  Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int max =0;
			int x,y;
			if(a<b){
				x= a;
				y = b;
			}
			else{
				x = b;
				y = a;
			}
			for(int i=x;i<=y;i++){
			   int cycle = calculate(i);
			   if(cycle>max){
				   max = cycle;
			   }
			}
			
			System.out.println(a+" "+b+" "+max);
		}
	}
}
