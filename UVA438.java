package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA438 {




           public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              while (sc.hasNext()){
               //   String[] part = sc.nextLine().split(" ");
                 /* double x1 = Double.parseDouble(part[0]);
                  double y1 = Double.parseDouble(part[1]);

                  double x2 = Double.parseDouble(part[2]);
                  double y2 = Double.parseDouble(part[3]);

                  double x3 = Double.parseDouble(part[4]);
                  double y3 = Double.parseDouble(part[5]);

                  33330.0 -500340.4 5003220.3 1.0 0.3333 50333222220.0
*/
                  double x1 = sc.nextDouble();
                  double y1 = sc.nextDouble();

                  double x2 = sc.nextDouble();
                  double y2 = sc.nextDouble();

                  double x3 = sc.nextDouble();
                  double y3 = sc.nextDouble();


                  double a = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
                  double b = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
                  double c = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));

                  double s = (a+b+c)/2;

                  double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

                  double d = (a*b*c)/(2*area);

                  double r = d/2.0;

                  double pi = 3.141592653589793;

                  double ans = pi*d;

                  System.out.printf("%.2f\n",ans);


              }
           }
}
