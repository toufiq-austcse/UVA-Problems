package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 *UVA 12917
 */

				
import java.util.Scanner;

public class UVA12917 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int p = sc.nextInt();
			int h = sc.nextInt();
			int o = sc.nextInt();
			
			int temp = o-h;
			if(temp>=p){
				System.out.println("Props win!");
			}
			else if (temp<p){
				System.out.println("Hunters win!");
			}
		}
	}

}
