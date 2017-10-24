package UVA;
/*
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA 11713
 */

import java.util.Arrays;
import java.util.Scanner;

public class UVA11713 {

public static void main(String[] arg){
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
sc.nextLine();
for(int i=0;i<n;i++){
	String first = sc.nextLine();
	String second = sc.nextLine();
	
	int firstLen = first.length();
	int secondLen = second.length();
	if(firstLen!=secondLen){
		System.out.println("No");
	}
	else{
		boolean isSame = true;
		boolean isFinished= false;	
		for(int j=0;j<firstLen;j++){
			if(first.charAt(j)!='a' &&first.charAt(j)!='e' &&first.charAt(j)!='i' &&first.charAt(j)!='o' &&first.charAt(j)!='u'){
				if(first.charAt(j)!= second.charAt(j)){
					System.out.println("No");
					isFinished = true;
					break;
				}
			}
			
			else{ 
				if(first.charAt(j)!=second.charAt(j)){
				isSame = false;
				break;
			}
				
		}
			}
		if(isSame && !isFinished){
			System.out.println("No");
		}
		else if(!isFinished && !isSame ){
			System.out.println("Yes");
		}
	}
	

	
	
	
}
}

}
