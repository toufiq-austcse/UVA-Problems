package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA 10222
 */

import java.util.Scanner;

public class UVA10222 {

	public static void main(String[] arg){
		Scanner sc= new Scanner(System.in);
		String def = "1234567890-=\\QWERTYUIOP[]ASDFGHJKL;'ZXCVBNM,./";
		String s= sc.nextLine().toUpperCase();
		String out="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				out+=" ";
			}
			else{
			char a = s.charAt(i);
			int b = def.indexOf(a);
		
		   out+= def.charAt(b-2);
			
			}
			
		}
		System.out.println(out.toLowerCase());
		
	}
}
