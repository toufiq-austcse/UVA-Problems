package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 12704
 */

				
import java.util.Scanner;

public class UVA12704 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int r = sc.nextInt();
			
			int tmp = Math.abs(x*x +y*y);
			double c = Math.sqrt(tmp);
		//	System.out.println(tmp);
			double shortest = r-c;
			double longest =  r+c;
			
		System.out.printf("%.2f %.2f\n",shortest,longest);
		}
	}

}
