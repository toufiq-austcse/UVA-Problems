package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA  12149
 */

				
import java.util.Scanner;

public class UVA12149 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int sum =0;
			if(n==0){
				break;
			}
			
			for(int i=1;i<=n;i++){
				sum += Math.pow(i, 2);
			}
			System.out.println(sum);
		}
	}

}
