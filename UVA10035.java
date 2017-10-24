package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA Problem No - 10035
 */


					

import java.util.Scanner;

public class UVA10035 {

	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);

		for(;;){
			String[] part = sc.nextLine().split(" ");
			 String a = part[0];
			 String b = part[1];

			if(Integer.parseInt(part[0])==0 &&  Integer.parseInt(part[1])==0){
				return;
			}
			int carry =0;
			String sdig1 ="";
			String sdig2 ="";
			for(int i=part[0].length()-1;i>=0;i--){
				
				if(i<a.length()) {
					char dig1 = a.charAt(i);
					 sdig1 = Character.toString(dig1);
				}
				if(i<b.length()) {
					char dig2 = b.charAt(i);
					 sdig2 = Character.toString(dig2);
				}

				int inDig1=0;
				int inDig2 =0;

				if(sdig1==""){
					inDig1 =0;
				}
				else if(sdig2==""){
					inDig2 =0;

				}
				else {
					inDig1 = Integer.parseInt(sdig1);
					inDig2 = Integer.parseInt(sdig2);
				}
				if(inDig1+inDig2>=10){
					carry++;
				}
				
			
				
			
				
			}
			if(carry==0){
				System.out.println("No carry operation.");
			}
			else if (carry ==1){
				System.out.println(carry+" carry operation.");
			}
			else {
				System.out.println(carry+" carry operations.");
			}
		}
		
		
				}
}
