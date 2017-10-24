package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA 1585
 */

import java.util.Scanner;

public class UVA1585 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
			String s = sc.nextLine();
			int count =0;
			int total = 0;
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)=='O'){
					count++;
					total+=count;
					
					
				}
				
				if(s.charAt(j)=='X'){
					count =0;
				}
			}
			
			System.out.println(total);
		}
	}

}
