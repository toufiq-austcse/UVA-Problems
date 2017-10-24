package UVA;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 *UVA 10110
 */

				
import java.util.Scanner;
/*
 * In this problem we need to check the factors of the last number .
 * if it has odd number of factor then out put will be 'yes'
 * else 'no'
 * Now if the given nUmber is a perfect sqres then it has /'odd'/ number of factros
 * else it has /'even'/ numbers of factor .
 * let see an example 
 * if given number is 4.it is a parfect sqre ..sqrt(4)=2 .so Its factors are 1,2,4  which is odd number.so it will be /'yes'/
 * again if given number is 7.then sqrt(7) = 2.64.... whis is not perfect sqre..and its factors are 1,7. which is even .so it will be /'no'/
 * 
 */
public class UVA10110 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		while (true){
			long n= sc.nextLong();
			if(n==0){
				break;
			}
			long val =  (long) Math.sqrt(n);
			if(val*val ==n){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
	}

}
