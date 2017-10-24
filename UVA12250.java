package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA 12250
 */

import java.util.Scanner;

public class UVA12250 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int i=0;
		String s;
		while(sc.hasNext() && !(s=sc.nextLine()).equals("#")){
			
			
			i++;
			if(s.equals("HELLO")){
				System.out.println("Case "+i+": "+"ENGLISH");
				continue;
			}
			else if(s.equals("HOLA")){
				System.out.println("Case "+i+": "+"SPANISH");
				continue;
			}
			else if(s.equals("HALLO")){
				System.out.println("Case "+i+": "+"GERMAN");
				continue;
			}
			else if(s.equals("BONJOUR")){
				System.out.println("Case "+i+": "+"FRENCH");
				continue;
			}
			else if(s.equals("CIAO")){
				System.out.println("Case "+i+": "+"ITALIAN");
				continue;
			}
			else if(s.equals("ZDRAVSTVUJTE")){
				System.out.println("Case "+i+": "+"RUSSIAN");
				continue;
			}
			else{
				System.out.println("Case "+i+": "+"UNKNOWN");
			
			}
			
			
		}
	}

}
