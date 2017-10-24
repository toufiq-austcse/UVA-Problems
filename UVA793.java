/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class UVA793 {
	int[] id;
	int[] sz;
	UVA793(int n){
		id = new int[n];
		sz = new int[n];
		for(int i=0;i<n;i++){
			id[i] = i;
			sz[i] = i;
		}
	}
	
	int root(int i){
		while(id[i]!=i){
			i = id[i];
		}
		
		return i;
		
	}
	boolean connected (int p,int q){
		return root(p)==root(q);
	}
	
	void union(int p,int q){
		int i = root(p);
		int j = root(q);
		
		if(i==j){
			return ;
		}
		
		if(sz[i]<sz[j]){
			id[i] = j;
			sz[j]+= sz[i];
		}
		else{
			id[j]= i;
			sz[i] += sz[j];
		}
		
	}

	public static void main(String[] arg) throws Exception{
		//Scanner sc = new Scanner(System.in);
		   BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(sc.readLine());
		//System.out.println();
		sc.readLine();
		
		while(t!=0){
			int n= Integer.parseInt(sc.readLine());
			UVA793 ob = new UVA793(n);
			int suc=0,unsuc=-0;
			String s ;
			while((s = sc.readLine())!=null && !s.equals("")){
				String part[] = s.split(" ");
				if(part[0].equals("c")){
					ob.union(Integer.parseInt(part[1])-1, Integer.parseInt(part[2])-1);
				}
				else{
					if(ob.connected(Integer.parseInt(part[1])-1, Integer.parseInt(part[2])-1)){
						suc++;
					}
					else{
						unsuc++;
					}
				}
				
			}
			System.out.println(suc+ ","+unsuc);
			t--;
			if(t!=0){
				System.out.println();
			}
			
		}
	}
}
