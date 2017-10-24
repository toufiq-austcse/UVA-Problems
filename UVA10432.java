package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 10432
 */

				
import java.util.Scanner;

/*
 * area = r*r*sin(2*pi/n)/2;
 *             
 */
public class UVA10432 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			double r = sc.nextDouble();
			double s = sc.nextDouble();
		   
		 double area = s*(r*r*Math.sin((2*Math.PI)/s)/(double)2);
			//double area = Math.sin(2*Math.PI/s)*Math.cos(a)
			System.out.printf("%.3f\n",area);
			
		}
	}
}
