/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;




import java.util.*;

public class UVA11958 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int  t = sc.nextInt();
		
		for(int i=1;i<=t;i++){
			List<Integer> list = new ArrayList<>();
			
			int k = sc.nextInt();
			sc.nextLine();
			String curT = sc.nextLine();
			String[] a = curT.split(":");
			int p1 = Integer.parseInt(a[0].trim())*60;
			int p2 = Integer.parseInt(a[1].trim());
			int totalCurT = p1+p2;
					
			
			
			for(int j=0;j<k;j++){
				String ariTime = sc.nextLine();
				
				int traT = sc.nextInt();
				sc.nextLine();
				String[] b = ariTime.split(":");
				
				int p3 = Integer.parseInt(b[0].trim())*60;
				int p4 = Integer.parseInt(b[1].trim());
				int totaAriT = p3+p4;
				
				int temp =Math.abs(totaAriT-totalCurT)+traT;
				list.add(temp);
				
				
			}
			
			Collections.sort(list);
			int ans = list.get(0);
			System.out.println("Case "+i+": "+ans);
			
		
		}
			
			
		
			
			
		
	}
}
