package UVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * UVA 11661
 */

				
public class UVA11661 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = Integer.parseInt(sc.nextLine());
			// sc.nextLine();
			if (n == 0) {
				break;
			}
			String in = sc.nextLine();

			int positionOfD = -1;
			int positionOfR = -1;
			int diff = Integer.MAX_VALUE;

			for (int i = 0; i < in.length(); i++) {
				if (in.charAt(i) == 'Z') {
					diff = 0;
					break;
				} else {
					if (in.charAt(i) == 'R') {
						positionOfR = i;
					}

					else if (in.charAt(i) == 'D') {
						positionOfD = i;
					}
				}
				
				if(positionOfD!=-1 && positionOfR != -1){
					diff = Math.min(diff, Math.abs(positionOfD-positionOfR));
				}

			}

			System.out.println(diff);

		}
	}

}
