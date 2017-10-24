package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 11877 
 */


					
import java.util.Scanner;

public class UVA11877 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n;
		while((n = sc.nextInt())!=0){
			
			int total =0;
			while(n>=3){
				total+= n/3;
				n = n/3 + n%3;
				if(n==2){
					n = n+1;
				}
				
			}
			System.out.println(total);

			
			
		}
	}

}
