package Step_3;
import java.util.Scanner;

public class A_plus_B_7_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Case #" + i + ": " + (b + c));
        }
    }
}
