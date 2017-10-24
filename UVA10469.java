/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;
public class UVA10469 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			String aBin = Integer.toBinaryString(a);
			String bBin = Integer.toBinaryString(b);
			
			int ledingZero =Math.abs(aBin.length()-bBin.length());
			
			String zero = "";
			for(int j=0;j<ledingZero;j++){
				zero +="0";
			}
			
			if(bBin.length()>aBin.length()){
				aBin=zero.concat(aBin);
			}
			
			else if(bBin.length()<aBin.length()){
				bBin = zero.concat(bBin);
			}
			
		//	System.out.println(aBin+" "+bBin);
			
			String out ="";
			
			for(int i=0;i<bBin.length();i++){
				if(bBin.charAt(i)=='0' && aBin.charAt(i)=='0'){
				out+="0";	
				}
				
				else if(bBin.charAt(i)=='0' && aBin.charAt(i)=='1'){
					out+="1";	
					}
				
				else if(bBin.charAt(i)=='1' && aBin.charAt(i)=='0'){
					out+="1";	
					}
				
				else if(bBin.charAt(i)=='1' && aBin.charAt(i)=='1'){
					out+="0";	
					}
				
				
			}
			int res = Integer.parseInt(out, 2);
			System.out.println(res);
			
			
		}
	}

}
