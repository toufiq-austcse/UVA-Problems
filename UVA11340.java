package UVA;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class UVA11340 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			HashMap<String, Integer> map = new HashMap<>();
			int k = sc.nextInt();
			
			for(int j=0;j<k;j++){
				String ch = sc.next();
				int value = sc.nextInt();
				
				map.put(ch, value);
				
			}
			
			int m = sc.nextInt();
			sc.nextLine();
			
			String[] arr =new String[m];
			for(int l=0;l<m;l++){
				
					//sc.nextLine();
					arr[l] = sc.nextLine();
					
					
				
				
			}
			
			
			int total =0;
			/*if(map.containsKey(Character.toString(arr[0].charAt(0)))){
				String temp = Character.toString(arr[0].charAt(0));
				System.out.println(map.get(temp));
			}*/
		  for(int l=0;l<m;l++){
			  for(int u=0;u<arr[l].length();u++){
				  if(map.containsKey(Character.toString(arr[l].charAt(u)))){
					 // total+=map.get(Character.toString(arr[l].charAt(u)));
					 // System.out.println(map.get(Character.toString(arr[l].charAt(u))));
					  String temp = Character.toString(arr[l].charAt(u));
						total+=map.get(temp);
				  }
			  }
		  }
		  double totalD = total*0.01;
		 System.out.printf("%.2f$\n",totalD);
		//	System.out.println(map);
		}
	}

}
