package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 11185
 */

				
import java.util.Scanner;

public class UVA11185 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
	   while(sc.hasNext()){
		   String out ="";
		   String fout ="";
		  long n = sc.nextLong();
		   if(n<0){
			   break;
		   }
		   if(n==0){
				   System.out.println("0");
		   }
		   else{
		   while(n!=0){
			  
			   
			   out+=Long.toString(n%3);
			   n = n/3;
		   }
		   
		   for(int i= out.length()-1;i>=0;i--){
			   System.out.print(out.charAt(i));
		   }
		   
		  System.out.println();
		   }
		   
	   }
	}
}
