package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 602
 */


					
import java.util.Scanner;

public class UVA602 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String dem = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n = sc.nextInt();
		sc.nextLine();
		for(int j=0;j<n;j++){
		
		String s = sc.nextLine();
		String[] arr  = s.split("-");
		String part1 = arr[0];
		int p = part1.length()-1;
		int sum =0;
		
		for(int i=0;i<part1.length();i++){
			sum +=dem.indexOf(part1.charAt(i)) * Math.pow(26,p );
			p--;
		}
		
	//	System.out.println("SUM "+sum);
		
		int res = Math.abs(sum-Integer.parseInt(arr[1]));
		/*if(Integer.parseInt(arr[1])==0){
			System.out.println("not nice");
		}*/
		 if(res<=100){
			System.out.println("nice");
		}
		else{
			System.out.println("not nice");
		}
		}
	}

}
