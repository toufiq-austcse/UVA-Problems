package UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class UVA10494 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			String[] parts = new String[2];
			if(s.contains("%")){
				parts = s.split("%");
				BigInteger a = new BigInteger(parts[0].trim());
				BigInteger b = new BigInteger(parts[1].trim());
				System.out.println(a.mod(b));
			}
			else{
				parts = s.split("/");
				BigInteger a = new BigInteger(parts[0].trim());
				BigInteger b = new BigInteger(parts[1].trim());
				System.out.println(a.divide(b));
			}
			
			
		}
	}
}
