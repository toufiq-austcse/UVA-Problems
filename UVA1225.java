/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;

public class UVA1225 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			for(int i =0;i<n;i++){
				int in = sc.nextInt();
				int[] dgit = {0,0,0,0,0,0,0,0,0,0};
				
				String inS ="";
				
				for(int j =1;j<=in;j++){
					inS += Integer.toString(j);
				}
				
				for(int j=0;j<inS.length();j++){
					if(inS.charAt(j)=='0'){
						dgit[0]+=1;
					}
					else if(inS.charAt(j)=='1'){
						dgit[1]+=1;
					}
					else if(inS.charAt(j)=='2'){
						dgit[2]+=1;
					}
					else if(inS.charAt(j)=='3'){
						dgit[3]+=1;
					}
					else if(inS.charAt(j)=='4'){
						dgit[4]+=1;
					}
					else if(inS.charAt(j)=='5'){
						dgit[5]+=1;
					}
					else if(inS.charAt(j)=='6'){
						dgit[6]+=1;
					}
					else if(inS.charAt(j)=='7'){
						dgit[7]+=1;
					}
					else if(inS.charAt(j)=='8'){
						dgit[8]+=1;
					}
					else if(inS.charAt(j)=='9'){
						dgit[9]+=1;
					}
					
				}
				
				for(int j =0;j<dgit.length;j++){
					if(j==dgit.length-1){
						System.out.println(dgit[j]);
					}
					else{
					System.out.print(dgit[j]+" ");
					}
				}
				
				
			}
		}
		
	}

}
