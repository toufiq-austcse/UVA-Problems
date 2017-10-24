package UVA;

import java.util.Arrays;
import java.util.Scanner;

public class UVA10474 {
	public static void main(String[] arg){
	
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
	long test=1;
		while(flag !=false){
			long n = sc.nextLong();
			long q = sc.nextLong();
			if(n==0 && q==0){
                flag = false;
                continue;
            }
			
			
			int[] arr = new int[(int)n];
			for(long i=0;i<n;i++){
				arr[(int)i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			boolean isFound = false;
			System.out.println("CASE# "+(test++)+":");
			for(int j=0;j<q;j++){
				long temp = sc.nextLong();
				int mid ,low =0,high =(int)n;
				while(low<=high){
					mid = (int)(low+high)/2;
					if(arr[(int)mid] == temp){
						System.out.println(temp+" found at "+(mid+1));
						break;
					}
					else if(temp<arr[mid]){
						high = mid-1;
					}
					else{
						low = mid+1;
					}
				}
				if(low>high){
					System.out.println(temp+" not found");
				}
				
				
			}
		}
	
		}
	}


