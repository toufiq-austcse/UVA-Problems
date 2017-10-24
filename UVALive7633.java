/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UVALive7633 {

	public static void main(String[] arg){
		Scanner sc  = new Scanner(System.in);
		List<String> special = new ArrayList<>();
		
		special.add("1");
		special.add("64");
		special.add("729");
		special.add("4096");
		special.add("15625");
		special.add("46656");
		special.add("117649");
		special.add("262144");
		special.add("531441");
		special.add("1000000");
		special.add("1771561");
		special.add("2985984");
		special.add("4826809");
		special.add("7529536");
		special.add("11390625");
		special.add("16777216");
		special.add("24137569");
		special.add("34012224");
		special.add("47045881");
		special.add("64000000");
		special.add("85766121");
		while(sc.hasNext()){
			String s = sc.next();
			if(s.equals("0")){
				break;
			}
			if(special.contains(s)){
				System.out.println("Special");
			}
			else{
				System.out.println("Ordinary");
			}
		}
		
	}
}
