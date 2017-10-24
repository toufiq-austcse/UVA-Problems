/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;



public class UVA10424 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
		
		String first = sc.nextLine().toLowerCase();
		String second = sc.nextLine().toLowerCase();
		
		
		String small = "abcdefghijklmnopqrstuvwxyz";
		
		int sumFirst =0;
		int sumSec =0;
		
		for(int i=0;i<first.length();i++){
			if(first.charAt(i)>='a' && first.charAt(i)<='z'){
			sumFirst += small.indexOf(first.charAt(i))+1;
			}
		}
		for(int i=0;i<second.length();i++){
			if(second.charAt(i)>='a' && second.charAt(i)<='z'){
			sumSec += small.indexOf(second.charAt(i))+1;
			}
		}
		
		String st1 = Integer.toString(sumFirst);
		String st2 = Integer.toString(sumSec);
		
		int totalSum1 =0;
		int totalSum2 =0;
		
		while(st1.length()!=1){
			 totalSum1 =0;
			for(int i=0;i<st1.length();i++){
				totalSum1 +=Integer.parseInt((Character.toString(st1.charAt(i))));
			}
			
			st1 = Integer.toString(totalSum1);
	
		}
		
		while(st2.length()!=1){
			 totalSum2 =0;
			for(int i=0;i<st2.length();i++){
				
				totalSum2 +=Integer.parseInt((Character.toString(st2.charAt(i))));
				
			}
			
			st2 = Integer.toString(totalSum2);
		}
		double ans;
		if(totalSum1<totalSum2){
			 ans = (totalSum1/(double)totalSum2)*100.0;
		}
		else{
			 ans =(totalSum2/(double)totalSum1)*100.0;
		}
		
		System.out.printf("%.2f",ans);
		System.out.println(" %");
		
	}
	}
}
