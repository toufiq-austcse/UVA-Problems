package UVA;

import java.util.Scanner;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 10340
 */

				
public class UVA10340 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			String[] parts = s.split(" ");
			int[] a = new int[parts[0].length()];
			String out ="";
			boolean isFound = true;
			//int index = -1;
			int i=0,j=0;
			
			for( j=0;j<parts[1].length();j++){
				
				if(parts[0].charAt(i)==parts[1].charAt(j)){
					i++;
				}
				if(i==parts[0].length()){
					break;
			}
			}
			
			if(i==parts[0].length()){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			
			
			
			
			
			
		}
	}

}
