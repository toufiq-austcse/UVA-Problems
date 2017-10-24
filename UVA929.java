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

public class UVA929 {

	static class Cell implements Comparable<Cell> {

		int row,column,cost;
		
		Cell(int r,int c,int cost){
			row = r;
			column = c;
			this.cost = cost;
		}

		@Override
		public int compareTo(Cell o) {
			
			return this.cost -o.cost;
		}
		
	}
	
	public static void main(String[] arg) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(sc.readLine());
		
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(sc.readLine());
			int m = Integer.parseInt(sc.readLine());
			
			int[][] map = new int[n][m];
			int[][] cost = new int[n][m];
			
			for(int j=0;j<n;j++){
				String[] s = sc.readLine().split(" ");
				
				for(int k=0;k<m;k++){
					map[j][k] = Integer.parseInt(s[k]);
					cost[j][k] = Integer.MAX_VALUE;
					
				}
			}
			
			cost[0][0] = map[0][0];
			int[] dx = {-1,0,0,1};
			int[] dy = {0,-1,1,0};
			
			PriorityQueue<Cell> pq = new PriorityQueue<>();
			pq.offer( new Cell(0, 0, cost[0][0]));
			
			while(!pq.isEmpty()){
				Cell curr = pq.poll();
				
				if(curr.row==n-1 && curr.column==m-1){
					System.out.println(cost[n-1][m-1]);
					break;
				}
				
				for(int j=0;j<4;j++){
					int a = curr.row+dx[j];
					int b = curr.column+dy[j];
					
					if(a>=0 && a<n && b>=0 && b<m && cost[a][b]>cost[curr.row][curr.column]+map[a][b]){
						cost[a][b] = cost[curr.row][curr.column] + map[a][b];
						pq.add(new Cell(a, b, cost[a][b]));
					}
				}
			}
			
			
		}
		
	}

}
