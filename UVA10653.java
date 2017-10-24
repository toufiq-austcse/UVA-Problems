package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA10653 {

    static class cell{
        int x,y;

        public cell(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


 /*static    boolean isVisited[][];
   static int level[][];*/

     int [] dx ={+1,0,-1,0};
     int [] dy ={0,+1,0,-1};

    /*static int r;
    static int c;
*/


    int bfs(int sx,int sy,boolean[][] isVisited,int[][] level,int r,int c){


        Queue<cell> queue = new LinkedList<>();

        queue.add(new cell(sx,sy));
        isVisited[sx][sy] = true;
        level[sx][sy] =0;

        while (!queue.isEmpty()){
            cell top = queue.poll();
           // System.out.println(top.x+" "+top.y);

            for(int i=0;i<4;i++){
                int tx = top.x+dx[i];
                int ty = top.y+dy[i];

                if(tx>=0 && tx<c && ty>=0 && ty<r && !isVisited[tx][ty]){
                    isVisited[tx][ty] = true;
                    level[tx][ty] = level[top.x][top.y]+1;
                    queue.add(new cell(tx,ty));
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
      // Scanner sc = new Scanner(System.in);
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));

      // int r,c;
       while (true){

           int r = Integer.parseInt(sc.readLine());
           int c =Integer.parseInt(sc.readLine());
          int[][] level = new int[r][c];
          UVA10653 ob = new UVA10653();
          boolean[][] isVisited = new boolean[r][c];
           int containingBomb = Integer.parseInt(sc.readLine());

           for(int i=0;i<containingBomb;i++){
               int row =Integer.parseInt(sc.readLine());
               int bombColumn = Integer.parseInt(sc.readLine());

               for(int j=0;j<bombColumn;j++){
                   int colmn =Integer.parseInt(sc.readLine());
                   isVisited[row][colmn] = true;
               }
           }

           int startX =Integer.parseInt(sc.readLine());
           int startY = Integer.parseInt(sc.readLine());

           int endX =Integer.parseInt(sc.readLine());
           int endY =Integer.parseInt(sc.readLine());
           ob.bfs(startX,startY,isVisited,level,r,c);

           int d =level[endX][endY];
           System.out.println(d);


       }



    }


}
