package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/


import java.util.*;
public class UVA10611 {
   static int l, r;

  static int up(int start,int end,int x,int[] arr){
      while (start<=end){
          int mid = (start+end)/2;

          if(arr[mid]<=x){
              start = mid+1;
          }
          else {
              end = mid-1;
          }
      }

      if(start>arr.length-1){
          return -1;
      }

      return arr[start];

  }

  static int down(int start,int end,int x,int[] arr){
      while (start<=end){
          int mid = (start+end)/2;

          if(arr[mid]<x){
              start = mid+1;
          }
          else{
              end = mid-1;
          }

      }

      if(end<0){
          return -1;
      }

      return arr[end];
  }

           public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);


                   int n = sc.nextInt();

                int[] arr = new int[n];
                   for (int i = 0; i < n; i++) {
                      arr[i] = sc.nextInt();
                   }

                   int q = sc.nextInt();

                   for (int j = 0; j < q; j++) {

                       int height = sc.nextInt();

                       int min = down(0,n-1,height,arr);
                       int max = up(0,n-1,height,arr);

                       if(min==-1 && max==-1){
                           System.out.println("X X");
                       }
                       else if(min>-1 && max==-1){
                           System.out.println(min+" X");
                       }
                       else if(min==-1 && max>-1){
                           System.out.println("X "+max);
                       }
                       else{
                           System.out.println(min+" "+max);
                       }


                   }
               }

}
