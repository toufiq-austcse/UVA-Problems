package UVA;

import java.util.Scanner;

public class UVA12403 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		int total = 0;
		for(int i=0;i<t;i++){
			String s= sc.nextLine();
			
			if(!s.contains("report")){
				String[] part = s.split(" ");
				int tk = Integer.parseInt(part[1]);
				total+=tk;
				
			}
			else{
				System.out.println(total);
			}
			
		}
	}
}
