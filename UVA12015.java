/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

package UVA;

import java.util.*;

public class UVA12015 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int t = Integer.parseInt(sc.nextLine());

			for (int i = 1; i <= t; i++) {
				ArrayList<String> arr[] = new ArrayList[10];
				for (int l = 0; l < 10; l++) {
					arr[l] = new ArrayList<>();
				}

				int[] value = new int[10];
				for (int j = 0; j < 10; j++) {
					String s = sc.nextLine();

					String[] parts = s.split(" ");
					value[j] = Integer.parseInt(parts[1]);
					arr[j].add(parts[0]);
					arr[j].add(parts[1]);

				}

				Arrays.sort(value);
				System.out.println("Case #" + i + ":");
				for (int k = 0; k < arr.length; k++) {
					if (Integer.parseInt(arr[k].get(1)) == value[value.length - 1]) {
						System.out.println(arr[k].get(0));
					}
				}
			}
		}
	}
}
