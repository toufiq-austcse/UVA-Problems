/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;
public class UVA12157 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =1;i<=t;i++){
			int n = sc.nextInt();
			int[] calls = new int[n];
			int[] temp = new int[n];
			for(int j=0;j<n;j++){
				calls[j]= sc.nextInt();
				temp[j] = calls[j];
			}
			
			int mile =0;
			int juice =0;
			
			
			for(int j=0;j<n;j++){
				while(calls[j]>=0){
					mile += 10;
					calls[j] -=30;
				}
			}
			
			for(int j=0;j<n;j++){
				while(temp[j]>=0){
					juice += 15;
					temp[j] -=60;
				}
			}
			
			
			if(mile<juice){
				System.out.println("Case "+i+": Mile "+mile);
			}
			else if(juice<mile){
				System.out.println("Case "+i+": Juice "+juice);
			}
			else{
				System.out.println("Case "+i+": Mile Juice "+mile);
			}
			
			
		}
	}
}
