package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 11672
 */

				
import java.util.Scanner;

public class UVA11672 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(true){
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			if(h1==0 && m1==0 && h2==0 && m2==0){
				break;
			}
			else{
				int min =0;
				while(h1!=h2 || m1!=m2){
					if(m1==59){
						h1 = (h1+1)%24;
					}
					m1=(m1+1)%60;
					min++;
				}
				
				System.out.println(min);
				
			}
		}
	}
}
