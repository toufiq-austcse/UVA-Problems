package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA,Problem No 11734
 */

				

import java.util.Scanner;

public class UVA11734 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=t;i++){
			String team = sc.nextLine();
			String judge = sc.nextLine();
			
			if(judge.equals(team)){
				System.out.println("Case "+i+": Yes");
			}
			else{
				if(judge.equals(team.replaceAll(" ",""))){
					System.out.println("Case "+i+": Output Format Error");
				}
				else{System.out.println("Case "+i+": Wrong Answer");
				}
			}
		}
	}

}
