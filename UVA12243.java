package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 *UVA 12243
 */

				
import java.util.Scanner;

public class UVA12243 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.nextLine().toLowerCase();
			if(s.equals("*")){
				break;
			}
			
			String[] parts = s.split(" ");
			Boolean isSame = true;
			for(int i=0;;i++){
				if(i+1 <parts.length ){
					if(parts[i].charAt(0)!= parts[i+1].charAt(0)){
						isSame = false;
						break;
					}
				}
				if(i==parts.length){
					break;
				}
			}
			if(isSame){
				System.out.println("Y");
			}
			else{
				System.out.println("N");
			}
		}
	}

}
