package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA ,10347
 */

				
import java.util.Scanner;

public class UVA10347 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double s = (a+b+c)/2.0;
			
			double area = (4.0/3.0)*Math.sqrt(s*(s-a)*(s-b)*(s-c));
			
			if(area>0){
				
				System.out.printf("%.3f\n",area);
			}
			else{
				System.out.printf("-1.000\n");
			}
		}
	}

}
