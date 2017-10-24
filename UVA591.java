package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 *UVA,Problem No -591
 */


					
import java.util.Scanner;

public class UVA591 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n ;
		int set=1;
		while((n = sc.nextInt())!=0){
			int[] a = new int[n];
			int sum =0;
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				sum += a[i];
			}
			int avg = sum / n;
			int totalBoxMives = 0;
			for(int j=0;j<n;j++){
				if(a[j]>avg){
					totalBoxMives+= a[j]-avg;
				}
			}
			System.out.println("Set #"+set);
			System.out.println("The minimum number of moves is "+totalBoxMives+".");
			System.out.println();
			set++;
		}
	}

}
