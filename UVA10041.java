package UVA;

import java.util.Scanner;

public class UVA10041 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n= sc.nextInt();
			
			for(int i=0;i<n;i++){
				int a = sc.nextInt();
				int[] arr = new int[a];
				
				for(int j=0;j<a;j++){
					arr[j] = sc.nextInt();
				}
				
				int sum =0;
				int res = Integer.MAX_VALUE;
				for(int k=0;k<arr.length;k++){
					
					for(int l=0;l<arr.length;l++){
						sum += Math.abs(arr[k]-arr[l]);
					}
					//System.out.println("Sum "+sum);
					if(sum<res){
						res = sum;
					}
					sum =0;
				}
				System.out.println(res);
				
			}
		}
	}

}
