package UVA;

import java.util.Scanner;

public class UVA12700 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		
		
		for(int j=1;j<=t;j++){
			long n = sc.nextLong();
			sc.nextLine();
		String s = sc.nextLine();
		int b =0,w =0,ti =0,a =0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='B'){
				b++;
			}
			else if(s.charAt(i)=='W'){
				w++;
			}
			else if(s.charAt(i)=='T'){
				ti++;
			}
			else if(s.charAt(i)=='A'){
				a++;
			}
		}
	//	System.out.println(b+" "+w+" "+ti+" "+a+" ");
		
		if(a==n){ 
			System.out.printf("Case %d: ABANDONED\n",j);
		}
		else if(b+a==n){
			System.out.printf("Case %d: BANGLAWASH\n",j);
		}
		else if(w+a==n){
			System.out.printf("Case %d: WHITEWASH\n",j);
		}
		else if(b>w){
			System.out.printf("Case %d: BANGLADESH %d - %d\n",j,b,w);
		}
		else if(b<w){
			System.out.printf("Case %d: WWW %d - %d\n",j,w,b);
		}
		else{
			System.out.printf("Case %d: DRAW %d %d\n",j,w,b);
		}
		
		}
	
	}
}
