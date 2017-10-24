package UVA;

import java.util.Scanner;

/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA 12626
 */
//MARGARITA

					
public class UVA12626 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0 ;i<n;i++){
			String s = sc.nextLine();
			int m =0,a=0,r=0,g=0,t=0,I=0;
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)=='M'){
					m++;
				}
				else if(s.charAt(j)=='A'){
					a++;
				}
				else if(s.charAt(j)=='R'){
					r++;
				}
				else if(s.charAt(j)=='G'){
					g++;
				}
				else if(s.charAt(j)=='I'){
					I++;
				}
				else if(s.charAt(j)=='T'){
					t++;
				}
				
			}
			    a = a/3; // for finding how many 'AAA' present in the string becouse in MARGARITA there are 3 'A' 
			    r = r/2; // for finding how many 'RR' present in the String becouse for forming MARGARITA there beed 2 'R'
			    
				int res =Math.min( (Math.min(Math.min(Math.min((Math.min(m, a)),r),g),t)),I);
				 System.out.println(res);
			    
			 //   System.out.println(m+" "+a+" "+r+" "+g+" "+I+" "+t);
			
			
			
		}
	}

}
