/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

package UVA;

import java.util.*;

public class UVA10591 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int t = sc.nextInt();

			for (int i = 1; i <= t; i++) {

				int n = sc.nextInt();
				int a = n;

				while (true) {
					// long b = n*n;

					String bString = Long.toString(n);
					n = 0;

					for (int j = 0; j < bString.length(); j++) {
						n += Long.parseLong(Character.toString(bString.charAt(j)))
								* Long.parseLong(Character.toString(bString.charAt(j)));

					}

					if (Long.toString(n).length() == 1) {
						if (n == 1) {
							System.out.println("Case #" + i + ": " + a + " is a Happy number.");
						} else {
							System.out.println("Case #" + i + ": " + a + " is an Unhappy number.");
						}
						break;
					}
				}
			}
		}
	}
}
