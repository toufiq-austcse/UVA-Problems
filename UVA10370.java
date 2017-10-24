package UVA;

import java.util.Scanner;

public class UVA10370 {
 public static void main(String[] arg){
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 for(int i=0;i<t;i++){
		 int n = sc.nextInt();
		 int a[] = new int[n];
		 int sum =0;
		 for(int j=0;j<n;j++){
			  a[j] = sc.nextInt();
			 sum+= a[j];
		 }
		double avg = sum/(double)n;
	//	System.out.println(avg);
		int studntNumber =0;
		
		for(int k=0;k<a.length;k++){
			if(a[k]>avg){
				studntNumber++;
			}
			
		}
		double result = (studntNumber/(double)n)*100;
		System.out.printf("%.3f%%",result);
		System.out.println();
	
		
	 }
 }
}
