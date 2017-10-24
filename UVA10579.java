package UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class UVA10579 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int n = sc.nextInt();
		if(n==1){
			System.out.println("1");
			continue;
		}
		else if(n==2){
			System.out.println("1");
		}
		else{
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("1");
		BigInteger total = new BigInteger("0");
		for(int i = 3;i<=n;i++){
			total= b.add(c);
			
			b = c;
			c = total;
			
		}
		
		System.out.println(total);
		}
		}
	}
}
