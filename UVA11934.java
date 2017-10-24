package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA ,Problem No - 11934
 */

import java.util.Scanner;

public class UVA11934 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while( true){
			long a = sc.nextLong() ;
			long b  = sc.nextLong();
			long c  = sc.nextLong();
			long d  = sc.nextLong();
			long l  = sc.nextLong();
			if(a==0 && b==0 && c==0 && d==0 && l==0){
				break;
			}

			long total =0;
			
			for(long i=0;i<=l;i++){
				long temp = a*i*i+b*i+c;
				if(temp%d==0){
					total++;
				}
			}
			
			System.out.println(total);
		}
		
		
		
	}

}
