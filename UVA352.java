package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
import java.math.*;
public class UVA352 {
    static int ROW;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int image =1;
        while (sc.hasNext()){
            ROW = sc.nextInt();
            String[] maze = new String[ROW];

            for(int i=0;i<ROW;i++){

                    maze[i] = sc.next();

            }

            boolean isVisited[][] = new boolean[ROW][ROW];

            int count =0;

            for(int i=0;i<ROW;i++){
                for(int j=0;j<ROW;j++){
                    if(maze[i].charAt(j)=='1' && !isVisited[i][j]){
                      //  System.out.println("Calling for "+i+","+j);
                        DFS(maze,isVisited,i,j);
                        count++;
                    }
                }
            }

            System.out.println("Image number "+image+" contains "+count+" war eagles.");
            image++;
        }

    }

    static boolean isSafe(int row,int column,String[] maze,boolean[][] isVisited){
     return (row>=0)&&(column>=0)&&(row<ROW) && (column<ROW) && (maze[row].charAt(column)=='1' && !isVisited[row][column]);
    }

    static void DFS(String[] maze,boolean[][] isVisited,int row,int column){

        int[] rowNumber =   {-1,-1,-1,0,0,1,1,1};
        int[] columnNumber ={-1,0,1,-1,1,-1,0,1};

        isVisited[row][column] = true;

        for(int i=0;i<8;i++){
            if(isSafe(row+rowNumber[i],column+columnNumber[i],maze,isVisited)){
                DFS(maze,isVisited,row+rowNumber[i],column+columnNumber[i]);
            }

        }
    }
}
