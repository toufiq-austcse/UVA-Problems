package UVA;

/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * Uva,Problem No 623
 */


					
import java.math.BigInteger;
import java.util.Scanner;

public class UVA623 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			BigInteger f = new BigInteger("1");
			
			for(int i=2;i<=n;i++){
				f = f.multiply(BigInteger.valueOf(i));
			}
			
			System.out.println(n+"!");
			System.out.println(f);
					
		}
	}

}
