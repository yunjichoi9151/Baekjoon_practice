package Step_7;
import java.util.Scanner;

public class Honeycomb_2292 {
    public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int r, x = 0, y = 0;

        while (true) {
            if (n <= 6 * x + 1) {
                r = y + 1;
                break;
            }
            y++;
            x += y;
        }
        System.out.println(r);
	}
}
