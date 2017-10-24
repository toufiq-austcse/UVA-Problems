package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA 12289
 */

import java.util.Scanner;

public class UVA12289 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
			String s = sc.nextLine();
			if(s.length()==5){
				System.out.println(3);
			}
			else{
				if((s.charAt(0)=='o' && s.charAt(1)=='n')||(s.charAt(1)=='n'&& s.charAt(2)=='e')||(s.charAt(2)=='e'&& s.charAt(0)=='o')){
					System.out.println(1);
				}
				else{
					System.out.println(2);
				}
			}
			
		}
		
	}

}
