package UVA;
/*
 * In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * Uva 494
 */

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner; 

public class Uva494 {
	
	//I Love You 
	public static int wordCount(String s){
		int numberOfWords =0;
		boolean word = false;
		int endOFLine = s.length()-1;
		for(int i=0;i<s.length();i++){
			if(Character.isLetter(s.charAt(i)) && i!=endOFLine){
				word = true;
			}
			else if(!Character.isLetter(s.charAt(i)) && word ){
				numberOfWords++;
				word = false;
			}
			else if(Character.isLetter(s.charAt(i))  && i==endOFLine){
				numberOfWords++;
			}
		}
		return numberOfWords;
		
	}
   
public static void main(String[] arg) throws IOException {
	Scanner sc = new Scanner(System.in);
	Uva494 ob = new Uva494();
	while(sc.hasNext()){
	String s = sc.nextLine();
	int n = ob.wordCount(s);
	System.out.println(n);
	}
	
}
  
}
