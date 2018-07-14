package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class UVA1586 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<Character, Double> map = new HashMap<Character, Double>();
        map.put('C', 12.01);
        map.put('H', 1.008);
        map.put('O', 16.00);
        map.put('N', 14.01);

       // File file= new File("input.txt");
        Scanner sc = new Scanner(System.in);
       // Scanner sc = new Scanner(new FileInputStream(file));
        int test = sc.nextInt();

        while (test > 0) {
            String s = sc.next();
            double mass = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c) == true) {
                    continue;
                }
                if (i + 1 < s.length()) {
                    int flag = 0;
                    char d = s.charAt(i + 1);
                    char e = '1';
                    if (i + 2 < s.length()) {
                        if (Character.isDigit(s.charAt(i + 2)) == true) {
                            flag = 1;
                            e = s.charAt(i + 2);
                        }
                    }
                    if (Character.isDigit(d) == true) {
                        double temp = map.get(c);
                        int value = Integer.valueOf(d) - 48;
                        if (flag == 1) {
                            int value2 = Integer.valueOf(e) - 48;
                            value = value * 10;
                            value += value2;
                        }
                        double product = temp * value;
                        temp = product;
                        mass += temp;
                    } else {
                        mass += map.get(c);
                    }

                } else {
                    mass += map.get(c);
                    //System.out.println("mass is "+mass);
                }
            }
            System.out.format("%.3f", mass);
            System.out.println("");
            test -= 1;
        }
    }


}