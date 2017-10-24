package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 12696
 */

import java.util.Scanner;

public class UVA12696 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		int total =0;
		for(int i=0;i<t;i++){
			double len = sc.nextDouble();
			double wid = sc.nextDouble();
			double dep = sc.nextDouble();
			double weight = sc.nextDouble();
			
			double sum = len+wid+dep;
			
			
			if(len<=56 && wid<=45 && dep<= 25 && weight<=7){
				System.out.println(1);
				total++;
			}
			else if(sum<=125 && weight<=7){
				System.out.println(1);
				total++;
			}
			else{
				System.out.println(0);
			}
			
		}
		System.out.println(total);
	}
}
