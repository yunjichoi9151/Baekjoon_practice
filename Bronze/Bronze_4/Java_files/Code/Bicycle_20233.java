import java.util.Scanner;

public class Bicycle_20233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), x = sc.nextInt(), b = sc.nextInt(), y = sc.nextInt(), t = sc.nextInt();
        if (t <= 30)
            System.out.println(a + " " + b);
        else if (t > 30 && t <= 45)
            System.out.println(a + 21 * x * (t - 30) + " " + b);
        else if (t > 45)
            System.out.println(a + 21 * x * (t - 30) + " " + (b + 21 * y * (t - 45)));
    }
}
