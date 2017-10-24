package UVA;

import java.util.Scanner;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class UVA10195 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            if(a==0.0 && b==0.0 && c==0.0){
                System.out.printf("The radius of the round table is: 0.000\n");
            }
            else {

                double s = (a + b + c) / 2.0;

                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                double result = area / s;

                System.out.printf("The radius of the round table is: %.3f\n", result);
            }
        }
    }
}
