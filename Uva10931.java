package UVA;
import java.util.Scanner;
/*
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * UVA 10931
 */

public class Uva10931
{
  public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
    while(sc.hasNext())
    {
      int n=sc.nextInt();
      if(n!=0)
      {
        String s=Integer.toBinaryString(n);
        int total=Integer.bitCount(n);
        System.out.printf("The parity of %s is %d (mod 2).\n", s, total);
      }
    }
  }
}