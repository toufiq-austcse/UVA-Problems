package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA problemno- 483
 */


import java.util.Scanner;

public class UVA483 {
	public static  void main (String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s= sc.nextLine();
			String[] array = s.split(" ");
			 for(int i=0;i<array.length;i++){
				 String reverse = new StringBuffer(array[i]).reverse().toString();
				 array[i] = reverse;
			 }
			 
			 for (int  i= 0; i < array.length;i ++) {
				 if(i!=array.length-1){
				System.out.print(array[i]+" ");
				 }else{
					 System.out.print(array[i]);
				 }
			}
			 System.out.println();
		}
	}
	

}
