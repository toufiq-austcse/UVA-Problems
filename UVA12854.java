package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 12854
 */

				
import java.util.Scanner;

public class UVA12854 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int[] connectr1 = new int[5];
			int[] connectr2 = new int[5];
			
			for(int i=0;i<5;i++){
				connectr1[i] = sc.nextInt();
			}
			
			for(int i=0;i<5;i++){
				connectr2[i] = sc.nextInt();
			}
			
			boolean isSmae = false;
			
			for(int i=0;i<5;i++){
				if(connectr1[i]==connectr2[i] ){
					isSmae = true;
					break;
				}
			}
			
			if(isSmae){
				System.out.println("N");
			}
			else{
				System.out.println("Y");
			}
		}
	}

}
