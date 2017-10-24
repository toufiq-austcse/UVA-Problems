package UVA;

import java.util.Scanner;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class UVA11152 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            double s = (a + b + c) / 2.0;

            double areaOfInsideTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            double r = (areaOfInsideTriangle / s);
            double redArea = (r * r) * Math.PI;
            double violate = areaOfInsideTriangle - redArea;
            double R = ((a * b * c) / (4 * areaOfInsideTriangle));
            double OuterCircleARea = ((R * R) * Math.PI) - areaOfInsideTriangle;

            System.out.printf("%.4f %.4f %.4f\n", OuterCircleARea, violate, redArea);
        }
    }
}
