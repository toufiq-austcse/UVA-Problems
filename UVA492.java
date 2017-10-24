/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package UVA;
import java.util.*;
public class UVA492 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int count =0;
		while(sc.hasNext()){
			
			String s=new String(sc.next());
			
			String[] parts  = s.split(" ");
			
			for(int i=0;i<parts.length;i++){
				if(parts[i].charAt(0)=='A'||parts[i].charAt(0)=='E'||parts[i].charAt(0)=='I'||parts[i].charAt(0)=='O'||parts[i].charAt(0)=='U'||
						parts[i].charAt(0)=='a'||parts[i].charAt(0)=='e'||parts[i].charAt(0)=='i'||parts[i].charAt(0)=='o'||parts[i].charAt(0)=='u'){
					parts[i] +="ay";
				}
				else{
					char ap = parts[i].charAt(0);
					char[] arr = parts[i].toCharArray();
					arr[0]=' ';
					String newStri ="";
					for(int j=0;j<arr.length;j++){
						if(arr[j]!=' '){
							newStri += arr[j];
						}
						
					}
					newStri +=Character.toString(ap)+"ay";
					parts[i] = newStri;
				}
			}
			
			for(int i=0;i<parts.length;i++){
				if(parts[i].contains(".")){
					char[] arr = parts[i].toCharArray();
					String st="";
					for(int j=0;j<arr.length;j++){
						if(arr[j]!='.'){
							st+= Character.toString(arr[j]);
						}
					}
					st+=".";
					parts[i] = st;
				}
			}
			String out="";
			for(int i=0;i<parts.length;i++){
				if(i!=parts.length-1){
				System.out.print(parts[i]+" ");
				}
				else{
					System.out.println(parts[i]);
				}
				
				
			}
			
			
			
			
			
			
			
		}
	}
}
