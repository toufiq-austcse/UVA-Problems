package UVA;

import java.util.Scanner;

public class UVA11586 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
			String s = sc.nextLine();
			String[] parts = s.split(" ");
			if(parts.length==1){
				System.out.println("NO LOOP");
			}
			else{
			boolean isSame = false;
			for(int j=0;;j++){
				if(j==parts.length){
					break;
				}
				try{
				if(parts[j].charAt(1)==parts[j+1].charAt(0)){
					isSame = true;
					break;
					
				}
				}catch (Exception e) {
					// TODO: handle exception
					//System.out.println(j);
				}
			}
		      char first= parts[0].charAt(0);
	          char second =parts[parts.length-1].charAt(1);
			
			
			if(isSame || first == second){
				System.out.println("NO LOOP");
			}
			else if(!isSame || first!=second){
				System.out.println("LOOP");
			}
			}
		}
			
			}
		
	

}
