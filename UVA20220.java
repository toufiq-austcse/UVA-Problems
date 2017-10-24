package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA ,20220
 */


					
import java.math.BigInteger;
import java.util.Scanner;

public class UVA20220 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			BigInteger big1 = new BigInteger("1");
			for(int i=2;i<=n;i++){
				big1 = big1.multiply(BigInteger.valueOf(i));
				
			}
			
			char[] c = big1.toString().toCharArray();
			int total =0;
			for(int i=0;i<c.length;i++){
				String s = Character.toString(c[i]);
				int t = Integer.parseInt(s);
				total +=t;
			}
			
			System.out.println(total);
		}
	}

}
