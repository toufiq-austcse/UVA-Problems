/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;
public class UVA10260 {

	
	public static void main(String[] arg)throws Exception{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			
			String out ="";
			if(s.charAt(0)=='B'||s.charAt(0)=='F'||s.charAt(0)=='P'||s.charAt(0)=='V'){
				out += "1";
			}
			else if(s.charAt(0)=='C'||s.charAt(0)=='G'||s.charAt(0)=='J'||s.charAt(0)=='K'||s.charAt(0)=='Q'||s.charAt(0)=='S'||s.charAt(0)=='X'||s.charAt(0)=='Z'){
				out += "2";
			}
			else if(s.charAt(0)=='D'||s.charAt(0)=='T'){
				out += "3";
			}
			else if(s.charAt(0)=='L'){
				out += "4";
			}
			else if(s.charAt(0)=='N'||s.charAt(0)=='M'){
				out += "5";
			}
			
			else if(s.charAt(0)=='R'){
				out += "6";
			}
			else{
				out+=" ";
			}
			
			if(s.length()==1){
				System.out.println(out.replaceAll(" " , ""));
			}
			
			else{
				for(int i=1;i<s.length();i++){
					
					if(s.charAt(i)=='B'||s.charAt(i)=='F'||s.charAt(i)=='P'||s.charAt(i)=='V'){
						if(out.charAt(out.length()-1)!='1'){
						out += "1";
						}
					}
					else if(s.charAt(i)=='C'||s.charAt(i)=='G'||s.charAt(i)=='J'||s.charAt(i)=='K'||s.charAt(i)=='Q'||s.charAt(i)=='S'||s.charAt(i)=='X'||s.charAt(i)=='Z'){
						if(out.charAt(out.length()-1)!='2'){
							out += "2";
							}
					}
					else if(s.charAt(i)=='D'||s.charAt(i)=='T'){
						if(out.charAt(out.length()-1)!='3'){
							out += "3";
							}
					}
					else if(s.charAt(i)=='L'){
						if(out.charAt(out.length()-1)!='4'){
							out += "4";
							}
					}
					else if(s.charAt(i)=='N'||s.charAt(i)=='M'){
						if(out.charAt(out.length()-1)!='5'){
							out += "5";
							}
					}
					
					else if(s.charAt(i)=='R'){
						if(out.charAt(out.length()-1)!='6'){
							out += "6";
							}
					}
					else{
						out+=" ";
					}
				}
				System.out.println(out.replaceAll(" ", ""));
			}
			
			
		}
		
		
	}
		
	
}
