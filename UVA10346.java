package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 *
 *UVa, 10346
 */


					
import java.util.Scanner;

public class UVA10346 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System .in);
		while(sc.hasNext()){
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int out = n;
			while(n>=k){
				out += n/k;
				
				n = n%k + n/k;
			}
			
			System.out.println(out);
			
			
		}
	}
}
