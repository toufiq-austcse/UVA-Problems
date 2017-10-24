package UVA;

import java.util.Arrays;
import java.util.Scanner;

public class UVA11875 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
			
			int n = sc.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++){
				a[j] = sc.nextInt();
			}
			Arrays.sort(a);
			int mid = a.length/2;
			System.out.println("Case "+i+": "+a[mid]);
		}
	}
}
