/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;

public class UVA11991 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		List<Integer> list[] = new ArrayList[1000001];
		
		while(sc.hasNext()){
			
			
			int n =sc.nextInt();
			for(int i=0;i<n;i++){
				list[i] = new ArrayList<>();
			}
			
			int m = sc.nextInt();
			for(int i=1;i<=n;i++){
				int a = sc.nextInt();
				list[a].add(i);
				
			}
			
			
			for(int i=0;i<m;i++){
			int k = sc.nextInt();
			int v = sc.nextInt();
			if(k>list[v].size()){
				System.out.println(0);
			}
			else{
				System.out.println(list[v].get(k-1));
			}
		}
			for(int i=0;i<n;i++){
				list[i].clear();
			}
		}
	}
}
