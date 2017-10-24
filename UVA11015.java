package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.util.*;
public class UVA11015 {
    int v;

    static int Inf = 9999;


    int[][] floyedWarshal(int[][] graph){
        int[][] dist = new int[v][v];

        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                dist[i][j] = graph[i][j];
            }
        }

        //k is taken as middle node

        for(int k=0;k<v;k++){

            for(int i=0;i<v;i++){
               for(int j=0;j<v;j++){
                   dist[i][j] = Math.min(dist[i][j],dist[i][k]+dist[k][j]);
               }
            }
        }

       // printSolution(dist);
        return dist;
    }



    void printSolution(int dist[][])
    {
        System.out.println("Following matrix shows the shortest "+
                "distances between every pair of vertices");
        for (int i=0; i<v; ++i)
        {
            for (int j=0; j<v; ++j)
            {
                if (dist[i][j]==Inf)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j]+"   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=1;
        while ( sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n==0){
                break;
            }
            List<String> names = new ArrayList<>();

            for(int i=0;i<n;i++){
                names.add(sc.next());
            }
            UVA11015 ob = new UVA11015();
            ob.v = n;
            int[][] graph = new int[n][n];

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j){
                        graph[i][j] =0;
                    }
                    else {
                        graph[i][j] = Inf;
                    }
                }
            }

            for(int i=0;i<m;i++){
                int u = sc.nextInt()-1;
                int v = sc.nextInt()-1;
                int w = sc.nextInt();
                graph[u][v] = w;
                graph[v][u] = w;


            }

           int[][] dist = ob.floyedWarshal(graph);
            List<Integer> list = new ArrayList<>();
            List<Integer> distances = new ArrayList<>();

            for(int i=0;i<n;i++){
                int sum =0;
                for(int j=0;j<n;j++){
                    sum += dist[i][j];

                }
                list.add(sum);
                distances.add(sum);
            }

           Collections.sort(distances);
            int small= distances.get(0);
            System.out.print("Case #"+t+" :");

            for(int i=0;i<list.size();i++){
                if(small == list.get(i)){
                    System.out.print(" "+names.get(i));
                    break;
                }
            }
            System.out.println();
            t++;
        }
        }



}
