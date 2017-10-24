/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;
public class UVA1197 {
	
	int[] id;
	int[] sz;
	
	public UVA1197(int n ) {
		id = new int[n];
		sz = new int[n];
		
		for(int i=0;i<n;i++){
			id[i] = i;
			sz[i] = i;
		}
	}
	
	int root(int i ){
		while(i!=id[i]){
			i = id[i];
		}
		
		return i;
	}
	
	boolean isConneted(int i,int j){
		return root(i)==root(j);
	}
	
	void union(int i,int j){
		int p = root(i);
		int q = root(j);
		
		if(p==q){
			return;
		}
		
		if(sz[p]<sz[q]){
			id[p] = q;
			sz[q] +=sz[p];
		}
		else{
			id[q] = p;
			sz[p] += sz[q];
		}
	}
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0){
				break;
			}
			UVA1197 ob  = new UVA1197(n);
			int firstmmbr =0;
			
			for(int i=0;i<m;i++){
				int groupSz = sc.nextInt();
				
				for(int j=0;j<groupSz;j++){
					int mmbr = sc.nextInt();
					if(j==0){
						firstmmbr =mmbr;
					}
					else{
						ob.union(firstmmbr, mmbr);
					}
				}
				
				
				
				
			}
			
			int zeroRoot = ob.root(0);
			int total=0;
			for(int j=0;j<ob.id.length;j++){
				if(zeroRoot == ob.root(j)){
					total++;
				}
			}
			System.out.println(total);
		
		}
	}

}
