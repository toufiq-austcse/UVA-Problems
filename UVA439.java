package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.util.*;

public class UVA439 {


        

    static class cell{
    	      int x;
    	      int y;

        public cell(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    int[] dx= {+2,+2,+1,+1,-2,-2,-1,-1};
    int[] dy ={-1,+1,-2,+2,-1,+1,-2,+2};
    Queue<cell> queue = new LinkedList<>();
    boolean[][] isVisited = new boolean[8+1][8+1];
    int[][] level = new int[8+1][8+1];
    void bfs(int sx,int sy){
        queue.add( new cell(sx,sy));
        isVisited[sx][sy] = true;
        level[sx][sy] =0;

        while (queue.size()!=0){
            cell top = queue.poll();
            //System.out.println(top.x+" "+top.y);
            for(int i=0;i<8;i++){
                int tx =top.x +dx[i];
                int ty =top.y +dy[i];
                if(tx>=0 && tx<8 && ty>=0 && ty<8 && !isVisited[tx][ty]){
                    isVisited[tx][ty] = true;
                    level[tx][ty] = level[top.x][top.y]+1;

                    queue.add( new cell(tx,ty));
                }
            }
        }
    }
           public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

               Map<Character, Integer> map = new HashMap<>();
               map.put('a', 0);
               map.put('b', 1);
               map.put('c', 2);
               map.put('d', 3);
               map.put('e', 4);
               map.put('f', 5);
               map.put('g', 6);
               map.put('h', 7);
               while (sc.hasNext()) {


                   String s = sc.nextLine();
                   UVA439 ob = new UVA439();
                   String[] part = s.split(" ");
                   int x_ = map.get(part[0].charAt(0));
                   int y_ = Integer.parseInt(Character.toString(part[0].charAt(1)));

                   int to_x_ = map.get(part[1].charAt(0));
                   int to_y_ = Integer.parseInt(Character.toString(part[1].charAt(1)));

                   ob.bfs(x_, y_ - 1);

                   System.out.println("To get from " + part[0] + " to " + part[1] + " takes " + ob.level[to_x_][to_y_ - 1] + " knight moves.");


               }
           }
}
