package UVA;

import InputOutput.InputReader;
import InputOutput.OutputWriter;

public class UVA10849T {
    public void solve(int testNumber, InputReader sc, OutputWriter out) {


    int t = sc.nextInt();
            int n = sc.nextInt();

            for (int i = 0; i < t; i++) {
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();

                int x2 = sc.nextInt();
                int y2 = sc.nextInt();

                if (x1 < 1 || y1 > n) {
                  out.println("no move");
                } else if (x1 > n || y1 < 1) {
                    out.println("no move");
                } else if (x2 < 1 && y2 > n) {
                    out.println("no move");
                } else if (x2 > n && y2 < 1) {
                    out.println("no move");
                } else if (x1 == x2 && y1 == y2) {
                    out.println("0");

                } else {
                    int difx = Math.abs(x1 - x2);
                    int dify = Math.abs(y1 - y2);

                    if (difx == dify) {
                        out.println("1");
                    } else if ((difx % 2) == (dify % 2)) {
                        out.println("2");
                    } else {
                        out.println("no move");
                    }
                }

            }

        }

    }

