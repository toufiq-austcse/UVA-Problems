/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;
public class UVA10656 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int  n = sc.nextInt();
			if(n==0){
				break;
			}
			
			ArrayList<Integer> list = new ArrayList<>();
			boolean flag = false;
			for(int i=0;i<n;i++){
				int a = sc.nextInt();
				if(a!=0){
				list.add (a);
				}
				if(a>0){
					flag = true;
				}
			}
			
			
			
			if(flag){
			for(int i=0;i<list.size();i++){
				
				if(i>0){
					System.out.print(" "+list.get(i));
				}
				else{
					System.out.print(list.get(i));
				}
			
			}
		}
			else{
				System.out.print(0);
			}
			
			System.out.println();
		}
	}
	
}
