/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;
public class UVA11550 {

	public static void main(String[] arg){
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			List<Integer> list[] = new ArrayList[m];
			for(int j=0;j<m;j++){
				list[j]= new ArrayList<>();
			}
			
			for(int j=0;j<n;j++){
				for(int k=0;k<m;k++){
					int a = sc.nextInt();
					list[k].add(a);
				}
			}
			
			List<String> edges = new ArrayList<>();
			boolean flag = true;
			for(int j=0;j<m;j++){
				String edge ="";
				for(int l=0;l<list[j].size();l++){
					if(list[j].get(l)==1){
						edge+=l;
					}
				}
				if(edge.length()==3){
					System.out.println("No");
					flag = false;
					break;
				}
				else if(edges.contains(edge)){
					System.out.println("No");
					flag= false;
					break;
				}
				else{
					edges.add(edge);
				}
			}
			
			if(flag){
				System.out.println("Yes");
			}
			
		}
			
		}
	
}
