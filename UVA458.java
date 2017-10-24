package UVA;

import java.util.Scanner;

public class UVA458 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String s;
		
		while (( s= sc.nextLine())!=null){
			 
			for(int i=0;i<s.length();i++){
				char c = (char) (s.charAt(i)-7);
				System.out.print(c);
			}
			
		}
	}
}
