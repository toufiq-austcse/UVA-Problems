package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA ,Problem No -382
 */


					
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UVA382 {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("PERFECTION OUTPUT");
		while(true){
			int n = sc.nextInt();
			String s = Integer.toString(n);
			int space = s.length();
			if(n==0){
				System.out.println("END OF OUTPUT");
				break;
			}
			List<Integer> list = new ArrayList<Integer>();
			
			for(int i=1;i<n;i++){
				if(n%i==0){
					list.add(i);
				}
			}
			
			int sum =0;
			Iterator<Integer> it= list.iterator();
			
			while(it.hasNext()){
				sum+= it.next();
			}
			
			if(sum==n){
				for(int j=1;j<=(5-space);j++){
					System.out.print(" ");
				}
				System.out.println(+n+"  PERFECT");
			}
			else if(sum<n){
				for(int j=1;j<=(5-space);j++){
					System.out.print(" ");
				}
				System.out.println(+n+"  DEFICIENT");
			}
			else if (sum>n){
				for(int j=1;j<=(5-space);j++){
					System.out.print(" ");
				}
				System.out.println(n+"  ABUNDANT");
			}
		}
	}

}
