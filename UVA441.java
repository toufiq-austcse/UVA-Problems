package UVA;

import java.util.Arrays;
import java.util.Scanner;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class UVA441 {

    static void printUtil(int[] arr,int n,int r,int index,int[] data,int i){
        if(index==r){
            for(int j=0;j<data.length;j++){
                if(j==0){
                    System.out.print(data[j]);
                }
                else {
                    System.out.print(" "+data[j] );
                }
            }
            System.out.println();
            return;
        }

        if(i>=n){
            return;
        }

        data[index] = arr[i];

        printUtil(arr, n, r, index+1, data, i+1);
        printUtil(arr,n,r,index,data,i+1);


    }

    static void PrintCombinitaion(int[] arr,int n,int r){

        int[] data = new int[r];
        printUtil(arr,n,r,0,data,0);
        //System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isfast = true;


        while (sc.hasNext()){
            int k = sc.nextInt();
            if(k==0){
                break;
            }

            if (isfast) {
                isfast = false;
            } else {
                System.out.println();
            }



            int[] in = new int[k];
            for(int i=0;i<k;i++){
                in[i] = sc.nextInt();
            }

            Arrays.sort(in);
            PrintCombinitaion(in,in.length,6);

        }
    }
}
