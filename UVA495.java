package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 495
 */

				
import java.math.BigInteger;
import java.util.Scanner;

public class UVA495 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int n = sc.nextInt();
		if(n==1){
			System.out.println("The Fibonacci number for "+n+" is "+"1");
			continue;
		}
		else if(n==2){
			System.out.println("The Fibonacci number for "+n+" is "+"1");
			continue;
		}
		else{
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("1");
		BigInteger total = new BigInteger("0");
		for(int i = 3;i<=n;i++){
			total= b.add(c);
			
			b = c;
			c = total;
			
		}
		
		System.out.println("The Fibonacci number for "+n+" is "+total);
		}
		}
	}

}
