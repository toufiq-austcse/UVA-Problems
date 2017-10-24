package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 *UVA, 12578
 */


					
import java.util.Scanner;

public class UVA12578 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int l = sc.nextInt();
			double radi = (1/5.0)*l;
			double area = Math.PI*radi*radi;
			double w =(3/5.0)*l;
			double green = l*w - area;
			System.out.printf("%.2f %.2f",area,green);
			System.out.println();
		}
	}
}
