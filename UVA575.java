package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 575
 */

				
import java.math.BigInteger;
import java.util.Scanner;

public class UVA575 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(true){
		String s = sc.nextLine();
		if(s.equals("0")){
			break;
		}
		int total =0;
		int p = s.length();
		for(int i=0;i<s.length();i++){
			String v = Character.toString(s.charAt(i));
			total += Integer.parseInt(v)*(Math.pow(2, p)-1);
			p--;
		}
		System.out.println(total);
		}
		
	}

}
