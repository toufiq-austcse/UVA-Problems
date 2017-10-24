package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 10812
 */

				
import java.util.Scanner;

public class UVA10812 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int s = sc.nextInt();
			int d = sc.nextInt();
			
			int first = (s+d)/2;
			int second = first-d;
			if(second<0 || second<0 || (first+second)!=s ){
				System.out.println("impossible");
			}
			else{
				
			
			System.out.println(first+" "+second);
			}
			
		}
	}
}
