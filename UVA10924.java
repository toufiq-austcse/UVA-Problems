package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 *  
 *  UVA, Problem No - 10924
 */


					
import java.util.Scanner;

public class UVA10924 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int total =0;
			String  pre ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String s = sc.nextLine();
			
			for(int i=0;i<s.length();i++){
				total+= pre.indexOf(s.charAt(i))+1;
				
			}
			boolean isPrime = true;
			for(int j=2;j<total;j++){
				if(total%j==0){
					isPrime = false;
				}
			}
			if(isPrime){
				System.out.println("It is a prime word.");
			}
			else{
				System.out.println("It is not a prime word.");
			}
			
		}
	}
}
