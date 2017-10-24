/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;
public class UVA11743 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++){
			
			List<Integer> doubledigit = new ArrayList<>();
			List<Integer> signgleigit = new ArrayList<>();
			String in = sc.nextLine().replaceAll(" ", "");
			
			
			for(int j= in.length()-2;j>=0;j-=2){
				signgleigit.add(Integer.parseInt(Character.toString(in.charAt(j+1))));
				
				doubledigit.add(Integer.parseInt(Character.toString(in.charAt(j)))*2);
				
				
			}
			
			int sumOfSingled =0,sumOfDoubledgt =0;
			
			for(int j=0;j<signgleigit.size();j++){
				sumOfSingled+= signgleigit.get(j);
			}
			
			for(int j=0;j<doubledigit.size();j++){
				
				if(doubledigit.get(j)==10){
					sumOfDoubledgt +=1;
				}
				else if(doubledigit.get(j)==11){
					sumOfDoubledgt +=2;
				}
				else if(doubledigit.get(j)==12){
					sumOfDoubledgt +=3;
				}
				else if(doubledigit.get(j)==13){
					sumOfDoubledgt +=4;
				}
				else if(doubledigit.get(j)==14){
					sumOfDoubledgt +=5;
				}
				else if(doubledigit.get(j)==15){
					sumOfDoubledgt +=6;
				}
				else if(doubledigit.get(j)==16){
					sumOfDoubledgt +=7;
				}
				else if(doubledigit.get(j)==17){
					sumOfDoubledgt +=8;
				}
				else if(doubledigit.get(j)==18){
					sumOfDoubledgt +=9;
				}
				else{
					sumOfDoubledgt+=doubledigit.get(j);
				}
				
			}
			
			int ans = sumOfDoubledgt+sumOfSingled;
			String ansString = Integer.toString(ans);
			
			if(ansString.charAt(ansString.length()-1)=='0'){
				System.out.println("Valid");
			}
			else{
				System.out.println("Invalid");
			}
			
			
			
			
		}
	}
}
