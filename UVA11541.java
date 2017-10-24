/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;

public class UVA11541 {

	public static void main(String[] arg){
		Scanner sc  = new Scanner(System.in);
		
		String test = sc.nextLine();
		int t = Integer.parseInt(test);
		
		for(int i=1;i<=t;i++){
			String s = sc.next();
			String out = "";
			
			int j=0;
			while(true){
				
				if(j==s.length()){
					break;
				}
				
				
				String ch="";
				String nmbr ="";
				
				boolean isSes = false;
				if(s.charAt(j)>='0' && s.charAt(j)<='9'){
					
					ch = Character.toString(s.charAt(j-1));
					while(s.charAt(j)>='0' && s.charAt(j)<='9'){
						nmbr += s.charAt(j);
						j++;
						//System.out.println(nmbr);
						if(j==s.length()){
							isSes = true;
							break;
						}
					}
					
					
					
					for(int l=0;l<Integer.parseInt(nmbr);l++){
						out +=ch;
					}
					
						if(isSes){
						
						break;
					}
				}
				

				
				
				j++;
				
			}
			
			System.out.println("Case "+i+": "+out);
			
			
			
		}
		
	}
}
