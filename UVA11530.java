package UVA;
/*
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Uva 11530
 */

import java.util.Scanner;

 class UVA11530 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
	    int t;
	    String s;
	    t = sc.nextInt();
	  String bg= sc.nextLine();
	    for(int i=0;i<t;i++){
	    	s = sc.nextLine();
	    	
	    	int total =0;
	    	for(int j=0;j<s.length();j++){
	    		if(s.charAt(j)=='a'||s.charAt(j)=='d'||s.charAt(j)=='g'||s.charAt(j)=='j'||s.charAt(j)=='m'||s.charAt(j)=='p'||s.charAt(j)=='t'||s.charAt(j)=='w'||s.charAt(j)==' '){
	    			total+=1;
	    		}
	    		
	    		else if(s.charAt(j)=='b'||s.charAt(j)=='e'||s.charAt(j)=='h'||s.charAt(j)=='k'||s.charAt(j)=='n'||s.charAt(j)=='q'||s.charAt(j)=='u'||s.charAt(j)=='x'){
	    			total+=2;
	    		}
	    		else if(s.charAt(j)=='c'||s.charAt(j)=='f'||s.charAt(j)=='i'||s.charAt(j)=='l'||s.charAt(j)=='o'||s.charAt(j)=='r'||s.charAt(j)=='v'||s.charAt(j)=='y'){
	    			total+=3;
	    		}
	    		else if(s.charAt(j)=='s'||s.charAt(j)=='z'){
	    			total+=4;
	    		}
	    	}
	    	System.out.printf("Case #%d: %d\n", i+1,total);
	    }
		
	}
}
