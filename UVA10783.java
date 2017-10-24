package UVA;
/*
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Uva 10783
 */

import java.util.Scanner;

class UVA10783 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int total=0;
			int law = sc.nextInt();
			int high = sc.nextInt();
			for(int j= law;j<=high;j++){
				if(j%2!=0){
					total+=j;
				}
			}
			
			System.out.printf("Case %d: %d\n",i+1,total);
			
		}
	}

}
