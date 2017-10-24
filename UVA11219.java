package UVA;

import java.util.Scanner;

public class UVA11219 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		sc.nextLine();
		for(int i=1;i<=t;i++){
			
			System.out.println();
			
			String curntData = sc.nextLine();
			String birthData = sc.nextLine();
			
			String[] cArr = curntData.split("/");
			String[] bArr = birthData.split("/");
			
			if(Integer.parseInt(cArr[2])<Integer.parseInt(bArr[2])){
				System.out.println("Case #"+(i)+": "+"Invalid birth date");
			}
			else if(Integer.parseInt(cArr[2])==Integer.parseInt(bArr[2]) && Integer.parseInt(bArr[1])>Integer.parseInt(cArr[1])){
				System.out.println("Case #"+(i)+": "+"Invalid birth date");
			}
			else if(Integer.parseInt(cArr[2])==Integer.parseInt(bArr[2]) && Integer.parseInt(bArr[1])==Integer.parseInt(cArr[1]) && Integer.parseInt(bArr[0])>Integer.parseInt(bArr[0])){
				System.out.println("Case #"+(i)+": "+"Invalid birth date");
			}
			
			else if((Integer.parseInt(cArr[2])-Integer.parseInt(bArr[2]))>130){
				System.out.println("Case #"+(i)+": "+"Check birth date");
			}
			else if(Integer.parseInt(bArr[1])==Integer.parseInt(cArr[1]) &&Integer.parseInt(bArr[0])==Integer.parseInt(cArr[0]) ){
				System.out.println("Case #"+(i)+": "+"0");
			}
			else if(Integer.parseInt(bArr[1])==2 && Integer.parseInt(cArr[1])==2){
				if(Integer.parseInt(bArr[0])==28 && Integer.parseInt(cArr[0])==29 ){
					System.out.println("Case #"+(i)+": "+"0");
				}
				if(Integer.parseInt(bArr[0])==29 && Integer.parseInt(cArr[0])==28 ){
					System.out.println("Case #"+(i)+": "+"0");
				}
			}
			else {
				int y = Integer.parseInt(cArr[2]) -  Integer.parseInt(bArr[2]);
				System.out.println("Case #"+(i)+": "+y);
			}
			}
		}
	}


