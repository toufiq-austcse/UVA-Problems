/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;
public class UVA12405 {
	
//...##...#
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=1;i<=t;i++){
			int n = sc.nextInt();
			sc.nextLine();
			String in = sc.nextLine();
			int count =0;
			for(int j=0;j<in.length();){
				if(in.charAt(j)=='#'){
					j++;
				}
				else{
					count++;
					j +=3;
				}
			}
			
			System.out.println("Case "+i+": "+count);
		}
	}
}
