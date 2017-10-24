package UVA;

import java.util.Scanner;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class UVA10849 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();


        for (int j = 0; j < c; j++) {
            int t = sc.nextInt();
            int n = sc.nextInt();

            for (int i = 0; i < t; i++) {
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();

                int x2 = sc.nextInt();
                int y2 = sc.nextInt();

                if (x1 < 1 || y1 > n) {
                    System.out.println("no move");
                } else if (x1 > n || y1 < 1) {
                    System.out.println("no move");
                } else if (x2 < 1 && y2 > n) {
                    System.out.println("no move");
                } else if (x2 > n && y2 < 1) {
                    System.out.println("no move");
                } else if (x1 == x2 && y1 == y2) {
                    System.out.println("0");

                } else {
                    int difx = Math.abs(x1 - x2);
                    int dify = Math.abs(y1 - y2);

                    if (difx == dify) {
                        System.out.println("1");
                    } else if ((difx % 2) == (dify % 2)) {
                        System.out.println("2");
                    } else {
                        System.out.println("no move");
                    }
                }

            }

        }
    }
}
