package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 10019
 */

				
import java.util.Scanner;

public class UVA10019 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			String deciBinary = Integer.toBinaryString(Integer.parseInt(Integer.toString(a),16));
			String hex = Integer.toHexString(a);
			
			String hexBinary = Integer.toBinaryString(Integer.parseInt(hex,16));
			//System.out.println(hexBinary);
			
			//System.out.println(deciBinary+" "+hexBinary);
		
			int oneForDeciBinary =0;
			int oneForHexaBinary =0;
			
			for(int j=0;j<deciBinary.length();j++){
				if(deciBinary.charAt(j)=='1'){
					oneForDeciBinary++;
				}
			}
			for(int j=0;j<hexBinary.length();j++){
				if(hexBinary.charAt(j)=='1'){
					oneForHexaBinary++;
				}
			}
			
			System.out.println(oneForHexaBinary+" "+oneForDeciBinary);
		
		}
	}

}
