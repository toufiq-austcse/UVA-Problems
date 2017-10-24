package UVA;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UVA11577 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		HashMap< Character, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++){
			String s = sc.nextLine().toLowerCase().replace(" ", "");
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			
			for(int j=0;j<ch.length;j++){
				int count =0;
				
				for(int k = j+1;k<ch.length;k++){
					if(ch[j]==ch[k] && ch[j]!='0' && ch[j]>='a' && ch[j]<='z'){
						count++;
						ch[k] ='0';
					}
				}
				
				if(ch[j]>='a' && ch[j]<='z'){
				map.put(ch[j], count);
				list.add(count);
				}
			}
			
			Collections.sort(list);
			
			int size = list.size();
		   Set set = map.keySet();
			
		   Iterator it = set.iterator();
		     while(it.hasNext()){
		    	 Object key = it.next();
		    	if(map.get(key)==list.get(size-1)){
		    		System.out.print(key);
		    	}
		     }
		     System.out.println();
		}
		
		
	}

}
