package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 10170
 */

				
import java.util.Scanner;

public class UVA10170 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			long s = sc.nextLong();
			long d = sc.nextLong();
			long total = 0;
			for(long i=s;;i++){
				total+=i;
				if(total>=d){
					System.out.println(i);
					break;
				}
			}
		}
	}

}
