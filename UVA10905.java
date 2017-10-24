/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */


/*
 * More precisely: compareTo for Strings 
 * returns a negative number if the first String comes before the second String – 		
 */
package UVA;
import java.util.*;
public class UVA10905 {
	
	static Comparator<String> cmp = new Comparator<String>() {
		
		@Override
		public int compare(String o1, String o2) {
			String c =o1+o2;
			String d = o2+o1;
			
			if(d.compareTo(c)>0){
				return 1;
			}
			else{
				return -1;
			}
		}
	};
	public static void main(String[] arg){
		Scanner sc =  new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		while(true){
			int n = sc.nextInt();
			
			
			if (n==0){
				break;
			}
			for(int i=0;i<n;i++){
				list.add(sc.next());
			}
			Collections.sort(list,cmp);
			
			for(String s :list){
				System.out.print(s);
			}
			System.out.println();
			list.clear();
			
		}
		
	}
}
