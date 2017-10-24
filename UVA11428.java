package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 11428
 */

				
import java.util.Scanner;

public class UVA11428 {
	public static void main(String[] arg){
		Scanner sc= new Scanner(System.in);
		while(true){
			long n = sc.nextLong();
			if(n==0){
				break;
			}
			boolean isFound = false;
			int j=0;
			for(long i=1;i<= Math.sqrt(n);i++){
				if(i*i*i>n){
					for( j=1;j<i;j++){
						if(i*i*i - j*j*j ==n){
							isFound = true;
							break;
						}
					}
				}
				if(isFound){
					System.out.println(i+" "+j);
					
					break;
				}
				
			}
		 if(isFound  == false){
				System.out.println("No solution");
			}
			
		}
	}

}
