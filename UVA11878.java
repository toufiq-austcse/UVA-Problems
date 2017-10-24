/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;

public class UVA11878 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int result =0;
		while(sc.hasNext()){
			String in = sc.next();
			boolean isPlus = false;
			boolean isMinus = false;
			
			
			String equlsBihin = in.replace("=", " ");
			String plusBihin ="";
			if(equlsBihin.contains("+")){
				plusBihin = equlsBihin.replace("+", " ");
				isPlus =true;
			}
			else if(equlsBihin.contains("-")){
				plusBihin = equlsBihin.replace("-", " ");
				isMinus = true;
				
			}
			
			String[] parts = plusBihin.split(" ");
			
			if(isPlus && !parts[2].contains("?")){
				if(Integer.parseInt(parts[0])+Integer.parseInt(parts[1])== Integer.parseInt(parts[2])){
					result++;
				}
			}
			
			else if(isMinus && !parts[2].contains("?")){
				if(Integer.parseInt(parts[0])-Integer.parseInt(parts[1])== Integer.parseInt(parts[2])){
					result++;
				}
			}
			
		}
		System.out.println(result);
	}

}
