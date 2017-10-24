package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *UVA 11936
 */


					
import java.util.Arrays;
import java.util.Scanner;

public class UVA11936 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int[] a = new int[3];
			for(int j=0;j<a.length;j++){
				a[j] = sc.nextInt();
				
			}
			
			Arrays.sort(a);
			if(a[0]+a[1]>a[2]){
				System.out.println("OK");
			}
			else{
				System.out.println("Wrong!!");
			}
		}
	}

}
