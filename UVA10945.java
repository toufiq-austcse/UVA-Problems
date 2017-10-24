package UVA;

import java.util.Scanner;

public class UVA10945 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(true){
			String in = sc.nextLine();
			if(in.equals("DONE")){
				break;
			}
			String s = in.toLowerCase();
			String out="";
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)!='.' && s.charAt(i)!=',' && s.charAt(i)!='?' && s.charAt(i)!='!' && s.charAt(i)!=' ' ){
					out+=s.charAt(i);
				}
			}
			String revS = new StringBuilder(out).reverse().toString();
			
			//System.out.println(out.compareToIgnoreCase(revS));
			
			boolean isSame = true;
			for(int i=0;i<out.length();i++){
				if(out.charAt(i)!=revS.charAt(i)){
					isSame = false;
				}
			}
		
		if(isSame){
			System.out.println("You won’t be eaten!");
		}
		else{
			System.out.println("Uh oh..");
		}
		}
	}

}
