package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Uva ,Problem no 11192
 */

				
import java.util.Scanner;

public class UVA11192 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int g = sc.nextInt();
			
			if(g==0){
				break;
			}
			
			String string = sc.next();
			
			int partsLen = string.length()/g;
			
			String[] arr = new String[g];
			int index =0;
			String out="";
			for(int i=0;i<string.length();i++){
				out+=string.charAt(i);
				if(out.length()==partsLen){
					arr[index++] = out;
					out="";
				}
			}
			
		//	String finalOut="";
			StringBuilder finalOut = new StringBuilder(string.length());
			for(int i=0;i<g;i++){
				String rev = new StringBuilder(arr[i]).reverse().toString();
				//finalOut+=rev;
				finalOut.append(rev);
				
			}
			//finalOut = finalOut.trim();
			System.out.println(finalOut);
			
		}
		
	}
}
