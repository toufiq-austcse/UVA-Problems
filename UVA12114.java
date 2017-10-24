/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;
public class UVA12114 {

	public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	int c =1;
	while(true){
		
		int b = sc.nextInt();
		int s = sc.nextInt();
		if (b==0 && s==0){
			break;
		}
		
		  if(b<=1){
				System.out.println("Case "+c+": "+":-\\");
			}
		  
		  else if(b<=s){
			System.out.println("Case "+c+": "+":-|");
		}
		else if(b>s){
			System.out.println("Case "+c+": "+":-(");
		}
		
	  
		c++;
		
	}
	}
}
