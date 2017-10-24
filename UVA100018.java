package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 100018
 */

				
import java.util.Scanner;

public class UVA100018 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++){
			String s = sc.nextLine();
			long sum =Integer.parseInt(s);
			int count =0;
			while(true){
				String rev = new StringBuilder(Long.toString(sum)).reverse().toString();
				sum+= Integer.parseInt(rev);
				
				String sumRev = new StringBuilder(Long.toString(sum)).reverse().toString();
				count++;
				if(Long.toString(sum).equals(sumRev)){
					break;
				}
				
				
				
			}
			System.out.println(count+" "+sum);
		}
	}

}
