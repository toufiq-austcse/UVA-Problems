/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UVA12503 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int ins = sc.nextInt();
			sc.nextLine();
			
			for(int j=0;j<ins;j++){
				String s = sc.nextLine();
				if(s.equals("LEFT")){
					list.add(-1);
				}
				else if(s.equals("RIGHT")){
					list.add(1);
				}
				else{
					String[] parts = s.split(" ");
					
					list.add(list.get(Integer.parseInt(parts[2])-1));
				}
			}
			
			int total=0;
			for(int l=0;l<list.size();l++){
				total += list.get(l);
			}
			System.out.println(total);
			list.clear();
		}
	}
}
