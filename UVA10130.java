package UVA;

import java.io.*;
import java.util.*;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class UVA10130 {
    //package InputOutput;


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

    	      String nextLine(){
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






   static int knapsack(int[] weight,int[] value,int n,int capacity){
        int[][] arr = new int[n+1][capacity+1];



        for(int i=0;i<=n;i++){
            for(int j=0;j<=capacity;j++){
                if(i==0 || j==0){
                    arr[i][j] =0;
                }

                else if(weight[i-1]<=j){
                    arr[i][j] = Math.max(arr[i-1][j],value[i-1]+arr[i-1][j-weight[i-1]]);
                }
                else{
                    arr[i][j] = arr[i-1][j];
                }
            }
        }

        return arr[n][capacity];
    }

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            int numberOfobjects = sc.nextInt();
            int price[] = new int[numberOfobjects];
            int[] weight = new int[numberOfobjects];

            for(int j=0;j<numberOfobjects;j++){
                price[j] = sc.nextInt();
                weight[j] = sc.nextInt();

            }

            int g = sc.nextInt();
            int maxCapacity[] = new int[g];

            for(int k=0;k<g;k++){
                maxCapacity[k] = sc.nextInt();
            }

            int total =0;

            for(int j=0;j<maxCapacity.length;j++){
                total += knapsack(weight,price,numberOfobjects,maxCapacity[j]);
            }

            System.out.println(total);

        }


    }



}
