/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.*;
public class UVA541 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			int[][] a = new int [n][n];
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					a[i][j] = sc.nextInt();
				}
			}
			
			int row=0,column =0,checkRow=0,checkColumn =0;
			
			for(int i=0;i<n;i++){
				int totalForRow =0;
				for(int j=0;j<n;j++){
					totalForRow+= a[i][j];
				}
				
				if(totalForRow%2!=0){
					row = i;
					checkRow++;
				}
			}
			
			for(int i=0;i<n;i++){
				int totalForColumn =0;
				for(int j=0;j<n;j++){
					totalForColumn+= a[j][i];
				}
				
				if(totalForColumn%2!=0){
					column = i;
					checkColumn++;
				}
			}
			
			if(checkRow==0 && checkColumn==0){
				System.out.println("OK");
			}
			else if(checkColumn==1 && checkRow==1){
				System.out.println("Change bit ("+(row+1)+","+(column+1)+")");
			}
			else{
				System.out.println("Corrupt");
			}
			
		}
	}

}
