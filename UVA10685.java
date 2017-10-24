package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.util.*;

public class UVA10685 {

    //Code for Faster Input
    public static class MyScanner {

        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------

    int id[];


    UVA10685(int n) {
        id = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;

        }
    }

    int root(int i){
        while (i!=id[i]){
            i = id[i];

        }
        return i;
    }

    boolean isConnected(int p,int q){
        return (root(p)==root(q));

    }

    void union(int p,int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;

    }


    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        while (true) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n == 0 && k == 0) {
                break;
            }
            UVA10685 ob = new UVA10685(n);
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                map.put(s, i);
            }

            for(int i=0;i<k;i++){
                String chaine = sc.nextLine().trim();
                String [] part = chaine.split(" ");
                int u = map.get(part[0]);
                int v = map.get(part[1]);
                if(!ob.isConnected(u,v)){
                    ob.union(u,v);
                }
            }

            int[] parent = new int[n];
            for(int i=0;i<n;i++){
                parent[i] = ob.root(i);

            }

           int res =-1;

            for(int i=0;i<parent.length;i++){
                int a = parent[i];
                int co =0;
                for(int j=0;j<parent.length;j++){
                    if(a==parent[j] && parent[j]!=Integer.MAX_VALUE){
                        co++;
                        parent[j] = Integer.MAX_VALUE;
                    }
                    res = Math.max(res,co);
                }
            }

            System.out.println(res);



        }
    }
}
