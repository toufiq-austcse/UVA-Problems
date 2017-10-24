package UVA;

import java.util.Scanner;

public class UVA12896 {
	
	
	public static void main(String[] arg){
		
		String one =".,?\"";
		String two = "abc";
		String three = "def";
		String four = "ghi";
		String five = "jkl";
		String six = "mno";
		String seven = "pqrs";
		String eight = "tuv";
		String nine = "wxyz";
		
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int len = sc.nextInt();
			int[] key = new int[len];
			int[] numberOftimesPressed = new int[len];
			
			for(int j =0;j<len;j++ ){
				key[j] = sc.nextInt();
			}
			for(int j=0;j<len;j++){
				numberOftimesPressed[j] = sc.nextInt();
			}
			String out ="";
			for(int l=0;l<key.length;l++){
				if(key[l]==1){
					out+=one.charAt(numberOftimesPressed[l]-1);
					//System.out.println(one.charAt(numberOftimesPressed[l]-1));
				}
				else if(key[l] == 2){
					out+=two.charAt(numberOftimesPressed[l]-1);
					
				}
				else if(key[l] == 3){
					out+=three.charAt(numberOftimesPressed[l]-1);
					
				}
				else if(key[l] == 4){
					out+=four.charAt(numberOftimesPressed[l]-1);
					
				}
				else if(key[l] == 5){
					out+=five.charAt(numberOftimesPressed[l]-1);
					
				}
				else if(key[l] == 6){
					out+=six.charAt(numberOftimesPressed[l]-1);
					
				}
				else if(key[l] == 7){
					out+=seven.charAt(numberOftimesPressed[l]-1);
					
				}
				else if(key[l] == 8){
					out+=eight.charAt(numberOftimesPressed[l]-1);
					
				}
				else if(key[l] == 9){
					out+=nine.charAt(numberOftimesPressed[l]-1);
					
				}
				else if(key[l] == 0){
					out+=" ";
					
				}
			}
			
			System.out.println(out);
			
			
			
 		}
	}

}
