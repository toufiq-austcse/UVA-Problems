package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 12952
 */

				
import java.util.Scanner;

public class UVA12952 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==b){
				System.out.println(a);
			}
			else if(a>b){
				System.out.println(a);
			}
			else if(b>a){
				System.out.println(b);
			}
		}
	}
}
