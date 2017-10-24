package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA ,Problem No - 12279
 */


import java.util.Scanner;

public class UVA12279 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int N;
		int j=1;
		while((N = sc.nextInt())!=0){
			int a;
			int actuallyGivenATreat =0;
			int supposedToGiveATreat=0;
			for(int i=0;i<N;i++){
				a = sc.nextInt();
				if(a==0){
					actuallyGivenATreat++;
				}
				else{
					supposedToGiveATreat++;
				}
			}
			
			System.out.println("Case "+j+": "+(supposedToGiveATreat-actuallyGivenATreat));
			j++;
		}
	}
}
