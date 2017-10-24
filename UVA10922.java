package UVA;

import java.util.Scanner;

public class UVA10922 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(true){
		String	s = sc.nextLine();
			if(s.charAt(0)=='0'){
				break;
			}
			
			int sum = 0;
			
			for(int i=0;i<s.length();i++){
				String a = Character.toString(s.charAt(i));
				sum += Integer.parseInt(a);
			}
			if(sum%9==0){
			String a = Integer.toString(sum);
			int total =0;
			for(int i=0;i<a.length();i++){
				if(a.charAt(i)!='0'){
					total++;
				}
			}
			
			System.out.println(s+" is a multiple of 9 and has 9-degree "+total+".");
			}
			else{
				System.out.println(s+" is not a multiple of 9.");
			}
			
		}
	}

}
