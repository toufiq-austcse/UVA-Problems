package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 10323
 */


					
import java.math.BigInteger;
import java.util.Scanner;

public class UVA10323 {
	
	public static void main(String[] arg){
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n>=0 && n<=7){
				System.out.println("Underflow!");
			}
			/*
			 * -5 Overflow!
			 * -6 Underflow!
			 * by using Udebug
			 */
			else if(n<0 && n%2==0){
				System.out.println("Underflow!");
			}
			
			else if(n==8){
				System.out.println("40320");
			}
			else if(n==9){
				System.out.println("362880");
			}
			else if(n==10){
				System.out.println("3628800");
			}
			else if(n==11){
				System.out.println("39916800");
			}
			else if(n==12){
				System.out.println("479001600");
			}
			else if(n==13){
				System.out.println("6227020800");
			}
			else{
				System.out.println("Overflow!");
			}
			
			
			}
		}
	

}
