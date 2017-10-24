package UVA;

import java.util.Scanner;

public class UVA10921 {

	public static void main(String[] arg){
		Scanner sc=  new Scanner(System.in);
		while(sc.hasNext()){
			String s= sc.nextLine();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='1'){
					System.out.print("1");
				}
				if(s.charAt(i)=='0'){
					System.out.print("0");
				}
				else if(s.charAt(i)=='-'){
					System.out.print('-');
				}
				
				else if(s.charAt(i)>='A' && s.charAt(i)<='C'){
					System.out.print('2');
				}
				
				else if(s.charAt(i)>='D' && s.charAt(i)<='F'){
					System.out.print('3');
				}
				
				else if(s.charAt(i)>='G' && s.charAt(i)<='I'){
					System.out.print('4');
				}
				
				else if(s.charAt(i)>='J' && s.charAt(i)<='L'){
					System.out.print('5');
				}
				
				else if(s.charAt(i)>='M' && s.charAt(i)<='O'){
					System.out.print('6');
				}
				
				else if(s.charAt(i)>='P' && s.charAt(i)<='S'){
					System.out.print('7');
				}
				
				else if(s.charAt(i)>='T' && s.charAt(i)<='V'){
					System.out.print('8');
				}
				
				else if(s.charAt(i)>='W' && s.charAt(i)<='Z'){
					System.out.print('9');
				}
			}
			System.out.println();
		}
	}
}
