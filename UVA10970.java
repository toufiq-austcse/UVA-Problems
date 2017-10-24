package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA 10970
 */


import java.util.Scanner;

public class UVA10970 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String def = "1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		while(sc.hasNext()){
			String out = "";
			String s = sc.nextLine();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)==' '){
					out+=" ";
				}
				else{
				char a = s.charAt(i);
				int b = def.indexOf(a);
				
			  out+=def.charAt(b-1);
				}
				
			}
			
			
			System.out.println(out);
		}
		
		

	}
}
