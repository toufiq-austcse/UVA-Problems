package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA 12895
 */


					
import java.util.Scanner;

public class UVA12895 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++){
			int total =0;
			String s  = sc.nextLine();
			int p = s.length();
			char[] ch = s.toCharArray();
			
			for(int j=0;j<ch.length;j++){
				String v = Character.toString(ch[j]);
				long intValue = Integer.parseInt(v);
				total+= Math.pow(intValue, p);
				
			}
			
			if(total== Integer.parseInt(s)){
				System.out.println("Armstrong");
			}
			else{
				System.out.println("Not Armstrong");
			}
			
			
		}
	}
}
